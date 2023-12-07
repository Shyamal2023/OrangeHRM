package mavenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Actions action = new Actions(driver);
        WebElement rightclick = driver.findElement(By.cssSelector(".context-menu-one"));
        action.contextClick(rightclick).perform();
        WebElement paste = driver.findElement(By.cssSelector(".context-menu-icon-paste"));
        paste.click();
        driver.switchTo().alert().accept();
        System.out.println("Successfull");
        driver.quit();
        

	}

}
