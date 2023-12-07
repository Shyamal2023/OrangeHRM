package MyPackage;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class blockPopUp {
	
	@Test()
	public static void popup()
	{
	//WebDriverManager.chromedriver().setup();
	ChromeOptions opt = new ChromeOptions();
	opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
	WebDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	
	}
	

}
