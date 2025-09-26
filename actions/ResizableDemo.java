package actions;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
 
public class ResizableDemo {
 
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement resizeHandle=driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
		Actions actions = new Actions(driver);
		//actions.clickAndHold(resizeHandle).moveByOffset(100, 50).click().build().perform();
		actions.dragAndDropBy(resizeHandle, 50, 50).perform();
		 
		
	}
 
}
 