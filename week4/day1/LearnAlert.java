package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", 
				"./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, 
				TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Alert.html");
		driver.findElementByXPath("//button[text()='Alert Box']").click();
//		To handle alert
		TargetLocator switchTo = driver.switchTo();
		Alert alert = switchTo.alert();
		String alertText = alert.getText();
		alert.accept();
		System.out.println(alertText);
		
		driver.findElementByXPath("//button[text()='Confirm Box']").click();
		driver.switchTo().alert().dismiss();
		
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("LearnAlert");
		Thread.sleep(3000);
		alert2.accept();
		










	}

}
