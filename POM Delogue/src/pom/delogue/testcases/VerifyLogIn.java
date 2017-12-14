/**
 * 
 */
package pom.delogue.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.delogue.pages.LogInPage;

/**
 * @author shwetap
 *
 */
public class VerifyLogIn {
	
	@Test
	public void verifyValidLogIn()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("http://test.delogue.com");
		
		LogInPage login=new LogInPage(driver);
		
		login.typeUsername();
		login.typePassword();
		login.clickButton();
		
		driver.quit();
	}

}
