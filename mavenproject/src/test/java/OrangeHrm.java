import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class OrangeHrm {
    WebDriver driver;
	OrangeHRM_Util util = new OrangeHRM_Util();
	OrangeHRM_xpath xpath = new OrangeHRM_xpath();
	SoftAssert softAssert = new SoftAssert(); 
	
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	 ExtentReports extent = new ExtentReports();
	
   

	
	
	@SuppressWarnings("static-access")
	@BeforeTest
	
	public void launchBrowser() throws Exception
	{
	  if(util.readPropertiesFile("Browser").equalsIgnoreCase("Chrome"))
	  {
		  util.launchChromeBrowser();
	  }
	  else
	  {
		  util.launchFirefoxBrowser();
	  		
	 }
	  util.manageWindow();
	}
	
	
			
	@SuppressWarnings("static-access")
	@Test(priority=0)
	public  void validLoginCredentials() throws Exception
	{
		 extent.attachReporter(htmlReporter);
		 ExtentTest test = extent.createTest("validLoginCredentials", "Sample description");
		 
		   test.info("This step shows usage of info(details)");
		   
		util.Login(util.readPropertiesFile("testurl"),util.readPropertiesFile("validUsername"),util.readPropertiesFile("validPassword"), xpath.dashboard);
		test.log(Status.INFO, "Trying to Login");
		String expected = "Dashboard";
		String actual = xpath.dashboard;
		
		softAssert.assertEquals(actual, expected);
		test.log(Status.PASS, "Login successful");
		//System.out.println("Login Successfull");
		util.logout();
		extent.flush();
		Thread.sleep(30);
	}
	
	
	@SuppressWarnings("static-access")
	//@Test(priority=1)
	public void invalidUsername() throws Exception
	{
		util.Login(util.readPropertiesFile("testurl"), util.readPropertiesFile("invalidUsername"), util.readPropertiesFile("validPassword"), xpath.invalidCredentials);
		String expected = "Invalid credentials";
		String actual = xpath.invalidCredentials;
		softAssert.assertEquals(actual, expected);
		System.out.println("Invalid Username");
		Thread.sleep(30);
		
		
	}
	
	
	@SuppressWarnings("static-access")
	//@Test(priority=2)
	public void invalidPassword() throws Exception
	{
		util.Login(util.readPropertiesFile("testurl"), util.readPropertiesFile("validUsername"), util.readPropertiesFile("invalidPassword"), xpath.invalidCredentials);
		String expected = "Invalid credentials";
		String actual = xpath.invalidCredentials;
		softAssert.assertEquals(actual, expected);
		System.out.println("Invalid Password");
		Thread.sleep(30);
	}
	

	@SuppressWarnings("static-access")
	//@Test(priority=3)
	public void Blankcredentials() throws Exception
	{
		util.Login(util.readPropertiesFile("testurl"), util.readPropertiesFile("blankUsername"), util.readPropertiesFile("blankPassword"), xpath.required);
		String expected = "Required";
		String actual = xpath.required;
		softAssert.assertEquals(actual, expected);
		System.out.println("UserName Required");
		Thread.sleep(30);
	}
	
 
	
	@SuppressWarnings("static-access")
	//@Test(priority=4)
	public void verifyAdmin() throws Exception
	{
		util.Login(util.readPropertiesFile("testurl"),util.readPropertiesFile("validUsername"),util.readPropertiesFile("validPassword"), xpath.dashboard);
		util.click(xpath.admin);
		String expected = "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		
		String actual = util.driver1.getCurrentUrl();
		Assert.assertEquals(expected,actual);
		System.out.println("Admin page loads successfully");
		Thread.sleep(30);
	}
	
	@SuppressWarnings("static-access")
	//@Test(priority=5)
	public void verifyPIM() throws InterruptedException
	{
		util.click(xpath.pim);
		String expected = "PIM";
		String actual = util.getText(xpath.pim_actual);
		Assert.assertEquals(expected,actual);
		System.out.println("PIM  page loads successfully");
		Thread.sleep(30);
	}
	
	@SuppressWarnings("static-access")
	//@Test(priority=6)
	public void verifyLeave() throws InterruptedException
	{
		util.click(xpath.leave);
		String expected = "Leave";
		String actual = util.getText(xpath.leave_actual);
		Assert.assertEquals(expected,actual);
		System.out.println("Leave page loads successfully");
		Thread.sleep(30);
	}
	
	@SuppressWarnings("static-access")
	//@Test(priority=7)
	public void verifyTime() throws InterruptedException
	{
		util.click(xpath.time);
		String expected = "Time";
		String actual = util.getText(xpath.time_actual);
		Assert.assertEquals(expected,actual);
		System.out.println("Time page loads successfully");
		Thread.sleep(30);
	}
	
	@SuppressWarnings("static-access")
	//@Test(priority=8)
	public void logout()
	{
		util.logout();
	}
	
	
}

