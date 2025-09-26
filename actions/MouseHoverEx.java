package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Actions actions = new Actions(driver);
		WebElement loginMenu = driver.findElement(By.xpath("//span[text()='Login']"));
		actions.moveToElement(loginMenu).perform();
		System.out.println("mouse hover performed");
		driver.quit();
	}

}
