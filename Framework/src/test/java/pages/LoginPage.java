
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestListener;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Test.BaseTest;



public class LoginPage extends BaseTest  {

	
	
	
	
	
	
	WebDriver dr;
	//ExtentTest test;
	
	@FindBy(id="txtUsername") WebElement txtusername;
	@FindBy(xpath="//input[@id='txtPassword']") WebElement txtpassword;
	@FindBy(id="btnLogin") WebElement btnlogin ;
	
	
	public LoginPage(WebDriver driver)
	{
		dr=driver;
		//this.test=test;
	}
	
	
	public void logInWithValidCreds(String user, String password)
	{
		test.log(LogStatus.INFO, "Enter Usernme");
		txtusername.sendKeys(user);
		test.log(LogStatus.INFO, "Enter password");
		txtpassword.sendKeys(password);
		test.log(LogStatus.INFO, "Click Login");
		btnlogin.click();
	}
	
	public void logInWithInValidUser()
	{
		
		txtusername.sendKeys("Admin12");
		txtpassword.sendKeys("admin123");
		btnlogin.click();
	}
	public void logInWithInValidPass()
	{
		txtusername.sendKeys("Admin");
		txtpassword.sendKeys("admin13");
		btnlogin.click();
	}
	public void logInWithInValidCreds()
	{
		txtusername.sendKeys("Admin45");
		txtpassword.sendKeys("admin15723");
		btnlogin.click();
	}
	
	
	
	
	
	
}

