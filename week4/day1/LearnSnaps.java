package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnaps {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Window.html");
		
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/snap01.png");
		FileUtils.copyFile(src, dest);
		
		WebElement homeBtn = driver.findElementById("home");
		File src1 = homeBtn.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./snaps/snap02.png");
		FileUtils.copyFile(src1, dest1);
		
		
	}

}
