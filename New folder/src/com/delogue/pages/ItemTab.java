/**
 * 
 */
package com.delogue.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

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
		
	@FindBy(how=How.CSS,using="#txtItemTabItemName")
	WebElement itemname;
	
	@FindBy(how=How.CSS,using="span.save-icon.pull-right")
	WebElement savebutton;
	
	public void itemclick()
	{
		item.click();
	}
	public void viewMarkedFileds() throws Exception
	{
		Thread.sleep(10000);
		item.click();
		Thread.sleep(7000);
		additem.click();
		
	}
	
	public void itemAdd() throws InterruptedException
	{
		Thread.sleep(12000);
		item.click();
		Thread.sleep(9000);
		additem.click();
		Thread.sleep(2000);
		
		Select branddropdown=new Select(brand);
		branddropdown.selectByVisibleText("brandnew");
		
		Select contactdropdown=new Select(contactperson);
		contactdropdown.selectByVisibleText("Shweta");
		
		itemname.sendKeys("item9087");
		
		itemnumber.sendKeys("122");
		
		savebutton.click();
		
		
	}

		
	
	
	
	
	
	
}
