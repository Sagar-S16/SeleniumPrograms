package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions actions =  new Actions(driver);
		actions.contextClick(rightClickButton).perform();
		System.out.println("Right click performed");
		driver.quit();
	}

}
