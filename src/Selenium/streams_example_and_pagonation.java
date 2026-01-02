package Selenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streams_example_and_pagonation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		//comparing lists before and after sorting
		driver.findElement(By.xpath("//tr/th")).click();
		
		 List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));
		 
		 List<String> originalList = elements.stream().map(s->s.getText()).collect(Collectors.toList());
		 
		 List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		 
		 Assert.assertTrue(originalList.equals(sortedList));
		 
		 //handling pagination
		 List<String> price;
		 
		 do {
			 List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			 
			price= rows.stream().filter(s->s.getText().contains("Rice")).map(s-> getPrice(s)).collect(Collectors.toList());
			 
			price.stream().forEach(a-> System.out.println(a));
			
			if(price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
				Thread.sleep(2000);
				
			}
			 
			 
			 
		 }while(price.size()<1);
		 

	}
	
	public static String getPrice(WebElement s)
	{
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return priceValue;
		
	}

}
