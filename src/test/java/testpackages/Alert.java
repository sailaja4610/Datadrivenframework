package testpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import javafx.scene.text.Text;

public class Alert {
	 WebDriver driver;
	 public boolean isAlertpresent() {
		 try {
			 driver.switchTo().alert();
			 return true;
		 } catch(Exception e) {
			 return false;
		 }
	 }
  @Test
  public void google() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  driver.switchTo().alert().accept();
	  driver.switchTo().alert().dismiss();
	//  Alert text=driver.switchTo().alert();
			  
	 // System.out.println(Text.);
			  
  }
}
