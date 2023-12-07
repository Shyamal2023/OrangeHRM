package mavenpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PaytmUtil {
	static Properties prop = new Properties();

	static WebDriver driver1;


	// Click method
	public static void clickXpath(String xpath_str) {

		driver1.findElement(By.xpath(xpath_str)).click();

	}

	// Xpath method
	public static WebElement xpath(String xpath_str) {

		WebElement element = driver1.findElement(By.xpath(xpath_str));
		return element;
	}

	// Sendkeys method
	public static void sendKeys(String xpath_str, String str_text) {
		WebElement element = driver1.findElement(By.xpath(xpath_str));
		//element.clear();
		element.sendKeys(str_text);
	}
	
	@SuppressWarnings("deprecation")
	public static void manageWindow() throws IOException
	{
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver1.get(readPropertiesFile("TestURL"));

	}
	
	public static void close()
	{ 
		/*JavascriptExecutor j = (JavascriptExecutor)driver1;
	      if (j.executeScript("return document.readyState").toString().equals("complete")){
	         System.out.println("Page has loaded");
	      } */   
	      
	      driver1.close();
	
	}

	// launch Chrome method
	public static WebDriver launchChrome() throws IOException {

		driver1 = new ChromeDriver();
		return driver1;
	}

	// launch firefox method
	public static WebDriver launchFirefox() throws IOException {
		driver1 = new FirefoxDriver();
		return driver1;
	}
	
	

	// Read Properties file
	public static String readPropertiesFile(String str_key) throws IOException {
       
		InputStream input = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\PaytmFlightconfig.properties");
		prop.load(input);

		String value = prop.getProperty(str_key);

		return value;
	}
}
