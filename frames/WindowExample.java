package frames;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("click here")).click();
		//Get all handles
		String parentWindow = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		//switch to child handle
		for(String handle : handles) {
			if(!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		//switch back to parent
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
