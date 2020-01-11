package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, 
				TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/frame.html");
//		Switching into a frame
		driver.switchTo().frame(7);
//		WebElement eleFrame = driver.findElementByXPath("//iframe1");
//		driver.switchTo().frame(eleFrame);
		driver.findElementById("Click").click();
//		To get outta frame
		driver.switchTo().defaultContent();
		String text = driver.findElementByXPath("//h1[contains(text(),'Fun with ')]").getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
