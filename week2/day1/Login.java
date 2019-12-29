package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static void main(String[] args) {
		// Launch the Chrome Browser -> Call ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// Load the url -> Leaftaps
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts()
		.implicitlyWait(30, TimeUnit.SECONDS);
		
		// To maximize the browser window
		driver.manage().window().maximize();
		// Enter the valid username to login
		driver.findElementByXPath("//input[@id='username']").sendKeys("Demosalesmanager");
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		// Enter the valid password to login
		driver.findElementByName("PASSWORD1").sendKeys("crmsfa");
		// Now, click on the login button
		driver.findElementByClassName("decorativeSubmit").click();

		// To verify login successful, verify the title

		String title = driver.getTitle();
		System.out.println("Title of the page " + title);

		// To Click on the CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();

		// driver.findElementById("createLeadForm_dataSourceId").sendKeys("Direct
		// Mail");

		// TO Select the drop down using Select Class
		// Step 1: Find the WebElement and Store
		WebElement eleSource = driver.findElementById("createLeadForm_dataSourceId");
		// Step 2: Create an Object for Select and pass the WebElement as input
		Select option = new Select(eleSource);
		// Step 3: Select any option using the following ways
		// To select the option using the index
		option.selectByIndex(2);
		// To select the option using the value
		option.selectByValue("LEAD_CONFERENCE");
		// To select the option using the visible Text
		option.selectByVisibleText("Existing Customer");

		List<WebElement> allOptions = option.getOptions();
		int size = allOptions.size();
		option.selectByIndex(size - 1);
		for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());
		}

		// To close the browser
		// driver.close();

	}

}
