package com.test.login;

import org.testng.annotations.Test;

import com.vetty.actions.BaseClass;
import com.vetty.actions.SSNTraceSubmission;

public class LoginTest extends BaseClass{

	SSNTraceSubmission obj = new SSNTraceSubmission();
	@Test

	public void test() throws InterruptedException {
		
      obj.Login();
	}

}
