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
public class ItemSizeOption {
	
	WebDriver driver;
	
	public ItemSizeOption(WebDriver driver) {
		this.driver=driver;
		
	}
	//size tab
	@FindBy(how=How.XPATH, using="//a[@href='#itemTabItemDetailsSizes']")
	WebElement size;
	//add new size
	@FindBy(how=How.CSS, using="#btnAddItemSize > span.ButtonText")
	WebElement addnewsize;
	//new item name textbox
	@FindBy(how=How.XPATH, using="//input[@type='text'  and  @name='ItemSize.Name']")
	WebElement newitemtextbox;
	
	@FindBy(how=How.CSS, using="#\\2d 1 > td:nth-child(3) > label")
	WebElement active;
	
	@FindBy(how=How.XPATH, using="//span[@name='btnSaveItemSize']")
	WebElement savenewsize;
	
	@FindBy(how=How.CSS, using="#\\38 03327 > td.tableHeaderFirstColumnStyle")
	WebElement clicktoedit;
	
	@FindBy(how=How.XPATH, using="//span[@name='btnDeleteItemSize']")
	WebElement cancelbutton;
	
	@FindBy(how=How.CSS, using="/#btnConfirmOk")
	WebElement okpoupbutton;
	
	@FindBy(how=How.CSS, using="#btnConfirmCancel")
	WebElement cancelpopupbutton;
	
	public void clickOnSize() throws Exception
	{
		Thread.sleep(5000);
		size.click();
	}
	
	public void addNewSize(String sizes) throws Exception
	{
		Thread.sleep(3000);
		addnewsize.click();
		Thread.sleep(1000);
		newitemtextbox.sendKeys(sizes);
		//active.clear();
		Thread.sleep(1000);
		active.click();
		savenewsize.click();
		
	}
	public void editSize() throws InterruptedException
	{
		Thread.sleep(6000);
		clicktoedit.click();
		
		cancelbutton.click();
		
		Thread.sleep(3000);
		okpoupbutton.click();
		
	}
	
	
	
	

}
