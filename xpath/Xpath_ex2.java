package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ex2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		String name = driver.findElement(By.cssSelector("tbody tr:nth-child(4) td:nth-child(2)")).getText();
		String pass = driver.findElement(By.cssSelector("tbody tr:nth-child(5) td:nth-child(2)")).getText();
		System.out.println(name);
		System.out.println(pass);
		
		driver.navigate().to("https://demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
