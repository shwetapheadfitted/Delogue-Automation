package ItemTabOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ItemHeader {
	
	WebDriver driver;
	Actions action;
	

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
	@Test(dependsOnMethods= {"logIn"})
	public void addItem() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//click on item 
		driver.findElement(By.cssSelector("a#itemTabLink")).click();
		//click on add button
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button#btnCreateItem.green-button-dark")).click();
		//selecting brand 
		WebElement brand=driver.findElement(By.cssSelector("#selectBrand"));
		Select branddropdown=new Select(brand);
		branddropdown.selectByVisibleText("brandnew");
		
		//selecting contact person
		WebElement contactperson=driver.findElement(By.cssSelector("#selectCompanyContactPerson"));
		Select contactdropdown=new Select(contactperson);
		contactdropdown.selectByVisibleText("Balaji");
		
		//entering item name 
		driver.findElement(By.cssSelector("#txtItemTabItemName")).sendKeys("ChromeItem118");
		
		//click on save
		driver.findElement(By.cssSelector("span.save-icon.pull-right")).click();
		
	}
	@Test(dependsOnMethods= {"addItem"})
	public void editItemHeader() throws InterruptedException	
	{
		//select the item to edit
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[@name='ChromeItem102']")).click();
		action=new Actions(driver);
		//double click to edit 
		Thread.sleep(6000);
		WebElement element=driver.findElement(By.xpath("//label[text()='Item no:']"));
		//JavascriptExecutor exe=(JavascriptExecutor)driver;
		//exe.executeScript("arguments[0].setAttribute('style','display: block;');", element);
		//System.out.println(element.getText());
		
		action.doubleClick(element).build().perform();
	}
	@Test(dependsOnMethods= {"editItemHeader"})
	public void readExcel() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		File file=new File("C:\\Users\\shwetap\\Downloads\\ItemDetails (2).xlsx");
		
		FileInputStream is=new FileInputStream(file);
		
		XSSFWorkbook xf=new XSSFWorkbook(is);
		
		XSSFSheet sheet=xf.getSheet("Sheet1");
		
		//double itemno=sheet.getRow(1).getCell(1).getNumericCellValue();
		
		//String itemn=Double.toString(itemno);
		String itemno=sheet.getRow(1).getCell(0).getStringCellValue();
		
		//item name inserted
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#txtItemTabItemNumber")).sendKeys(itemno);
		
		String itemdesc=sheet.getRow(1).getCell(1).getStringCellValue();
		
		//item description inserted
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#txtItemTabItemDescription")).sendKeys(itemdesc);
		
		
		
		xf.close();
		
		
		
	}
	
	@Test(dependsOnMethods= {"readExcel"})
	public void exit() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Thread.sleep(1000);
		driver.close();
	}
	

}
