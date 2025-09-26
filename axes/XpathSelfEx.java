package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelfEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']/self::input"));
		
		username.sendKeys("tomsmith");
		
		//driver.quit();

	}

}
