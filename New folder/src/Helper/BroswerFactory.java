/**
 * 
 */
package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author shwetap
 *
 */
public class BroswerFactory {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername, String url)
	{
		if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "");
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
		
		return driver;
	}

}
