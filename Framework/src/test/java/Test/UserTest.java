
package Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

import pages.Userpage;

//@Listeners(name=Test.Listener.class)
public class UserTest extends BaseTest {

	Userpage upage;
	@Test
	public void userTest() throws Exception
	{
		
		upage=PageFactory.initElements(driver, Userpage.class);
	upage.addUser();
		upage.deleteUser();
	upage.updateUser();
		//Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
	
	
}
