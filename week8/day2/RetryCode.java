package week8.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RetryCode {
	
	@Test
	public void sample() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leafground.com/pages/Window.html");
		
		driver.findElementById("home1").click();
		
	}

}
