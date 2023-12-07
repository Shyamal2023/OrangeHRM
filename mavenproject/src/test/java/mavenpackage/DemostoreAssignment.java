package mavenpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DemostoreAssignment {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			
			driver.get("https://demostore.x-cart.com/");
			
			//driver.findElement(By.xpath("//span[text()='$299.00']")).click();
			WebElement price = driver.findElement(By.xpath("//a[text()='Google Home Mini [Variants] [Attributes & Options]']/following::span[text()='$299.00']"));
	        System.out.println(price.getText());
	        
	        driver.close();
		}

	}


