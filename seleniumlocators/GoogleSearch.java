package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("Hassan");
		driver.findElement(By.className("gNO89b")).click();
		System.out.println("clicked using classname");
		
		driver.quit();
	}

}
