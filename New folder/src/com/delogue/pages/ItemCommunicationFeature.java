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
public class ItemCommunicationFeature {
	@FindBy(how=How.XPATH, using="//a[@href='#itemTabItemDetailsCommunication']")
	WebElement communication;
	
	@FindBy(how=How.XPATH, using="//span[@class='ButtonText' and text()='New Message']")
	WebElement newmessage;

	@FindBy(how=How.CSS, using="#txtItemCommunicationMessageSubject")
	WebElement subject;
	
	@FindBy(how=How.XPATH,using="//input[@id='chkItemCommInternalOnly' and @type='checkbox']")
	WebElement onlyinternalchkbox;
	
	@FindBy(how=How.CSS, using="#cmbItemCommNotifyUsers")
	WebElement notifydropdown;
	
	@FindBy(how=How.CSS, using="#redactor-toolbar-0 > li:nth-child(1) > a")
	WebElement bold;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"redactor-toolbar-0\"]/li[2]/a")
	WebElement italic;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"redactor-toolbar-0\"]/li[3]/a")
	WebElement underline;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"redactor-toolbar-0\"]/li[4]/a")
	WebElement unordered;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"redactor-toolbar-0\"]/li[5]/a")
	WebElement fontcolor;
	
	@FindBy(how=How.XPATH, using="div[@class='redactor-editor redactor-linebreaks']")
	WebElement textbox;
	
	@FindBy(how=How.CSS, using="#btnUploadItemCommunicationFile")
	WebElement attachfile;
	
	@FindBy(how=How.CSS,using="#btnItemCommOk")
	WebDriver okbutton;
	
	@FindBy(how=How.CSS,using="#btnItemCommCancel")
	WebElement cancelbutton;
	
	@FindBy(how=How.CSS,using="#itemTabItemDetailsCommunication > div.CommunicationDivHeader.clearfix > div > div.CommLogFilterControls.pull-left.sub-content-toolbar-left > div > div:nth-child(1) > label")
	WebElement messgaes;
	
	@FindBy(how=How.XPATH, using="//span[@class='pull-left checkInternalOnlyText' and text()='Sample comments']")
	WebElement sampledocuments;
	
	@FindBy(how=How.XPATH, using="//span[@class='pull-left checkInternalOnlyText' and text()='Log changes']")
	WebElement logchanges;
	
	@FindBy(how=How.XPATH, using="//span[@class='pull-left checkInternalOnlyText' and text()='Price']")
	WebElement price;
	
	@FindBy(how=How.XPATH,using="//span[@class='pull-left checkInternalOnlyText' and text()='Messages']")
	WebElement messageschechbox;
	
	@FindBy(how=How.CSS,using="#txtItemCommSearch")
	WebElement search;
	
	
}
