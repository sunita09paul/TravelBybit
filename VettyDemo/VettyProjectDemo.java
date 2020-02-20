package com.vetty;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class VettyProjectDemo 
{
   public static WebDriver driver;
	
  @Test(priority=1)
  public void LoginVetty() 
  {
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("shweta.applicant+261@gmail.com");
	  driver.findElement(By.xpath("//input[@name='passowrd']")).sendKeys("123456");
	  driver.findElement(By.xpath("//div[@class='login-button']/child::button[.='Log In']")).click();
  }
  
  @Test(priority=2)
  public void loginbackgrounginfo() throws InterruptedException
  {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rutuja");
	  driver.findElement(By.xpath("//input[@name='middlename']")).sendKeys("Chandrakant");
	  driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Salway");
	  
	  driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).sendKeys("08/09/1990");
	  
	  //driver.findElement(By.xpath("div[@class='cdk-overlay-backdrop mat-overlay-transparent-backdrop cdk-overlay-backdrop-showing']")).click();
	  
	  //driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content'][.='20']")).click();
	  driver.findElement(By.xpath("//input[@name='ssn']")).sendKeys("900980090");
	  driver.findElement(By.xpath("//input[@name='street']")).sendKeys("Karvenagar");
	  driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("41105");
	  driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Compton");
	  WebElement state=driver.findElement(By.xpath("//select[@name='state']"));
	  
	  Select sel = new Select(state);
	  sel.selectByVisibleText("California");
	  
	  driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8668775514");
	  
	  driver.findElement(By.xpath("//div[@class='form-label yesSelected selected_yes']")).click();
	  driver.findElement(By.xpath("//button[@class='white-btn'][.='Continue']")).click();
  
	  
	  //FCRA rights
	  
	  WebDriverWait wait =new WebDriverWait(driver,15);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='mvr_title boldClassMobile'][.='FCRA Rights']")));
	  WebElement fcrarightlb=driver.findElement(By.xpath("//h3[@class='mvr_title boldClassMobile'][.='FCRA Rights']"));
	  boolean act_flag1=fcrarightlb.isDisplayed();
	  System.out.println("FCRA Right screen is displayed: "+act_flag1);
	  
	  
	  //driver.findElement(By.xpath("//input[@value='false']")).click();
	  
	  driver.findElement(By.xpath("//button[@class='btnDefault btnBlue btnResponsiveRight']")).click();
	  
	  //California Disclosure
	  
	  WebDriverWait wait1 =new WebDriverWait(driver,15);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='mvr_title boldClassMobile'][.='California Disclosure']")));
	  WebElement caldisc=driver.findElement(By.xpath("//h3[@class='mvr_title boldClassMobile'][.='California Disclosure']"));
	  boolean act_flag2=caldisc.isDisplayed();
	  System.out.println("California Disclosure screen is displayed"+act_flag2);
	  
	  //Disclosure Regarding Background Investigation
	  
	  WebDriverWait wait2 =new WebDriverWait(driver,15);
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='mvr_title boldClassMobile'][.='Disclosure Regarding Background Investigation']")));
	  WebElement discbc=driver.findElement(By.xpath("//h3[@class='mvr_title boldClassMobile'][.='Disclosure Regarding Background Investigation']"));
	  boolean act_flag3=discbc.isDisplayed();
	  System.out.println("Disclosure Regarding Background Investigation screen is displayed"+act_flag3);
	  
	  driver.findElement(By.xpath("//input[@value='false']")).click();
	  
	  driver.findElement(By.xpath("//div[@class='btnBottomNevigation btnNevigationRightDisclosure ']/button")).click();
	  
	  //Authorization
	  
	  WebDriverWait wait3 =new WebDriverWait(driver,15);
	  wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='mvr_title boldClassMobile'][.='Disclosure Regarding Background Investigation']")));
	  
	  WebElement authscr=driver.findElement(By.xpath("//h3[@class='mvr_title boldClassMobile'][.='Disclosure Regarding Background Investigation']"));
	  boolean act_flag4=authscr.isDisplayed();
	  System.out.println("Authorization screen is displayed" +act_flag4);
	  
	  driver.findElement(By.xpath("//h3[@class='checkbox boldClassMobile']/following-sibling::input")).click();
	  
	  driver.findElement(By.xpath("//div[@class='btnBottomNevigation btnNevigationRightDisclosure ']/child::button[.='Next Document']")).click();
	  
	  
	  driver.findElement(By.xpath("//input[@id='printedName']")).sendKeys("Rutuja");
	  
	  driver.findElement(By.xpath("//input[@value='false']")).click();
	  
	  driver.findElement(By.xpath("//button[@class='btnDefault btnGreen btnResponsiveRight'][.='Submit']")).click();
  
  }
  @BeforeMethod
  public void getCookies() 
  {
	  Set<Cookie>cookies=driver.manage().getCookies();
	  for(Cookie cookie:cookies)
	  {
		  System.out.println(cookie.getName());
	  }
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void maximizeBrowser() 
  {
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void enterApplicationURL() 
  {
	  driver.get("https://stgapplicant.vetty.co/login");
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void openBrowser() 
  {
	 System.setProperty("webdriver.chrome.driver", "C:\\29062019\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 
  }

  @AfterSuite
  public void afterSuite() 
  {
	  driver.close();
  }

}