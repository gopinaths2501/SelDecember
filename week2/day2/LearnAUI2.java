package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.switchTo().frame(0);
	
	
	WebElement eletobedrag = driver.findElementById("draggable");
	WebElement eleDropHere = driver.findElementById("droppable");
	
	Actions builder = new Actions(driver);
	builder.dragAndDrop(eletobedrag, eleDropHere).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
