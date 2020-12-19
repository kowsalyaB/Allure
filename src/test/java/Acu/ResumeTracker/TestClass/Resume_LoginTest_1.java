package Acu.ResumeTracker.TestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Acu.ResumeTracker.PageClass.Resume_LoginClass_1;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

@Listeners({Acu.ResumeTracker.TestClass.AllureReporting.class})
public class Resume_LoginTest_1 extends TestBaseClass_1{
	
	Resume_LoginClass_1 login;

	@BeforeClass(description = "Launch URL Once Before Start All Tests")
	public void openUrl() 
	{
		driver.get(URL);
	}
	
	@Test(priority = 1,description = "Enter UserName")
	@Description("Enter Valid User Name")
	@Epic("ART003")
	@Feature("Feature : Login")
	@Story("Story : Successfully Entered User Name")
	@Severity(SeverityLevel.CRITICAL)
	public void EnterName()
	{
		login=new Resume_LoginClass_1(driver);
		login.setUserName(UserName);
	}
	
	@Test(priority = 2,description = "Enter PassWord")
	@Description("Enter Valid PassName")
	@Epic("ART004")
	@Feature("Feature : Login")
	@Story("Story : Successfully Entered PassName")
	@Severity(SeverityLevel.CRITICAL)
	public void EnterPass()
	{
		login=new Resume_LoginClass_1(driver);	
		login.setPassWord(PassWord);
	}
	
	@Test(priority = 3,description = "Select Role From DropDown")
	@Description("Select 'Recruiter' Role From DropDown")
	@Epic("ART005")
	@Feature("Feature : Login")
	@Story("Story : Successfully Selected Role From DropDown")
	@Severity(SeverityLevel.CRITICAL)
	public void Role()
	{
		login=new Resume_LoginClass_1(driver);	
		login.selectRole("Recruiter");
	}

	@Test(priority = 4,description = "Click Sign in Button and Check Valid or Invalid Login")
	@Description("Once Clicked Signin Button Check Whether Logged-in is Valid or Not")
	@Epic("ART006")
	@Feature("Feature : Login")
	@Story("Story : Successfully Login")
	@Severity(SeverityLevel.CRITICAL)
	public void Logintest() throws IOException
	{
		login.Submit();
		String title=driver.getTitle();
		if(title.equals("Applicant Tracker"))
		{
		Assert.assertTrue(true);	
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

	@AfterClass(description = "Delete the Cookies Once Done All Tests")
	public void CookiesDelete()
	{
		driver.manage().deleteAllCookies();
	}

}
