package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert accept
		alert.accept();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(1000);
		System.out.println("alert accepted");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		Thread.sleep(1000);
		System.out.println("alert dismissed");
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		alert.sendKeys("Sagar S is a Automation tester");
		driver.switchTo().alert();
		
		alert.accept();
		System.out.println("Prompt accept");
		driver.quit();
		
	
	}

}
