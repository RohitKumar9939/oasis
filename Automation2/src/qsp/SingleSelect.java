package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	static
	{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/ROHIT%20KUMAR/Desktop/d.html");
		WebElement dd = driver.findElement(By.id("mtr"));
		Select s= new Select(dd);
		s.selectByIndex(4);
		 
   
     

	}

}
