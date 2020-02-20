package com.vetty.actions;

import com.vetty.locators.LoginLocators;
import com.vetty.utils.PrppertyFileReader;

public class SSNTraceSubmission extends BaseClass {
	PrppertyFileReader prop = new PrppertyFileReader();
	LoginLocators loc = new LoginLocators(driver);
   
   
	public void Login() throws InterruptedException {
	
		loc.Email.sendKeys(prop.getProperties("username"));
		Thread.sleep(1000);
		loc.Password.sendKeys(prop.getProperties("passowrd"));
		loc.LOginbtn.click();
		
		
	}

}
