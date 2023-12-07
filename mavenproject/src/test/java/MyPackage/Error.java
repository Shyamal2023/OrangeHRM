package MyPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Error {

	public static void main(String[] args) {
	
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.gmail.com");
				
				driver.findElement(By.xpath("//span[text()='Next']")).click();
				WebElement text =driver.findElement(By.xpath("//div[ text()='Enter an email or phone number']"));
				String actual = text.getAttribute("innerHTML");
				System.out.println(actual);
				String expected = "Enter an email or phone number";
				
				try
				{    Assert.assertEquals(actual, expected);
					System.out.println("Test succesful");
				
				}catch(Exception e)
				{System.out.println("Exception in assertion");}
				
				
				
	}

}
