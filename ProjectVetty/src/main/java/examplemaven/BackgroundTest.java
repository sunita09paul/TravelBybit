package examplemaven;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BackgroundTest extends ObjectPages {
	@Test
	public void backgroundTest() throws Exception {

		LoginObjectPage loginpage = PageFactory.initElements(driver, LoginObjectPage.class);
		loginpage.setEmail("shweta.applicant+280@gmail.com");
		loginpage.setPassword("123456");
		loginpage.clickLogin();

		BackgroundPage backgroundpage = PageFactory.initElements(driver, BackgroundPage.class);
		backgroundpage.setFirstName("Tejaswini");
		backgroundpage.setMiddleName("ganuga");
		backgroundpage.setLastName("srinivasulu");
		backgroundpage.clickCalenderICon();
		backgroundpage.yearField();
		backgroundpage.clickYearButton();
		backgroundpage.clickMonth();
		backgroundpage.clickDate();
		backgroundpage.clickDate();
		backgroundpage.setSocialSecurityNumber("234-55-6778");
		backgroundpage.setAdress("Andhra");
		backgroundpage.setZip("12345");
		backgroundpage.setCity("Schenectady");
		backgroundpage.setStateField();
		backgroundpage.setPhoneNumber("9440888908");
		backgroundpage.setCaliforniaButton();
		takeScreenShot();
		backgroundpage.clickContinueButton();
		takeScreenShot();

		backgroundpage.clickNextButton();

		backgroundpage.clickSecondNextButton();
		takeScreenShot();

		backgroundpage.clickSignatureBox();
		backgroundpage.setFullName("Tejaswini ganuga");
		backgroundpage.clickNextCheckButton();
		backgroundpage.clicksubmitbutton();
		takeScreenShot();
	}
}
