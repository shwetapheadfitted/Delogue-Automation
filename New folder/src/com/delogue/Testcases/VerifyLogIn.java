/**
 * 
 */
package com.delogue.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.delogue.pages.LogInPage;

import Helper.BroswerFactory;

/**
 * @author shwetap
 *
 */
public class VerifyLogIn {
	
	@Test
	public void checkValidUser()
	{
		//launch the browser with specific url.
		WebDriver driver=BroswerFactory.startBrowser("Firefox", "http://test.delogue.com");
		
		//creating object of LogInPage class
		LogInPage loginpage=PageFactory.initElements(driver, LogInPage.class);
		
		loginpage.logIn("shwetap@headfitted.com", "shweta@123");
	}

}
