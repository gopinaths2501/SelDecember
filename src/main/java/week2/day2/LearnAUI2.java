package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/selectable.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	

	
	
	
	Actions builder = new Actions(driver);
	builder
	.keyDown(Keys.CONTROL)
	.click(driver.findElementByXPath("//*[text()='Item 1']"))	
	.click(driver.findElementByXPath("//*[text()='Item 3']"))
	.click(driver.findElementByXPath("//*[text()='Item 5']"))	
	.click(driver.findElementByXPath("//*[text()='Item 7']"))
	.release()
	.perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
