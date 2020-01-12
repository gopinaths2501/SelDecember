package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementByXPath("//button[text()='✕']").click();
	
	WebElement eleElectronics = driver
			.findElementByXPath("//span[text()='Electronics']");
	
	// To hover on electronics
	Actions builder = new Actions(driver);
	builder
	.moveToElement(eleElectronics)
	.pause(2000)
	.click(driver.findElementByXPath("//a[text()='Apple']"))
	.perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
