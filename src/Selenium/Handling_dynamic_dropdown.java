package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_dynamic_dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(5000);
		
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		//driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1'][1]")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		//driver.findElement(By.xpath("//div[@class='left1'] //select[@name='ctl00$mainContent$ddl_originStation1']")).click();
		
		//issue with element in departure dropdown.
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_originStation1']  //option[@value='BLR']")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//div[@class='right1'] //option[@value='MAA']")).click();
	}

}
