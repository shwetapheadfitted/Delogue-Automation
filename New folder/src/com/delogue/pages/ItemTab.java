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
public class ItemTab {
	
	WebDriver driver;
	
	public ItemTab(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	@FindBy(how=How.CSS, using="a#itemTabLink")
	WebElement item;
	
	@FindBy(how=How.CSS, using="button#btnCreateItem.green-button-dark")
	WebElement additem;
	
	@FindBy(how=How.CSS, using="#selectBrand")
	WebElement brand;
	
	@FindBy(how=How.CSS, using="#selectCompanyContactPerson")
	WebElement contactperson;
	
	@FindBy(how=How.CSS, using="#txtItemTabItemNumber")
	WebElement itemnumber;
		
	@FindBy(how=How.CSS,using="txtItemTabItemName")
	WebElement itemname;
	
	@FindBy(how=How.CSS,using="span.save-icon.pull-right")
	WebElement savebutton;

		
	
	
	
	
	
	
}
