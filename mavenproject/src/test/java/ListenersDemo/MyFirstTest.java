package ListenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(ListenersDemo.TestNGListener.class)
public class MyFirstTest {
	@Test
	public void GoogleTitleVerify()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
		
		@Test
		public void TitleMatch()
		{
			System.out.println("Test2 dummy");
			Assert.assertTrue(false);
		}
	}

 
