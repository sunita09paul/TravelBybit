package com.demo.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelLocators {
	WebDriver driver;
	
   public	SearchHotelLocators(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
   @FindBy(xpath = "//span[text()='Hotels']")
   public WebElement Hoteloption;
   
  @FindBy(xpath = "//input[@name='destination']")
   public WebElement Entercity;

  
   
   @FindBy(id="startDate")
   public WebElement StartDate;
   
   @FindBy(id="endDate")
   public WebElement EndDate;
   /*
   @FindBy(id="outlined-bare")
   public WebElement Passengers;
   */
@FindBy(xpath= "//button[text()='Search Flights']")
public WebElement SearchFlightbtn;

}
