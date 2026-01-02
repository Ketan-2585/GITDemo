package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStatic_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		 Select staticDropdown = new Select(element);
		 
		 staticDropdown.selectByIndex(3);
		 System.out.println(staticDropdown.getFirstSelectedOption().getText());
		 
		 staticDropdown.selectByValue("INR");
		 System.out.println(staticDropdown.getFirstSelectedOption().getText());
		 
		 staticDropdown.selectByVisibleText("AED");
		 System.out.println(staticDropdown.getFirstSelectedOption().getText());
		
	}

}
