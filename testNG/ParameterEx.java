package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class ParameterEx {
    WebDriver driver;
 
    // Setup browser based on parameter (cross browser testing)
    @BeforeClass
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }
        driver.manage().window().maximize();
    }
 
    // Test using URL parameter
    @Test
    @Parameters("url")
    public void loginTest(@Optional("https://www.saucedemo.com/") String url) {
        driver.get(url);
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println("Page Title: " + driver.getTitle());
    }
 
    @AfterMethod
    public void tearDown() {
        System.out.println("Browser is closed");
        driver.quit();
    }
}