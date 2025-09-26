package seleniumlocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.healthasyst.com/");
		//driver.findElement(By.partialLinkText("Car")).click();
 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links);
		System.out.println(links.size());
		int count=0;
		for(WebElement link:links) {
			System.out.println(link.getText());
			count++;
		}
		System.out.println(count);
		driver.close();
		
 
		
	}
 
}
