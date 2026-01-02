package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_tab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
			Thread.sleep(2000);
			
			Set<String> wh = driver.getWindowHandles();	
			Iterator<String> it = wh.iterator();
			String parentID = it.next();
			String ChildId = it.next();
			
			driver.switchTo().window(ChildId);
			
			String email = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
			
			driver.switchTo().window(parentID);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
	}

}
