package actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AutoSearch_Or_Ajax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/autocomplete/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className("demo-frame"))));
		driver.findElement(By.id("tags")).sendKeys("b");
		WebElement element = driver.findElement(By.id("ui-id-1"));
		wait.until(ExpectedConditions.visibilityOf(element));
		List<WebElement> list = driver.findElements(By.className("ui-menu-item"));
		int size_list = list.size();
		System.out.println(size_list);
		for(int i =0 ;i<size_list;i++) {
			String text = list.get(i).getText();
			if(text.contentEquals("BASIC")) {
				list.get(i).click();
				break;
			}
		}
		driver.close();
	
	}

}
