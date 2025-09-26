package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		//By-text
		WebElement element = driver.findElement(By.xpath("//h2[@class='barone']"));
		driver.findElement(By.xpath(null));
	}

}
