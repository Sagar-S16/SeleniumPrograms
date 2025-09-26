package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.className("btn btn-link navbar-btn")).click();
		System.out.println("Clicked login using LinkText");
	}

}
