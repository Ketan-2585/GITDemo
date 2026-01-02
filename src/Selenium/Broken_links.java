package Selenium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Broken_links {


	

		public static void main(String[] args) throws MalformedURLException, IOException {
			// TODO Auto-generated method stub
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
			
			SoftAssert a = new SoftAssert();
			
			for(WebElement link: links)
			{
				
				String url = link.getAttribute("href");
				HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
				
				conn.setRequestMethod("HEAD");
				conn.connect();
				int code = conn.getResponseCode();
				
				a.assertTrue(code<400, "resp code is" + link.getText()+"code is " +code);
				
				
			}
			
			a.assertAll();

		}

	}


