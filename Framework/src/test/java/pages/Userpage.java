
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import Test.BaseTest;

public class Userpage extends BaseTest {

	
	WebDriver dr;
	
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']") WebElement menuadmin;
	@FindBy(name="btnAdd") WebElement adduser;
	@FindBy(id="systemUser_userType") WebElement drpuserrole ;
	@FindBy(id="systemUser_employeeName_empName") WebElement txtempname;
	@FindBy(id="systemUser_userName") WebElement txtusername;
	@FindBy(id="systemUser_status") WebElement drpstatus ;
	@FindBy(id="systemUser_password") WebElement txtpaswd;
	@FindBy(id="systemUser_confirmPassword") WebElement txtconpaswd; 
	@FindBy(id="btnSave") WebElement btnsave;
	@FindBy(xpath="(//div[contains(text(),'Successfully Saved')])[2]") WebElement messagesave;
	
	//div[contains(text(),'Successfully Saved')]
	
	
	@FindBy(id="searchSystemUser_userName") WebElement txtsearchuname;
	@FindBy(id="searchBtn") WebElement btnsearch;
	@FindBy(xpath="//a[text()='annah']/parent::td/preceding-sibling::td/input[@name='chkSelectRow[]']") WebElement checkuname;
	@FindBy(id="btnDelete") WebElement btndelete;
	@FindBy(xpath="(//input[@value='Ok'])[2]") WebElement btnok;
	@FindBy(linkText = "steven.edwards") WebElement linkname;
	@FindBy(xpath="//input[@value='Edit']") WebElement btnedit;
	@FindBy(xpath="//input[@value='Save']") WebElement btneditsave;
	@FindBy(xpath="(//div[contains(text(),'Successfully Deleted')])[2]") WebElement messagedelete;
	@FindBy(xpath="//div[contains(text(),'Successfully Updated')]") WebElement messageupdate;
	//String text="kevin";
	
	
	public Userpage(WebDriver driver)
	{
		dr=driver;
	}
	
	
	public void addUser() throws Exception
	{
		menuadmin.click();
		adduser.click();
		//new Select(driver.finElement(By.id("")).select
	  new Select(drpuserrole).selectByVisibleText("Admin");
		txtempname.sendKeys("Thomas Fleming");
		txtusername.sendKeys("tho1905q89");
		new Select (drpstatus).selectByVisibleText("Enabled");
		txtpaswd.sendKeys("Test123!");
		txtconpaswd.sendKeys("Test123!");
		btnsave.click();
		Thread.sleep(1000);
		String message= messagesave.getText();
		System.out.println(message);
		Assert.assertTrue(message.contains("Saved"));
		
	}
	
	public void deleteUser() throws Exception
	{
		//txtsearchuname.sendKeys("kevin");
		//btnsearch.click();
		test.log(LogStatus.INFO, "Click Admin Menu");
		menuadmin.click();
		checkuname.click();
		test.log(LogStatus.INFO, "Click Delete Button");
		btndelete.click();
		btnok.click();
		
		String message= messagedelete.getText();
		System.out.println(message);
		Assert.assertTrue(message.contains("Deleted"));
		
	}
	
	
	public void updateUser() throws Exception
	{
		menuadmin.click();
		linkname.click();
		btnedit.click();
		
		txtusername.sendKeys("steven.edwards12");
		btneditsave.click();
		Thread.sleep(1000);
		String message= messageupdate.getText();
		System.out.println(message);
		Assert.assertTrue(message.contains("Updated"));
	}
}

	
	

