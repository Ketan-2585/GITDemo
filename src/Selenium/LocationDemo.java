package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;






public class LocationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String name="virat";
		 
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//String password = getPassword(driver);
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("virat");
		
		driver.findElement(By.cssSelector(".signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("virat@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8787865");
		
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		
		//System.out.println(driver.findElement(By.cssSelector("p.infoMsg")));
		
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		
		driver.findElement(By.cssSelector("button.submit")).click();
		Thread.sleep(2000);
		
		
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		
	}
	


}
