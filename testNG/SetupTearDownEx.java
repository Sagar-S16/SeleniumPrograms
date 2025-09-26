package testNG;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetupTearDownEx {
  WebDriver driver;
  @BeforeMethod
  
  public void setUp() {
	  System.out.println("Opening browser and launching URL");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/v4/");
  }
  @Test(priority = 0)
  	public void verifyHomePageTitle() {
	  String title = driver.getTitle();
	  System.out.println(title);
  }
  @Test(priority = 1)
  	public void verifyCurrentUrl() throws InterruptedException{
  		String currentUrl = driver.getCurrentUrl();
  		System.out.println(currentUrl);
 }
  @AfterMethod
  	public void tearDown() {
	  System.out.println("closing the browser");
	  driver.quit();
  	}
}
