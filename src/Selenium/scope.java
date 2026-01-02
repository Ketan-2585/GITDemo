package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
				//to get number of links in page
				int size = driver.findElements(By.tagName("a")).size();
				System.out.println(size);
				
				
				//to get number of links particular space
				
				WebElement footDriver = driver.findElement(By.id("gf-BIG"));
				
				System.out.println(footDriver.findElements(By.tagName("a")).size());
				
				//to get get links of particular table
				WebElement footdriver1 = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				
				System.out.println(footdriver1.findElements(By.tagName("a")).size());
				
				
				
				for(int i=1; i<footdriver1.findElements(By.tagName("a")).size(); i++)
				{
					String clickONlINK = Keys.chord(Keys.CONTROL,Keys.ENTER);
					
					footdriver1.findElements(By.tagName("a")).get(i).sendKeys(clickONlINK);
					Thread.sleep(4000);
				}
				
				Set<String> window = driver.getWindowHandles();
				Iterator<String> it = window.iterator();
				
				while(it.hasNext())
				{
					driver.switchTo().window(it.next());
					System.out.println(driver.getTitle());
					Thread.sleep(2000);
				}
				
				
	}
	
	

	
}
