package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.className("nav-link")).click();
		System.out.println("clicked using classname");
		driver.quit();
	}

}
