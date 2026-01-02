package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Selenium_latest_features1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//friendly locators
		//1) above() 2)below() 3)toLeftof()  4)toRightof()
		WebElement webElement = driver.findElement(By.xpath("//input[@name='name']"));
		
		System.out.println( driver.findElement(with(By.tagName("label")).above(webElement)).getText());
		

	}

}
