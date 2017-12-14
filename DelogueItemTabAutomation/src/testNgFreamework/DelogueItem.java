package testNgFreamework;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class DelogueItem {

	WebDriver driver;
	@BeforeSuite
	public void printmessage()
	{
		System.out.println("Test execution has strated");
	}
	@BeforeClass
	public void Login()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("http://test.delogue.com");
		driver.findElement(By.xpath("//input[@type='text' and @id='Username']")).sendKeys("shwetap@headfitted.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shweta@123");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
	}
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void addItemDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Wait wait=new FluentWait(driver)
				.withTimeout(10000, TimeUnit.MICROSECONDS).pollingEvery(50, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		WebElement element=(WebElement) wait.until(new Function() {
			@Override
			public Object apply(Object arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			});
		
	
		element.click();

		
		/*
		//Thread.sleep(1000);		
		WebElement brand=driver.findElement(By.cssSelector("#selectBrand"));
		Select branddropdown=new Select(brand);
		branddropdown.selectByVisibleText("brandnew");
		
		Select supplierdropdown=new Select(driver.findElement(By.cssSelector("#selectSupplier")));
		supplierdropdown.selectByVisibleText("new supplier");
		
		Select contctp=new Select(driver.findElement(By.cssSelector("#selectCompanyContactPerson")));
		contctp.selectByVisibleText("Shweta");
		//item name and number
		driver.findElement(By.cssSelector("#txtItemTabItemNumber")).sendKeys("105");
		driver.findElement(By.cssSelector("#txtItemTabItemName")).sendKeys("Item-adc");
			
		//default quantity
		driver.findElement(By.cssSelector("#txtDefaultQty")).sendKeys("4");
		
		//save button
		driver.findElement(By.cssSelector("span.save-icon.pull-right")).click();
		
		*/
	}
	
	
	
}
