package com.demo.test;

import org.testng.annotations.Test;

import com.demo.actions.DriverInitilization;
import com.demo.actions.SearchFlight;
//import com.demo.actions.SearchFlight;

public class SearchFlightTest extends DriverInitilization{
	SearchFlight obj = new SearchFlight();
	@Test
	public void SearchFlightTest() {
		obj.FlightSearching();
		
	}

}
