package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		//switch to frame by name or ID
		driver.switchTo().frame("frame1");
		
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		
		// switch back to main page content
		//driver.switchTo().defaultContent();
		
		//close browser
		driver.close();
	}

}
