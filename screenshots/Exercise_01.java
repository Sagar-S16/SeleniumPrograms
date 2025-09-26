package screenshots;

import java.io.File;
import java.io.IOException;
 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
 
public class Exercise_01 {
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		File fullScreenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(fullScreenshot, new File("./Screenshot/googlePage.png/"));
		
		driver.quit();
 
	}
}
