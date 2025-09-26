package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
//		driver.findElement(By.name("login")).click();
		driver.findElement(By.className("_51sy")).click();
		System.out.println("Login button located successfully");
		Thread.sleep(1000);
		driver.close();

	}

}
