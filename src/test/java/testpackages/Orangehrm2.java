package testpackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Orangehrm2 {
	WebDriver driver;
	@BeforeClass	
	public void Setuptest() {		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void Orangehrm() {	
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	}
	
	@Test
	public void loginpage() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		//Actions act=new Actions(driver);
	//WebElement ele=driver.findElement(By.id("menu_admin_viewAdminModule"));
		//act.moveToElement(ele).perform();
	
		
		
		
	
	
	
	
	
	
	
	

}}
