package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPrecedingEx {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https:the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		WebElement usernameLabel = driver.findElement(By.xpath("//input[@id='username'])/preceding-sibling::label"));
		System.out.println(usernameLabel.getText());
		driver.quit();
	}

}