package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLoginJSClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.name("username")).sendKeys("winvinaya.com");
		//driver.findElement(By.xpath("//input[@id='login-username']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('persistent').click()");
	}

}
