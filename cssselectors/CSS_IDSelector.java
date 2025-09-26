package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_IDSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		//tag + attribute
		//driver.findElement(By.cssSelector("input[placeholder = 'Username']")).sendKeys("standard_user");
		
		//class selector
		//driver.findElement(By.cssSelector(".input_error.form_input")).sendKeys("standard_user");
		
		//id selector
		//driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		
		//class selector
		//driver.findElement(By.cssSelector(".submit-button.btn_action")).click();
		
		//partial attribute matching
		//contains
		driver.findElement(By.cssSelector("input[id*='user']")).sendKeys("standard_user");
		
		//starts_with		 
		driver.findElement(By.cssSelector("input[id^='pass']")).sendKeys("secret_sauce");
		
		//ends_with
		driver.findElement(By.cssSelector("input[id$='button']")).click();
	
		
		
		Thread.sleep(50000);
		driver.quit();
		
	}

}
