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

public class FluentWaitEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		//click on timer so clock will start
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		//create object of fluentWait class and pass WebDriver as input
		//List<String> list = new ArrayList<String>(); Generic and dynamic dispatch
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		WebElement element = wait.until(new Function<WebDriver,WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement ele = driver.findElement(By.xpath(".//*[@id='demo']"));
				String value = ele.getAttribute("innerHTML");
				if(value.equalsIgnoreCase("WebDriver")) {
					return ele;
				}
				else {
					System.out.println("Text is coming on a screen " + value);
					return null;
				}
			}
		});
		System.out.println(element.isDisplayed());
		driver.close();
	}

}
