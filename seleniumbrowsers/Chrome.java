package seleniumbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String name = driver.getTitle();
		System.out.println(name);
		driver.navigate().to("https://www.healthasyst.com/");
		driver.navigate().back();
		driver.navigate().to("https://www.bing.com/");
		driver.navigate().refresh();
		String Handle = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
		System.out.println(handle);
		System.out.println(Handle);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.close();
		//driver.get("");
		//driver.close();
		driver.quit();
	}

}
