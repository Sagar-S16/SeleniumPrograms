package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled_InvocationCount_TimeoutExample {
	WebDriver driver ;
	@BeforeMethod
  
  public void setUp() {
	 // System.out.println("Opening browser and launching URL");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/V4/");
  }
@Test(enabled = true,invocationCount=1, timeOut = 1000)
public void verifyLoginuser() {
	driver.findElement(By.name("uid")).sendKeys("mngr635758");
	driver.findElement(By.name("password")).sendKeys("jenAnYj");
	driver.findElement(By.name("btnLogin")).click();
	System.out.println("Correct credentials");
	System.out.println("Timeout applied for 3 secs");
}
@Test(dependsOnMethods = {"verifyLoginuser"},enabled=true, invocationCount=1, timeOut = 1000)
public void verifyLoginuser1() {
	driver.findElement(By.name("uid")).sendKeys("Sagar");
	driver.findElement(By.name("password")).sendKeys("sag@1234");
	driver.findElement(By.name("btnLogin")).click();
	System.out.println("invalid credentials");
	System.out.println("Time applied for 2secs");
//driver.findElement(By.xpath("//td[normalize-space()='Manger Id : mngr635758']")).click();
	
	driver.quit();
	
}
}
