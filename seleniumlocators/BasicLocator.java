package seleniumlocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
			driver.get("https://www.wikipedia.org");
			WebElement name = driver.findElement(By.tagName("p"));
			
			System.out.println(name);
			
			driver.findElements(By.className(" "));
			
			Thread.sleep(1000);
			
			driver.quit();
	}

}
