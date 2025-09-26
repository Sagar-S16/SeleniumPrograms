package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionExample {
  WebDriver driver;
  
  @Test
  public void openGoogle() {
	  driver = new ChromeDriver();
	  driver.get("https://www.selenium.dev/downloads/");
	  System.out.println(Thread.currentThread().getId());
	  driver.quit();
  }
  @Test
  public void openBing() {
	  driver = new ChromeDriver();
	  driver.get("https://www.selenium.dev/downloads/");
	  System.out.println(Thread.currentThread().getId());
	  driver.quit();
  }
  @Test
  public void openYahoo() {
	  driver = new ChromeDriver();
	  driver.get("https://www.selenium.dev/downloads/");
	  System.out.println(Thread.currentThread().getId());
	  driver.quit();
  }
  
}
