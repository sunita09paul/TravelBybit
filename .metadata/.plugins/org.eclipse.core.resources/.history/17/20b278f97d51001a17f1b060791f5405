package examplemaven;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest extends ObjectPages {

	@Test
	public void initLogin() throws Exception {

		LoginObjectPage loginpage = PageFactory.initElements(driver, LoginObjectPage.class);
		loginpage.setEmail("shweta.applicant+280@gmail.com");
		loginpage.setPassword("123456");
		loginpage.clickLogin();
		sleep();
	}

}