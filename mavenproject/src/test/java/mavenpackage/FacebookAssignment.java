package mavenpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookAssignment {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
			
			//Facebook logo
			driver.findElement(By.cssSelector("img[src=\"https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg\"]"));
			
			//Text under Facebook logo
			driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
			
			//Email address or phone no. 
			driver.findElement(By.xpath("//input[@id='email']"));
			
			//password
			driver.findElement(By.xpath("//div[@id='passContainer']"));
			
			//Log in button
			driver.findElement(By.xpath("//button[text()='Log in']"));
			
			//Forgotten password
			driver.findElement(By.linkText("Forgotten password?"));
			
			//Click new Account
			driver.findElement(By.xpath("//a[text()='Create new account']"));
			
			//Create a page link
			driver.findElement(By.linkText("Create a Page"));

			System.out.println("Successful");
			
			Thread.sleep(3000);
			
			//close the webpage
			driver.close();
			
		}

	}


