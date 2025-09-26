package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_Example3 {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();

       
        driver.get("https://jqueryui.com/resizable/");

        
        WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));

        
        driver.switchTo().frame(iframe);


        
        driver.switchTo().defaultContent();

        
        driver.quit();
    }
}


//WebElement resizeHandle = driver.findElement(By.cssSelector(".ui-resizable-se"));
//Actions actions = new Actions(driver);
//actions.clickAndHold(resizeHandle)
//     .moveByOffset(100, 50) 
//     .release()
//     .perform();





