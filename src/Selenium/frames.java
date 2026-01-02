package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		  Actions a = new Actions(driver);
		  
		  WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));	
		  WebElement destination = driver.findElement(By.xpath("//div[@id='droppable']"));	
		  
		  a.dragAndDrop(source, destination).build().perform();

	}

}


