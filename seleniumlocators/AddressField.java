package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddressField {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

      
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        
       driver.findElement(By.name("address1")).sendKeys("123 Main Street, Bangalore");

        

        
        System.out.println("Address entered successfully");
        Thread.sleep(30000);

        // Close the browser
        driver.quit();
    }
}

