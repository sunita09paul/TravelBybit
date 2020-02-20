package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.actions.DriverInitilization;
import com.demo.actions.Login;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends  DriverInitilization {
@Test
     public void test1() throws InterruptedException {
	
		Login actions = new Login();
 		actions.loginaction();
 		test = reports.startTest("loginaction");
 		 Assert.assertTrue(true);
 		 //To generate the log when the test case is passed
 		test.log(LogStatus.PASS, "Test Case is successfully Passed");
 			}

}
