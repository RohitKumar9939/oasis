package Rahul;

import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		  driver.findElement(By.id("username")).sendKeys("admin");
		  
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.linkText("Login")).click();
		  Thread.sleep(3000);
		  driver.navigate().refresh();
		  driver.findElement(By.id("container_users")).click();

	}
}
