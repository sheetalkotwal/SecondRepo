package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {

	String browsername;
	static WebDriver driver;
  public   static ExtentReports extent=new ExtentReports(System.getProperty("user.dir")+"/Report/MyReport.html",true);;
   public  static ExtentTest test;

	@BeforeSuite
	public void setup() throws IOException
	{ 
		
		
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ppatil\\Downloads\\chromedriver_win32\\chromedriver.exe");
File f=new File(System.getProperty("user.dir")+ "\\Properties.properties");
FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
browsername=prop.getProperty("browser");
		//browsername=System.getProperty("browser");

	if(browsername.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		
	}
	else 
	{
		driver=new FirefoxDriver();
	
	}
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	}

}