package com.demo.actions;

import com.demo.locators.LoginLocators;
import com.demo.locators.SearchHotelLocators;

public class SearchFlight extends DriverInitilization {
	SearchHotelLocators loc = new SearchHotelLocators(driver);
	
	
	public void  FlightSearching() {
		
		
		/*
		driver.get("https://travelbybit.com/");
		loc.StartLocation.sendKeys("Brisbane");
	 loc.EndLocation.sendKeys("New Delhi");
	 loc.StartDate.sendKeys("21/01/2020");
	 loc.EndDate.sendKeys("22/01/2020");
      //WebElement drpdwn = driver.findElement(By.id("outlined-bare"));
       *loc.SearchFlightbtn.click();
		*/
	}

}
