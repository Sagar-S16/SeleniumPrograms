package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.className("ytSearchboxComponentInput")).sendKeys("KGF Song");
		
		driver.findElement(By.className("ytSearchboxComponentSearchButton")).click();
		
		driver.findElement(By.id("inline-preview-player")).click();
		
		
		Thread.sleep(100000);
		System.out.println("clicked using classname");
		driver.quit();
	}

}
