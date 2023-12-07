package mavenpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class PaytmXpaths {



			DateFormat dateFormat = new SimpleDateFormat("dd");

			// get current date time with Date()
			Date date = new Date();

			// Now format the date
			String date1 = dateFormat.format(date);
			
			Integer date2 = Integer.valueOf(date1);
			int date3 = date2 + 1;
			String returnDate = Integer.toString(date3);
			
			String roundtrip = "//label[text()='Round Trip']";
			String fromplace = "//span[@id='srcCode']";
			String from2 = "//div[text()='From']/following::input[@id='text-box']";
			String to = "//div[text()='To']/following::input[@id='text-box']";
			String selectfromplace = "(//*[text()='Search Results']/following-sibling::div//div)[4]";
			String toplace = "//span[@id='destCode']";
			String clearToPlace = "//div[text()='To']/following::input/preceding::img[1]";
			String selecttoplace = "(//*[text()='Search Results']/following-sibling::div//div)[4]";
			String departuredate = "//*[@id='departureDate']";
			String currentdate = "(//div[@class='Mobile-datepicker']//div[not(contains(@class,'_disabledDay'))]/div[text()="+date1+"])[1]";
			String returndate = "//div[text()='Save More']/preceding::span[@id='endDate']";
			String selectreturndate = "(//div[@class='Mobile-datepicker']//div[not(contains(@class,'_disabledDay'))]/div[contains(text(),"+returnDate+")])[1]";
			String clicktravelers = "//span[@id='numPax']";
			String adultPassengers = "(//div[text()='Adults']/following::div//img)[2]";
			String childPassengers = "(//div[text()='Children']/following::div//img)[2]";
			String premEconomy = "//label[@id='prem']";
			String economy = "//label[@id='eco']";
			String business = "//label[@id='bus']";
			String done = "//div[text()='Done']";
			String search ="//button[@id='flightSearch']";
			String cancelbutton ="//div[div[input[@id='text-box']]]/img";
			//String cancelbutton ="img[src='//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg']";  [@src = '//travel-assets-akamai.paytm.com/travel/mweb-flights/assets/7b29a32c.svg']
		}


