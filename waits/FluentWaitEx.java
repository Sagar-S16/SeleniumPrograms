package waits;
 
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
 
public class FluentWaitEx {
 
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Selenium");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		
		WebElement firstSuggestion = wait.until(new Function<WebDriver,WebElement>(){ // anonymous class
			public WebElement apply(WebDriver driver) {
				WebElement suggestion = driver.findElement(By.xpath("//ul[@role='listbox']//li[1]"));
				if(suggestion.isDisplayed()) {
					return suggestion;
				}
				return null;
			}});
			System.out.println("First suggestion"+ firstSuggestion.getText());
	}
 
}