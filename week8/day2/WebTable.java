package week8.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	
	@Test
	public void sample() {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/sorttable.html");	
		String val = "1019";		
		
		String text = driver.findElementByXPath("(//td[text()='"+val+"']/following-sibling::td)[last()]").getText();
	    System.out.println(text);
	}
	
	
	
	
	
	
	

}
