package Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_latest_feature2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String parentID = it.next();
		String childID = it.next();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().window(childID);
		
		driver.get("https://rahulshettyacademy.com/");
		String courseString = driver.findElements(By.xpath("//h2/a")).get(1).getText();
		
		
		driver.switchTo().window(parentID);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(courseString);
		
		//Screenshot of webelement
		WebElement Ele = driver.findElement(By.xpath("//input[@name='name']"));
		File file = Ele.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\RODA001\\screenshot1.png"));
		
		
		//getting dimentions
		
		System.out.println(Ele.getRect().getDimension().getHeight());
		System.out.println(Ele.getRect().getDimension().getWidth());
		
		

	}

}
