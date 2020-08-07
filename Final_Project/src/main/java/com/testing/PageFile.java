package com.testing;


import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PageFile extends LocatorsFile implements DataFile  {
	public WebDriver driver;
	
	public void openBrowser()throws IOException, InterruptedException  {
		
		//opening chromebrowser
		System.setProperty("webdriver.chrome.driver","F:\\DEV_IT_Training\\DIT_Selenium\\Dit Project\\Final_Project\\projectData\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//setup driver property
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, this);
		
	}
	public void closeBrowser() {
		driver.close();
		
	}
		
	public void openURL() throws InterruptedException {
			driver.get(URL);   //Opening URL
			Thread.sleep(2000);
	}
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		emailField.sendKeys(email1);
		nxtButton1.click();
		passwordField.sendKeys(password1);
		nxtButton2.click();
		System.out.println("Login with valid credential");
	}
		public void invalidLogin() throws InterruptedException {
			
		emailField.sendKeys(email2);
		nxtButton1.click();
		passwordField.sendKeys(password2);
		nxtButton2.click();
		System.out.println("Login with invalid credential");
		}
		
	
	public void msgValidation()throws InterruptedException {
		
		Assert.assertEquals(errorMsg.getText(), "Wrong password. Try again or click Forgot password to reset it.");
		System.out.println("Wrong password. Try again or click Forgot password to reset it.");
	}
		public void fpEmailCount() throws Exception {
		
			Thread.sleep(2000);
			String C1 = fpEmails.getText();
			System.out.println("Total number of emails on First page: " +C1);
		}
		public void totalEmailCount()throws Exception {
			Thread.sleep(2000);
			String C2=ttlEmails.getText();
			System.out.println("Total number of emails in Inbox: "+C2);
		}
		public void  emailTrash() throws InterruptedException {
		Thread.sleep(2000);
		checkboxOne.click();	
		delete.click();
		System.out.println("First email moved to Trash");
		}
		
		public void trashToInbox() throws InterruptedException {
		Thread.sleep(2000);
		moreBtn.click();
		selectTrash.click();
		
		Thread.sleep(3000);
		
		Actions builder=new Actions(driver);
		Thread.sleep(2000);
		//builder.moveToElement(trashedEmail);
		builder.contextClick(trashedEmail).build().perform();
		
		System.out.println("Right clicked on trashed email");
		 builder.sendKeys(Keys.ARROW_DOWN).build().perform();
		 builder.sendKeys(Keys.ARROW_DOWN).build().perform();
		 builder.sendKeys(Keys.ARROW_DOWN).build().perform();
		 builder.sendKeys(Keys.ARROW_DOWN).build().perform();
		 builder.sendKeys(Keys.ENTER).build().perform();
		 System.out.println("First email from Trash moved back to Inbox");
		
		
		
		
		}
			public void goToInbox() {
				lessBtn.click();
				mainInbox.click();
				System.out.println("Going back to main inbox");
			}
			
		public void markReadUnread() throws InterruptedException {
			
			String expectedToolTipMR="Mark as read";
			String expectedToolTipMUR="Mark as unread";	
			selectEmail.click();
			Thread.sleep(1000);
			markRead.click();
			Thread.sleep(2000);
			String actualToolTip1=markRead.getAttribute("data-tooltip");
			Assert.assertEquals(actualToolTip1, expectedToolTipMUR);
			System.out.println("3rd Email marked as a read with Assert command passed");
			Thread.sleep(1000);
			markUnread.click();
			Thread.sleep(2000);
			String actualToolTip2=markUnread.getAttribute("data-tooltip");
			Assert.assertEquals(actualToolTip2, expectedToolTipMR);
			System.out.println("3rd Email marked as a unread with Assert command passed");
			
			
			
			
			
			
		}
			
			
		
}
	
	


