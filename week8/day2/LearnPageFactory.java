package week8.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LearnPageFactory {
	
	public RemoteWebDriver driver;
	
	public LearnPageFactory() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "username") WebElement eleUserName;
	@FindBy(how = How.ID, using = "password") WebElement elePassword;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit") WebElement eleLogin;
	
	@Test
	public void testCase() {		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		
		eleUserName.sendKeys("DemoSalesManager");
		elePassword.sendKeys("crmsfa");
		eleLogin.click();	
		
	}

}
