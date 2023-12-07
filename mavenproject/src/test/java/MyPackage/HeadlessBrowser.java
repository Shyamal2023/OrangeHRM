package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadlessBrowser {
	@Test
	public void verifyTitle()
	{
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		
		String expected = "Facebook – log in or sign up";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

}
