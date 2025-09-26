package actions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

class ExampleA10_KeyBoardEvents {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        Actions actions = new Actions(driver);
        driver.findElement(By.name("email")).sendKeys("selenium");

        // actions.sendKeys(KSampleText.txtKeys.ENTER).perform();
        actions.sendKeys(Keys.TAB)
               .sendKeys("webdriver")
               .pause(Duration.ofSeconds(1))
               .sendKeys(Keys.ENTER)
               .build()
               .perform();

        actions.sendKeys(Keys.TAB)
               .sendKeys("webdriver")
               .pause(Duration.ofSeconds(1))
               .build()
               .perform();

        actions.sendKeys(Keys.SHIFT)
               .sendKeys(Keys.TAB)
               .build()
               .perform();

        // driver.close();
    }
}