package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Window.html");
		
		String parentWindow = driver.getWindowHandle();
		
		//Click on the open new window button
		driver.findElementById("home").click();
		
		
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//To get the unique ref of all the window opened in the current session
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		//To get a particular value from the set, we move it inside the list
		List<String> listOfWindows = new ArrayList<>();
		listOfWindows.addAll(windowHandles);
		//To switch to the new window
		driver.switchTo().window(listOfWindows.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
//		driver.switchTo().window(listOfWindows.get(0));
		driver.switchTo().window(parentWindow);
		System.out.println("**********************");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
