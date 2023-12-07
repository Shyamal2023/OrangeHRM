package MyPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class autoIT_fileupload {
	@Test
	public void uploadFile() throws Exception
	{
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("file:///C:/Users/shyam/Desktop/fileupload.html");
	  //driver.findElement(By.xpath("//input")).click();
	  driver.findElement(By.id("1")).click();
	  Runtime.getRuntime().exec("C:\\Users\\shyam\\Desktop\\AutoIT\\FileUpload.exe");
	  
	}

}
