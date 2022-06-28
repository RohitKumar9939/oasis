package Rahul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Facbook {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("rohitakumar01@gmail.com");
		driver.navigate().refresh();//stale element reference exception
		driver.findElement(By.id("pass")).sendKeys("rohit9939");
		driver.findElement(By.name("login")).click();
		 

	}

}
