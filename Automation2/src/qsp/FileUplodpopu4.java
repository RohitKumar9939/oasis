package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplodpopu4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver = new ChromeDriver();
		//Enter the URL
		driver.get("C:\\\\Users\\\\ROHIT KUMAR\\\\Desktop\\\\uplodpopou.html");
		//Mantel 
		Thread.sleep(3000);
		File f=new File("./data/Resume.docx");
		//GENERAT ABSOLUTE PATH
		String ab =f.getAbsolutePath();
		//T6 the CV
		driver.findElement(By.id("CV")).sendKeys(ab);//

	}

}
