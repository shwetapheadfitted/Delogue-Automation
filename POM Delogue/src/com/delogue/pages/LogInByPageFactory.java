package com.delogue.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInByPageFactory {

	//@FindBy(how=How.xpath("//input[@type='text' and @id='Username']"))
	//WebElement userid;
	
	@FindBy(how=How.ID,using="Username")
	WebElement userid;
}
