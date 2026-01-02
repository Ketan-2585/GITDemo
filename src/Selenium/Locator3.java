package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             WebDriver driver=new ChromeDriver();
             driver.get("https://rahulshettyacademy.com/AutomationPractice/");
             
             driver.manage().window().maximize();
             
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
             
             driver.navigate().to("https://google.com");
             
             driver.navigate().back();
             driver.navigate().forward();
             driver.navigate().back();
             
             
	}

}
