package MyPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestFFOnGrid {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("Chrome");
		cap.setPlatform(Platform.WIN11);
		
		ChromeOptions opt = new ChromeOptions();
		cap.merge(opt);
		URL hubURL = new URL("http://localhost:4444/wd/hub");
		//		String hubURL = " http://192.168.56.1:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(hubURL,cap);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());

}
}