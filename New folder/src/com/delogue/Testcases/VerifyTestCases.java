/**
 * 
 */
package com.delogue.Testcases;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.delogue.pages.ItemCommunicationFeature;
import com.delogue.pages.ItemSizeOption;
import com.delogue.pages.ItemTab;
import com.delogue.pages.LogInPage;

import Helper.BroswerFactory;

/**
 * @author shwetap
 *
 */
public class VerifyTestCases {
	
	WebDriver driver;
	@Test
	public void checkValidUser()
	{
		//launch the browser with specific url.
		driver=BroswerFactory.startBrowser("Firefox", "http://test.delogue.com");
		
		//creating object of LogInPage class
		LogInPage loginpage=PageFactory.initElements(driver, LogInPage.class);
		
		loginpage.logIn("shwetap@headfitted.com", "shweta@123");
		
	}
	@Test(dependsOnMethods="checkValidUser", enabled=false)
	public void verifyItemHeader() throws Exception
	{
		ItemTab itemtabobj=PageFactory.initElements(driver,ItemTab.class);
		
		
		itemtabobj.viewMarkedFileds();
		itemtabobj.itemAdd();
		
		
	}
	@Test(dependsOnMethods="checkValidUser", enabled=false)
	public void verifyCommunication() throws Exception
	{
		ItemTab itemo=PageFactory.initElements(driver, ItemTab.class);
		
		itemo.itemclick();
		ItemCommunicationFeature comm=PageFactory.initElements(driver, ItemCommunicationFeature.class);
		comm.createmesage("subject one", "message one");
		comm.clickOptions();
	}
	
	@Test(dependsOnMethods="checkValidUser")
	public void verifySize() throws Exception
	{
		ItemTab itemo=PageFactory.initElements(driver, ItemTab.class);
		itemo.itemclick();
		ItemSizeOption sizeo=PageFactory.initElements(driver, ItemSizeOption.class);
		sizeo.clickOnSize();
		//sizeo.addNewSize("65");
		sizeo.editSize();
	}
	/*@Test(dependsOnMethods="verifyCommunication")
	public void exitBrowser() throws Exception
	{
		
		driver.close();
	}*/
	
	

}
