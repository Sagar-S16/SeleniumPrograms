package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathParentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https:the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		WebElement parentDiv = driver.findElement(By.xpath("//input[@id='username']/parent::div"));
		
		driver.quit();
	}

}
