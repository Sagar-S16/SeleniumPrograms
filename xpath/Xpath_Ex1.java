package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.guru99.com/V4/");
			
			driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr26593");
			
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12!@");
			
			driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			
			driver.findElement(By.xpath("//input[@name='btnReset']")).click();
			
			System.out.println("username is created");
			System.out.println("password is created");
			
			Thread.sleep(2000);
			driver.quit();
			
	}

}
