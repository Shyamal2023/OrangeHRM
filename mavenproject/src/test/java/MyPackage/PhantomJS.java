package MyPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantomJS {
	@Test
	public void verifyTitle() throws IOException
	{
		File src = new File("C:\\Shymal_Selenium\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.facebook.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		
		String PhantomJSDriverExample = null;
		FileUtils.copyFile(src1,new File("./Screenshots/"+PhantomJSDriverExample+".png"));	
		System.out.println("SCreenshot taken");
		
		
	
	}
	

}
