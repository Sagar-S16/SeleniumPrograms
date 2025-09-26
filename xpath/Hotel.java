package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Hotel {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get(" https://practice.expandtesting.com/dropdown");
        driver.findElement(By.xpath("//a[@id='examples-dropdown']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[normalize-space()='Examples']")).click();
        //driver.navigate().refresh();
        Thread.sleep(2000);
        driver.findElement(By.id("search-input")).sendKeys("Test Cases");
        Thread.sleep(2000);
        driver.findElement(By.id("search-button")).click();
    }
}
