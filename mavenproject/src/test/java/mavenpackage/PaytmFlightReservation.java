package mavenpackage;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaytmFlightReservation {

	static WebDriver driver;

	static By xpath;
	static By css;
	static PaytmXpaths xpathstr = new PaytmXpaths();
	static PaytmUtil util = new PaytmUtil();

	@SuppressWarnings("static-access")
	@BeforeTest
     public void launchBrowser() throws IOException
     {
		if (util.readPropertiesFile("Browser").equalsIgnoreCase("Chrome")) {
			util.launchChrome();
		} else {
			util.launchFirefox();
		}

		util.manageWindow();
     }

     
     @SuppressWarnings("static-access")
	@Test
     public void selectOptions() throws Exception, Exception
     {
		// Select Roundtrip
		util.clickXpath(xpathstr.roundtrip);

		// From Place
		util.clickXpath(xpathstr.fromplace);
		util.clickXpath(xpathstr.cancelbutton);
		
		util.sendKeys(xpathstr.from2, util.readPropertiesFile("From"));
		util.clickXpath(xpathstr.selectfromplace);

		// To place
		util.clickXpath(xpathstr.toplace);
		util.clickXpath(xpathstr.clearToPlace);

		//WebElement To = util.xpath(xpathstr.to);
		util.sendKeys(xpathstr.to, util.readPropertiesFile("To"));

		util.clickXpath(xpathstr.selecttoplace);

		// Departure date
		util.clickXpath(xpathstr.departuredate);
		util.clickXpath(xpathstr.currentdate);

		// Return date
		util.clickXpath(xpathstr.returndate);
		util.clickXpath(xpathstr.returndate);

		util.clickXpath(xpathstr.selectreturndate);

		// Add Travelers and Cabin Class
		util.clickXpath(xpathstr.clicktravelers);

		// Add number of Adult passengers
		for (int i = 1; i < Integer.parseInt(util.readPropertiesFile("AdultPassenger")); i++) {

			util.clickXpath(xpathstr.adultPassengers);
		}

		// Add number of child passenger
		for (int i = 0; i <= Integer.parseInt(util.readPropertiesFile("ChildPassenger")); i++) {

			util.clickXpath(xpathstr.childPassengers);
		}

		// Select class
		if (util.readPropertiesFile("Class").equalsIgnoreCase("Premium Economy")) {
			util.clickXpath(xpathstr.premEconomy);

		} else if (util.readPropertiesFile("Class").equalsIgnoreCase("Economy")) {
			util.clickXpath(xpathstr.economy);
		} else {
			util.clickXpath(xpathstr.business);
		}

		// Click on Done button
		util.clickXpath(xpathstr.done);

		// Click on Search button
		util.clickXpath(xpathstr.search);
     }
		
		@SuppressWarnings("static-access")
		@AfterTest
		public void close() throws InterruptedException
		{
		Thread.sleep(3000);
		util.close();

	    }
}
