package examplemaven;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class ObjectPages {

	public WebDriver driver;

	@BeforeMethod
	public void init() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(" https://stgapplicant.vetty.co/");

	}

	@BeforeClass
	public void initialize() {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") +"/drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	public void takeScreenShot() {
		Date d = new Date();
		String screenshotFile = d.toString().replace(":", "_").replace(" ", "_") + ".png";
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(scrFile, new File(System.getProperty("user.dir") + "//screenshots//" + screenshotFile));
			System.out.println("screenshot");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void sleep() {
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@AfterClass(alwaysRun = true)
	public void quit() {
		driver.close();
	}

}