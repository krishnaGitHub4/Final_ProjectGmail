package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LocatorsFile {
	@FindBy(xpath = "//*[@id=\"identifierId\"]") public WebElement emailField;
	@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button") public WebElement nxtButton1;
	@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input") public WebElement passwordField;
	@FindBy(xpath="//*[@id=\"passwordNext\"]/div/button")public WebElement nxtButton2;
	@FindBy(xpath="//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")public WebElement errorMsg;
	
	@FindBy(xpath="//*[contains(@class,\"ts\")][2]")public WebElement fpEmails;  
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/div[2]/div[1]/span/div[1]/span/span[2]")public WebElement ttlEmails;
	
	@FindBy(xpath="//*[@id=\"gbwa\"]/div/a") public WebElement apps;
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[7]/a/div[5]")public WebElement gmailApp;
	@FindBy(xpath="//*[@id=\":4\"]/div/div[1]/div[1]/div/div/div[2]/div[3]")public WebElement delete;
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[1]/div[7]/div/div[1]/div[3]/div/table/tbody/tr[1]/td[2]")public WebElement checkboxOne;
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[2]/span/span[2]/div")public WebElement moreBtn;
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[3]/div/div[1]/div/div[6]/div/div/div[2]/span/a")public WebElement selectTrash;
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[2]/div/table/tbody/tr[1]")public WebElement trashedEmail; 
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[2]/span/span[2]/div")public WebElement lessBtn;
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/div/div/div[2]")public WebElement mainInbox;
	
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[7]/div/div[1]/div[3]/div/table/tbody/tr[3]/td[2]/div")public WebElement selectEmail;
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[7]/div/div[1]/div[3]/div/table/tbody/tr[3]/td[10]/ul/li[3]")public WebElement markRead;
	@FindBy(xpath="/html/body/div[7]/div[3]/div/div[2]/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[7]/div/div[1]/div[3]/div/table/tbody/tr[3]/td[10]/ul/li[3]")public WebElement markUnread;
		
	
	
	
	
	


}
