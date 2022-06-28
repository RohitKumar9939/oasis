package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wipro {
      
	static
       {
    	   System.setProperty("webdriver.chrome.driver" ,"./driver/chromedriver.exe");
    	   
       }
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//we are manage synchronization speed
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//open the url
		driver.get("https://www.google.com/");
		//search the wiper job
		driver.findElement(By.name("q")).sendKeys("wipro job"+Keys.ENTER);
		//print all links
		List<WebElement> wh = driver.findElements(By.xpath("//a"));
		//you select all link
		 for(int i=0;i<wh.size();i++)
		 {
			 //example it is fome of html
			 String s= wh.get(i).getAttribute("href");
			 System.out.println(s);
		 }
		
		
				

	}

}
