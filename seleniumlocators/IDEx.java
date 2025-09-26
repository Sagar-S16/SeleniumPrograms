package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class IDEx {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.saucedemo.com/");
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login =driver.findElement(By.id("login-button"));
		login.click();
		 
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.navigate().refresh();
		
	    username.sendKeys("locked_out_user");
	    password.sendKeys("passwordd");
	    
		
		login.click();

		System.out.println("Username entered using ID");
		System.out.println("Password has been entererd");
		System.out.println("login button clicked");
		
		Thread.sleep(2000);
		driver.quit();

	}

}
