package Acu.ResumeTracker.TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import Acu.ResumeTracker.Utilities.ReadConfig;

public class TestBaseClass_1 extends BaseClass{

	ReadConfig configPro= new ReadConfig();
	public String URL=configPro.GetApplicationUrl();
	public String UserName=configPro.GetUserName();
	public String PassWord=configPro.GetPassWord();

	public WebDriver driver;

	@BeforeTest(description = "Initialize Chrome Before Strat all Class to Execute")
	public void setUp()
	{
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
	}

	@AfterTest(description = "Quite the Browser Once Done All Classes Have Done")
	public void tearDown() 
	{ 
		driver.quit();
	}


}
