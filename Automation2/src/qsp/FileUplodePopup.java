package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplodePopup {
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver =new ChromeDriver();
			driver.get("C:\\Users\\ROHIT KUMAR\\Desktop\\uplodpopou.html");
			Thread.sleep(3000);
			driver.findElement(By.id("CV")).sendKeys("C:\\Users\\ROHIT KUMAR\\Desktop\\Resume.docx");

	}

}
