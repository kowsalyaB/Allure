package Acu.ResumeTracker.PageClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class Resume_LoginClass_1 {

	WebDriver driver;
	public Resume_LoginClass_1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	@CacheLookup
	WebElement UserName;

	@FindBy(id="password")
	@CacheLookup
	WebElement PassWord;

	@FindBy(id="group")
	WebElement Role;

	@FindBy(xpath="//input[@name='submit']")
	WebElement SignIn;

	@FindBy(xpath="//a//img")
	WebElement LogOut;
	
	@Step("Enter User Name :{0}")
	public void setUserName(String Name)
	{
		UserName.sendKeys(Name);
	}
	
	@Step("Enter Pass Word :{0}")
	public void setPassWord(String Pass)
	{
		PassWord.sendKeys(Pass);
	}
	
	@Step("Select Drop Down Value")
	public void selectRole(String DropRole)
	{
		Role.sendKeys(Keys.ENTER+DropRole+Keys.ENTER);
	}
	
	@Step("Click on Submit button")
	public void Submit()
	{
		SignIn.click();
	}
	
	@Step("Log Out Screen")
	public void Logout()
	{
		LogOut.click();
	}

}
