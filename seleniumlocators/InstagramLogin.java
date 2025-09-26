package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.instagram.com/accounts/login/");

        
        Thread.sleep(5000);

        
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));

        
        username.sendKeys("9945661506");
        password.sendKeys("Sagar@1608");

        
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        System.out.println("Login attempted on Instagram");

        
        Thread.sleep(5000);
        driver.quit();
    }
}

