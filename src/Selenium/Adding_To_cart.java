package Selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Adding_To_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(5000);
		
		
		String[] itemsNeeded= {"Brocolli","Cucumber","Beetroot"};
		
		addElement(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();

		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));



		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.cssSelector("button.promoBtn")).click();

		//explicit wait



		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));



		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		System.out.println("First git update");
		
		
		
		
}
	public static void addElement(WebDriver driver, String[] itemsNeeded)
	{
		List<WebElement> availableProducts = driver.findElements(By.cssSelector("h4.product-name"));
		
		int j=0;
		for(int i=0; i<availableProducts.size(); i++)
		{
			
			
			String[] product = availableProducts.get(i).getText().split("-");
			String formattedProduct = product[0].trim();
			
			List<String> items = Arrays.asList(itemsNeeded);
			
			if(items.contains(formattedProduct))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}

	
		}
		
	}
}

