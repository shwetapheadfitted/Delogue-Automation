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
public class AdminCompanyInfo {

	
	@FindBy(how=How.CSS, using="#adminTabLink > div")
	WebElement admintab;
	
	@FindBy(how=How.XPATH, using="//a[text()='Company info']")
	WebElement companyinfo;
	
	@FindBy(how=How.CSS, using="#lblCompanyName")
	WebElement companyname;
	
	@FindBy(how=How.CSS, using="#txtAddress")
	WebElement address;
	
	@FindBy(how=How.CSS,using="#txtZipCode")
	WebElement zipcode;
	
	@FindBy(how=How.CSS,using="#txtCity")
	WebElement city;
	
	@FindBy(how=How.CSS, using="#txtStateOrRegion")
	WebElement state;
	
	@FindBy(how=How.CSS,using="#cbxCountry")
	WebElement country;
	
	@FindBy(how=How.CSS,using="#txtVATNumber")
	WebElement vatnumber;
	
	@FindBy(how=How.CSS, using="#txtWebsite")
	WebElement website;
	
	@FindBy(how=How.CSS, using="#txtPhoneNo")
	WebElement phoneno;
	
	@FindBy(how=How.CSS,using="#txtFaxNo")
	WebElement faxno;
	
	@FindBy(how=How.CSS,using="#txtContactPerson")
	WebElement contactperson;
	
	@FindBy(how=How.CSS, using="#txtContactEmailAddress")
	WebElement contactemail;
	
	@FindBy(how=How.CSS,using="#cbxIsUniqueStyleNo")
	WebElement uniquestyle;
	
	@FindBy(how=How.CSS,using="#cbxAutoStyleNo")
	WebElement autostyle;
	
	@FindBy(how=How.NAME,using="btnSaveCompanyInfo")
	WebElement savebutton;
	
	@FindBy(how=How.NAME,using="btnCancelCompanyInfo")
	WebElement cancelbutton;
	
	@FindBy(how=How.ID,using="btnAddCompanyUser")
	WebElement adduser;
	
	@FindBy(how=How.XPATH,using="//input[@name='User.Name']")
	WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@name='User.Email']")
	WebElement useremail;
	
	@FindBy(how=How.XPATH,using="//select[@title='Select Role']")
	WebElement selectrole;
	
	
}
