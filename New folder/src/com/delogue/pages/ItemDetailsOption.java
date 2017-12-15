/**
 * 
 */
package com.delogue.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author shwetap
 *
 */
public class ItemDetailsOption {
	
	@FindBy(how=How.XPATH,using="//a[@href='#itemTabItemDetailsColors']")
	WebElement details;
	
	@FindBy(how=How.CSS,using="#btnAddItemParts > span.ButtonText")
	WebElement adddetails;
	
	@FindBy(how=How.XPATH,using="//input[@type='text' and @name='ItemPart.Name']")
	WebElement description;
	
	@FindBy(how=How.XPATH,using="//textarea[@name='ItemPart.Composition']")
	WebElement composition;
	
	@FindBy(how=How.XPATH,using="//span[@name='btnSaveItemPart']")
	WebElement savedetails;
	
	@FindBy(how=How.XPATH,using="//span[@name='btnCancel']")
	WebElement canceldetails;
	
	
	@FindBy(how=How.XPATH,using="//span[text()='Add Color']")
	WebElement addcolor;
	
	@FindBy(how=How.CSS,using="#\33 62__ColorName")
	WebElement colorname;
	
	@FindBy(how=How.XPATH,using="//input[@type='text' and @name='362_Pantone']")
	WebElement pantone;
	
	@FindBy(how=How.XPATH,using="//span[@name='btnEditItemPart']")
	WebElement editdetails;
	
	@FindBy(how=How.XPATH,using="//span[@name='btnDeleteItemPart']")
	WebElement delete;
	
	@FindBy(how=How.XPATH,using="//span[@name='btnSaveColorCard']")
	WebElement savecolorcard;
	
	@FindBy(how=How.XPATH,using="//span[@name='btnCancel']")
	WebElement cancelcolorcard;
	
	@FindBy(how=How.XPATH,using="//button[@id='btnResetItemColorCardSearch']")
	WebElement cancelsearch;
	
	@FindBy(how=How.XPATH,using="//button[@id='btnSearchItemColorCard' and text()='Search']")
	WebElement search;
	
	
	
}
