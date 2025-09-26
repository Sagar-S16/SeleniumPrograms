package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathfollowingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https:the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		WebElement password = driver.findElement(By.xpath("//label[text()='Password']/folowing-sibling::input"));
		password.sendKeys("secret123");
		/*
		 * WebElement usernameLabel1 =
		 * driver.findElement(By.xpath("//input[@id='username']/following::input"));
		 * usernameLabel1.sendkeys("123");
		 */
		driver.quit();
	}

}