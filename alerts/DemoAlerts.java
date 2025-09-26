package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		driver.findElement(By.id("timeralertButton")).click();
		driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.id("promtButton")).sendKeys("Prompt button");
		driver.switchTo().alert();
		alert.accept();
		
		driver.close();
		
		

	}

}
