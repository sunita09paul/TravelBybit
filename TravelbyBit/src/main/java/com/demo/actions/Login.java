package com.demo.actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.demo.locators.LoginLocators;


import com.demo.utils.PrppertyFileReader;
import com.relevantcodes.extentreports.LogStatus;

public class Login extends DriverInitilization {
	PrppertyFileReader prop = new PrppertyFileReader();
	LoginLocators locator = new LoginLocators(driver);

	public void loginaction() throws InterruptedException {
		locator.Email.sendKeys(prop.getProperties("username"));
		/*
		test = reports.startTest("loginaction");
		 Assert.assertTrue(true);
		// To generate the log when the test case is passed
		test.log(LogStatus.PASS, "Email Enter sucess Fully");
		Thread.sleep(2000);
		*/
		test.setDescription("Username Enter");
		locator.Password.sendKeys(prop.getProperties("passowrd"));
		Thread.sleep(2000);
		
	    locator.loginbtn.click(); 
	    Thread.sleep(20000);
		
	//	test.log(LogStatus.PASS, "User is successfully loggedin");
		locator.Profileoptions.click();
		Thread.sleep(2000);
		
		WebElement drodwn = driver.findElement(By.xpath("//div[@id='salutation']"));
		Thread.sleep(1000);
		drodwn.click();
		/*
	    Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.ENTER).perform();
		*/
		List <WebElement> li = locator.ProfileTitle;
		for(int i =0; i<li.size();i++) {
			 System.out.println(li.get(i).getText());
		      	if(li.get(i).getText().contains("Miss.")) {
		      		li.get(i).click();
					}
				}
		
		locator.middlename.clear();
		Thread.sleep(1000);
		
	
		locator.middlename.sendKeys("Kalis");
		locator.dateofbith.sendKeys("09/09/1993");
		
		locator.gender.click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
	//	test.log(LogStatus.PASS, "Your Profile hass been updated successfully");
		WebElement elem =	driver.findElement(By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12']/button"));
		elem.click();
	
		Thread.sleep(1000);
		locator.overviewbtn.click();
		
		Thread.sleep(8000);
		locator.findflightbtn.click();
	//	test.log(LogStatus.PASS, "Redirect to Search Flight page");
		Thread.sleep(8000);
		locator.EnterLocation.sendKeys("Chhatrapati ");
		Thread.sleep(8000);
//	List <WebElement> lists= (List<WebElement>) locator.StartLocation;
		
		List <WebElement> lists = locator.StartLocation;
		System.out.println("Total size of start location"+lists.size());
		Thread.sleep(3000);

		for(int i =0; i<lists.size();i++) {
	 System.out.println(lists.get(i).getText());
      	if(lists.get(i).getText().contains("BOM")) {
				lists.get(i).click();
			}
		}
		Thread.sleep(3000);
		locator.EnterDestinationLocation.sendKeys("Bris");
		Thread.sleep(8000);
		
	List <WebElement> list= locator.DestinationLocation;
	System.out.println("Total size of destination location: " +list.size());
	for(int i =0; i<list.size();i++) {
		 System.out.println(list.get(i).getText());
	      	if(list.get(i).getText().contains("BNE")) {
					list.get(i).click();
				}
			}
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  locator.SDate.clear();
	  locator.SDate.sendKeys("29/01/2020");
	  
	  Thread.sleep(5000);
	  locator.LDate.sendKeys("31/01/2020");
	  
	  locator.Searchbtn.click();

		}
	

}









