package com.testing;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFile {
PageFile pf = new PageFile();
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		pf.openBrowser();
		pf.openURL();
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		pf.closeBrowser();
	}
	@Test(priority=2)
    public void validLoginTest() throws Exception
    {
    	pf.login();
    	pf.fpEmailCount();
    	pf.totalEmailCount();
    	pf.emailTrash();
    	pf.totalEmailCount();
    	pf.trashToInbox();
    	pf.goToInbox();
    	Thread.sleep(5000);
    	pf.totalEmailCount();
    	Thread.sleep(2000);
    	pf.markReadUnread();
    	
    	
    }
	@Test(priority=1)
	public void invalidLoginTest() throws Exception {
		pf.invalidLogin();
		pf.msgValidation();
		
		
	}
	
 }


