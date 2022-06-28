package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//go to vitiger.com
		driver.get("https://www.vtiger.com/");
		//mouse hover to resource tab
	 WebElement Resource = driver.findElement(By.partialLinkText("Resource"));
	 
		
	}

}
