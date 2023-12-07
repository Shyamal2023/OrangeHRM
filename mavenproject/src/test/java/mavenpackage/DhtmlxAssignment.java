package mavenpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DhtmlxAssignment {

		    @SuppressWarnings("deprecation")
			public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			
			driver.get("https://dhtmlx.com/docs/products/dhtmlxGrid/");
			driver.navigate().refresh();
			
			WebElement download2 = driver.findElement(By.xpath("//div[@class='mobile-head-download']/a[text()='Download']"));
			if(download2.isDisplayed())
			{
			download2.click();
			System.out.println("Right corner button displayed");
			}
			else
			{
			WebElement download1 = driver.findElement(By.xpath("(//h1[text()='JavaScript DataGrid (DataTable) Widget']//following::a[text()='Download'])[1]"));
			
			System.out.println("Download button at the center of the page: "+download1.getText());
			}
			
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(210)); 
			
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mobile-head-download']/a[text()='Download']")));
			
			driver.quit();
		}

	}


