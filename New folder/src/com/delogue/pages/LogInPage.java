/**
 * 
 */
package com.delogue.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author shwetap
 *
 */
public class LogInPage {

	WebDriver driver;
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	@FindBy(how=How.ID,using="Username")
	WebElement userID;
	
	@FindBy(how=How.NAME,using="password")
	WebElement userpassword;
	
	@FindBy(how=How.NAME,using="submit")
	WebElement loginbutton;
	
	public void logIn(String uname, String pass)
	{
		userID.sendKeys(uname);
		userpassword.sendKeys(pass);
		loginbutton.click();
	}
}
