package examplemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class BackgroundPage {

	WebDriver driver;

	public BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@name=\"firstname\"]")
	WebElement FistName;
	@FindBy(how = How.XPATH, using = "//*[@name=\"middlename\"]")
	WebElement MiddleName;
	@FindBy(how = How.XPATH, using = "//*[@name=\"lastname\"]")
	WebElement LastName;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ssn\"]")
	WebElement SocialSecurityNumber;
    @FindBy(how = How.XPATH, using = "/html/body/app-root/div/app-applicant-details/div/div/div/app-background-check/form/div/div[2]/div[1]/div/div/div/div[2]/span/div")
	WebElement CalenderICon;
	@FindBy(how = How.XPATH, using = "//*[@placeholder='mm/dd/yyyy']")
	WebElement EnterDate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"mat-datepicker-0\"]/div[2]/mat-multi-year-view/table/tbody/tr[2]/td[2]/div")
	WebElement Year;

	@FindBy(how = How.XPATH, using = "//*[@id=\"mat-datepicker-0\"]/div[2]/mat-year-view/table/tbody/tr[4]/td[2]/div")
	WebElement Month;
	@FindBy(how = How.XPATH, using = "//*[@id=\"mat-datepicker-0\"]/div[2]/mat-month-view/table/tbody/tr[2]/td[1]/div")
	WebElement Date;

	@FindBy(how = How.XPATH, using = "//*[@name=\"street\"]")
	WebElement Adress;
	@FindBy(how = How.XPATH, using = "//*[@name=\"zip\"]")
	WebElement Zip;
	@FindBy(how = How.XPATH, using = "//*[@name=\"city\"]")
	WebElement City;
	@FindBy(how = How.XPATH, using = "//*[@name=\"state\"]")
	WebElement State;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PhoneNumber;
	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/app-applicant-details/div/div/div/app-background-check/form/div/div[4]/div[2]/div[2]/div")
	WebElement CaliforniaButton;
	@FindBy(how = How.XPATH, using = "//*[@class='white-btn']")
	WebElement ContinueButton;

	@FindBy(how = How.XPATH, using = "//*[@type='checkbox']")
	WebElement CheckBox;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'btnDefault')]")
	WebElement NextButton;

	@FindBy(how = How.XPATH, using = "//*[contains(@class,'btnDefault')]")
	WebElement SecondNextButton;

	@FindBy(how = How.XPATH, using = "//*[contains(@style,'touch')]")
	WebElement SignatureBox;
	@FindBy(how = How.XPATH, using = "//*[@id='printedName']")
	WebElement FullName;
	@FindBy(how = How.XPATH, using = "/html/body/app-root/div/app-applicant-details/div/div/div/app-disclosure-agreement/div[1]/div[1]/app-disclosure/div[3]/div[2]/input")
	WebElement NextCheckButton;
	@FindBy(how = How.XPATH, using = "//*[text()='Submit']")
	WebElement SubmitButton;

	public void setFirstName(String stringfirsname) {
		FistName.clear();
		FistName.sendKeys(stringfirsname);
	}

	public void setMiddleName(String stringmiddlename) {
		MiddleName.clear();

		MiddleName.sendKeys(stringmiddlename);
	}

	public void setLastName(String stringlastname) {
		LastName.clear();

		LastName.sendKeys(stringlastname);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", LastName);

	}

	public void clickCalenderICon() throws InterruptedException {
		EnterDate.clear();
		CalenderICon.click();
	}

	public void yearField() {
		Select dropdown = new Select(
				driver.findElement(By.xpath("//*[@id=\"mat-datepicker-0\"]/div[1]/div/button[1]/span")));
		dropdown.selectByVisibleText("Active");
	}

	public void clickYearButton() {
		Year.click();
	}

	public void clickMonth() {
		Month.click();
	}

	public void clickDate() {
		Date.click();
	}

	public void setSocialSecurityNumber(String stringsocialsecuritynumber) {
		SocialSecurityNumber.clear();
		SocialSecurityNumber.sendKeys(stringsocialsecuritynumber);

	}

	public void setAdress(String stringadress) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Adress);
		Adress.clear();
		Adress.sendKeys(stringadress);
	}

	public void setZip(String stringzip) {
		Zip.clear();
		Zip.sendKeys(stringzip);
	}

	public void setCity(String stringcity) {
		City.clear();
		City.sendKeys(stringcity);
	}

	public void setStateField() {
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@name=\"state\"]")));
		dropdown.selectByVisibleText("New York");
	}

	public void setPhoneNumber(String stringphonenumber) {
		PhoneNumber.clear();
		PhoneNumber.sendKeys(stringphonenumber);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", PhoneNumber);
	}

	public void setCaliforniaButton() {
		CaliforniaButton.click();
	}

	public void clickContinueButton() {
		ContinueButton.click();
	}

	public void clickNextButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", NextButton);
		NextButton.click();
	}

	public void clickSecondNextButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", SecondNextButton);
		SecondNextButton.click();
	}

	public void clickSignatureBox() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", SignatureBox);
		SignatureBox.click();
	}

	public void setFullName(String stringfullname) {
		FullName.sendKeys(stringfullname);
	}

	public void clickNextCheckButton() {
		NextCheckButton.click();
	}

	public void clicksubmitbutton() {
		SubmitButton.click();
	}
}
