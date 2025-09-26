package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me to See Alert']"));
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.accept();
		driver.quit();

	}

}
