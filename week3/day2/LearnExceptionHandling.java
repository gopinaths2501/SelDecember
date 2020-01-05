package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnExceptionHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		try {
			driver.findElementByXPath("//button[text()='x']").click();

			WebElement eleElectronics = driver
					.findElementByXPath("//span[text()='Electronics']");

			// To hover on electronics
			Actions builder = new Actions(driver);
			builder
			.moveToElement(eleElectronics)
			.pause(2000)
			.click(driver.findElementByXPath("//a[text()='Apple']"))
			.perform();
		} catch (NoSuchElementException e) {
			System.err.println("The element is not found, use different locator");
		} finally { // close the browser irrespective of failure or success
			driver.close();
		} // gets executed on either case















	}
}
