package com.demo.actions;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.demo.utils.PrppertyFileReader;
import com.demo.utils.VariableInitilize;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class DriverInitilization {
PrppertyFileReader prop = new PrppertyFileReader();
	
	public static WebDriver driver;
	
	public static ExtentReports reports;
	 public static ExtentTest test;
	 
	@BeforeSuite
	public void initilizeReport() {
	reports = new ExtentReports(System.getProperty("user.dir")+"/reports/"+new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date()) + "reports.html");
		}
	
	@AfterSuite
	public void cleanUpReport() {
			reports.flush();
		}
	
	@Parameters({"Browser","env"})
	@BeforeMethod
  public void Initilize(String BrowserName, String Envirmentvalue) {
	invokebrowser(BrowserName);
		driver.manage().window().maximize();
		VariableInitilize.setEnv(Envirmentvalue);
		driver.get(prop.getProperties("url"));
	}
	@AfterMethod (enabled=false)
	public void closebrowser() {
		driver.close();
	}
	
	public void invokebrowser(String BrowserName) {
	switch(BrowserName) {
	case "chrome" :
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/driver/chromedriver.exe");	
		driver = new ChromeDriver();
          
		
	case "firefox" :
		System.setProperty("webdriver.Firefox.driver",System.getProperty("user.dir")+"/driver/firefox.exe");

	break;
		}
	}
	}
