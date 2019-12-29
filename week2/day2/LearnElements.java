package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Entering source station
		WebElement eleSource = driver.findElementById("txtStationFrom");
		eleSource.clear();
		eleSource.sendKeys("MAS",Keys.TAB);
		
		//Entering the destination
		WebElement eleDestiny = driver.findElementById("txtStationTo");
		eleDestiny.clear();
		eleDestiny.sendKeys("CSTM",Keys.TAB);
		
		//unchecking sort on date check box
		driver.findElementById("chkSelectDateOnly").click();
		
		/*To find multiple elements
		List<WebElement> eleTrainNames = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr/td[2]/a");
		For getting text from each element
		for (WebElement eachElement : eleTrainNames) {
			String trainName = eachElement.getText();
			System.out.println(trainName);
		}*/
		
		//Webtable handling
		WebElement eleTable = driver.findElementByXPath
				("//table[@class='DataTable TrainList TrainListHeader']");
		//For getting all the rows from the table(WebElement)
		List<WebElement> allRows = eleTable.findElements(By.tagName("tr"));
		//Iterating over the rows to get each row
		for (int i = 0; i < allRows.size(); i++) {
		//Getting all cols from each row
			List<WebElement> allCols = allRows
					.get(i).findElements(By.tagName("td"));
			WebElement eachTrain = allCols.get(0);
			String eachTrainName = eachTrain.getText();
			System.out.println(eachTrainName);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
