import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alert {
	
	@SuppressWarnings("deprecation")
	@Test
	public void handleAlert() throws Exception
		{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.get("https://www.ksrtc.in/oprs-web/login/show.do");
		driver.findElement(By.xpath("//input[@id='submitBtn']")).click();
		Thread.sleep(3000);
		 String msg = driver.switchTo().alert().getText();
		 System.out.println(msg);
		 driver.switchTo().alert().accept();
		 String exp = "Please check Terms & Conditions....";
		 Assert.assertEquals(msg, exp);
		
		
		
	}
	}


