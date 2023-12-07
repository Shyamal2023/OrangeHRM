package mavenpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxPaytm {
	static Properties prop = new Properties();
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver1;
		
		driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		driver1.get("https://www.google.com/");
		
		

}
