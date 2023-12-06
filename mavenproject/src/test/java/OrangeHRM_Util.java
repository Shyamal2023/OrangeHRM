import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM_Util {
	
	static WebDriver driver1;
	static Properties prop = new Properties();
	OrangeHRM_xpath xpath = new OrangeHRM_xpath();
	
	
	@SuppressWarnings({ "deprecation", "null" })
	public static WebDriver launchChromeBrowser()
	{   
	    
		driver1 = new ChromeDriver();
		return driver1;
	}
	
	public static WebDriver launchFirefoxBrowser()
	{   
	    
		driver1 = new FirefoxDriver();
		return driver1;
	}
	
	public static void manageWindow()
		{
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    }
	    
	
	
	public static void click(String str_xpath)
	{
		driver1.findElement(By.xpath(str_xpath)).click();
	}
	
	public static void sendkeys(String str_xpath,String str_text)
	{
		WebElement ele = driver1.findElement(By.xpath(str_xpath));
		ele.clear();
		ele.sendKeys(str_text);
		
		}
	
	public static WebElement xpath(String str_xpath)
	{
		WebElement ele =driver1.findElement(By.xpath(str_xpath));
		return ele;
	}
	
	public static String getText(String str_xpath)
	{
		return driver1.findElement(By.xpath(str_xpath)).getText();
		
			
	}
	
	public  void Login(String str_url,String username, String password, String str_xpath) throws Exception
	{
		driver1.get(str_url);
		sendkeys(xpath.username,username);
		sendkeys(xpath.password, password);
		click(xpath.login);
		driver1.findElement(By.xpath(str_xpath)).isDisplayed();
      }
		
			
		
	
	
	public static void logout()
	{
		driver1.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver1.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	public static void closeWindow()
	{
		driver1.close();
	}
	
	
	public static String readPropertiesFile(String str_key) throws Exception
	{
	  InputStream input = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\OrangeHrmconfig.properties");
	  prop.load(input);
	  String value = prop.getProperty(str_key);
	  
	  return value;
	}

}
