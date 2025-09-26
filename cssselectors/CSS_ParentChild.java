package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_ParentChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
		Thread.sleep(50000);
		
		// Parent>child selector
	driver.findElement(By.cssSelector("div#content>div>button")).click();
	System.out.println("clicked add element button");
	
	
	Thread.sleep(20000);
	driver.quit();
	
	}

}
