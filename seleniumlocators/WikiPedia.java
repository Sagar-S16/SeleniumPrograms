package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPedia {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.findElement(By.id("searchInput")).sendKeys("Selenium Automation");
		
		driver.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
		Thread.sleep(30000);
		System.out.println("Search text entered successfully");
		
		driver.close();
		
	}

}
