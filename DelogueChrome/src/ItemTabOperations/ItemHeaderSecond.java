package ItemTabOperations;
// in this class the delogue is accessed by using balaji's id

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ItemHeaderSecond {

	WebDriver driver;

	@BeforeClass
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://test.delogue.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logIn()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//enter login id
		driver.findElement(By.xpath("//input[@type='text' and @id='Username']")).sendKeys("shwetap@headfitted.com");
		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shweta@123");
		//click login button
		driver.findElement(By.xpath("//button[@name='submit']")).click();
	}
}
