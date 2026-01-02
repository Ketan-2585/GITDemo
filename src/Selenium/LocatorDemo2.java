package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name="virat";
		 
		WebDriver driver=new ChromeDriver();
		
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//String password = getPassword(driver);
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.cssSelector(".signInBtn")).click();
		
		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
		
		

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		Thread.sleep(1000);
		
		String passwordText = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		Thread.sleep(2000);
		
		String[] PasswordArray = passwordText.split("'");
		
		String passwordArray2 = PasswordArray[1].split("'")[0];
		
		System.out.println(passwordArray2);
		
		return passwordArray2;
		
		
	
		
	}
	

}
