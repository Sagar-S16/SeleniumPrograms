package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Windows.html");
        WebElement clickButton = driver.findElement(By.xpath("//button[contains(text(),'click')]"));
        clickButton.click();
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
                System.out.println("New Window Title: " + driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindow);
        System.out.println("Parent Window Title: " + driver.getTitle());
        driver.quit();
    }
}

