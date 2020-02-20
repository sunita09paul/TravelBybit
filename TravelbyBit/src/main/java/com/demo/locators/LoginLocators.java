package com.demo.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators {
	WebDriver driver;
		public LoginLocators(WebDriver driver){
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(name = "email")
        public  WebElement Email;
		
		@FindBy(name = "password")
		public WebElement Password;
		
		@FindBy(xpath = "//span[text()='Log In']")
		public	WebElement loginbtn;
		
		@FindBy(xpath ="//a[@href='/']/img")
		public WebElement logo;
		
		@FindBy(xpath ="//button[@id='full-width-tab-1']/span")
		public WebElement Profileoptions;
	/*	
		@FindBy(xpath ="//label[text()='Title']")
		public WebElement dropdwn;
		*/
		
		@FindBy(xpath ="//div[@id='menu-salutation']//descendant::ul//li")
		public List <WebElement> ProfileTitle;
		
		@FindBy(name ="middle_name")
		public WebElement middlename;
		
		@FindBy(xpath ="//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd']")
		public WebElement dateofbith;
		
		@FindBy(xpath="//input[@value='F']")
		public WebElement gender;
		
		@FindBy(name ="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained Mui-disabled Mui-disabled")
	    public WebElement Savebtn;
		
		@FindBy(xpath="//span[text()='Activity Overview']")
		public WebElement overviewbtn;
	
		@FindBy(xpath="//span[text()='Find flight / hotel deals']")
		public WebElement findflightbtn;
		
		@FindBy(xpath = "//input[@name='origin']")
		public WebElement EnterLocation;
   // "//input[@name='origin']"
		
		@FindBy(xpath="//div[@name='origin']//descendant::div[@name='origin']//child::div[@class='locationAutocomplete__Suggestion-sc-1bqs8lb-6 hvTEeG']")
		public List <WebElement> StartLocation;
		
		@FindBy(xpath = "//div[@name='destination']/input")
		public WebElement EnterDestinationLocation;

		@FindBy(xpath = "//div[@class='locationAutocomplete__SuggestionList-sc-1bqs8lb-4 imbySr']//descendant::div[@class='locationAutocomplete__Suggestion-sc-1bqs8lb-6 hvTEeG']")
		public List <WebElement> DestinationLocation;
		
		@FindBy(xpath = "//input[@name='startDate']")
		public WebElement SDate;
		
		@FindBy(xpath = "//input[@id='endDate']")
		public WebElement LDate;
		
		@FindBy(xpath = "//button[text()='Search Flights']")
		public WebElement Searchbtn;
		
	}

		
		
		



