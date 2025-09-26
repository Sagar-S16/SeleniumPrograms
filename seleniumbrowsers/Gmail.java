package seleniumbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://outlook.live.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String handle =driver.getWindowHandle();
		System.out.println(handle);
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.close();
		
		//driver.get("");
		//driver.close();
		Thread.sleep(10000);
		driver.quit();
	}

}


