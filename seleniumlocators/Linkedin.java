package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.className("ytSearchboxComponentInput")).sendKeys("search a song and play");
		
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		
		System.out.println("Youtube playing");
		 
		
		Thread.sleep(4000);
		driver.close();

	}

}
