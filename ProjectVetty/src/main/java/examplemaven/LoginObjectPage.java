package examplemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjectPage {

	WebDriver driver;

	public LoginObjectPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@name='email']")
	WebElement Email;
	@FindBy(how = How.XPATH, using = "//*[@name='passowrd']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//*[@class='form-control btn btn primary']")
	WebElement login;

	public void setEmail(String stringusername) {
		Email.sendKeys(stringusername);
	}

	public void setPassword(String stringpassword) {
		Password.sendKeys(stringpassword);
	}

	public void clickLogin() {
		login.click();
	}

}