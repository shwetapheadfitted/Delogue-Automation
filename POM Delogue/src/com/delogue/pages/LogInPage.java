package com.delogue.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	WebDriver driver;
	By userId=By.xpath("//input[@type='text' and @id='Username']");
	By password=By.xpath("//input[@name='password']");
	By loginbutton=By.xpath("//button[@name='submit']");
	
	//create constructor
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
	}

	//create methods for each action, here type user id
	public void typeUsername()
	{
		driver.findElement(userId).sendKeys("shwetap@headfitted.com");
		
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("shweta@123");
		
	}
	public void clickButton()
	{
		driver.findElement(loginbutton).click();
	}
	
}
