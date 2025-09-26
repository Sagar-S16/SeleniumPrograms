package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_ParentChildSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Elemental Selenium")).click();
		driver.findElement(By.cssSelector("div.container.padding-vert--md>div.row.padding-bottom--none >div.col.col--8.col--offset-2>div.text--center>button"));
		
	}

}
