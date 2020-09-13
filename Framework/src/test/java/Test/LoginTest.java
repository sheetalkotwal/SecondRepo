
package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;


public class LoginTest extends BaseTest {

	LoginPage lpage;
	@Test(dataProvider = "Login",dataProviderClass =DataProvider.class )
	public void loginWithValidTest(String user, String password)
	{
		
		lpage=PageFactory.initElements(driver, LoginPage.class);
	//	test.log(LogStatus.INFO, "Enter Usernme");
		lpage.logInWithValidCreds(user,password);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		System.out.println("Git changes");
		System.out.println("Git changes again done");
	}
	
	
/*@Test
	/*public void loginWithInValidTest()
	{
		
		lpage=PageFactory.initElements(driver, LoginPage.class);
	//	test.log(LogStatus.INFO, "Enter Usernme");
		lpage.logInWithInValidCreds();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
	@Test
	public void logInWithInValidUser()
	{
		
		lpage=PageFactory.initElements(driver, LoginPage.class);
		lpage.logInWithInValidUser();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
	@Test
	public void logInWithInValidPass()
	{
		
		lpage=PageFactory.initElements(driver, LoginPage.class);
		lpage.logInWithInValidPass();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));*/
	}
	

