package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("#start button")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement helloText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
		System.out.println(helloText.getText());
		driver.quit();
	}

}

//visibility problem
//For single element we are using above method