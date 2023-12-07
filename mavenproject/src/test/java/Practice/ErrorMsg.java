package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ErrorMsg {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement text =driver.findElement(By.xpath("//div[ text()='Enter an email or phone number']"));
		String actual = text.getText();
		String expected = "Enter an email or phone number";
		Assert.ass	
		
		
		
		
	}
}


