package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.calculator.net/");
			driver.findElement(By.name("calcSearchTerm")).sendKeys("BMI Calculator");
			System.out.println("Search box used by Name");
			WebElement login = driver.findElement(By.id("bluebtn"));
			//driver.navigate().to("https://www.calculator.net/anorexic-bmi-calculator.html");
			login.click();
			Thread.sleep(3000);
			driver.quit();
	}

}
