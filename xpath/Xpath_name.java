package xpath;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Xpath_name {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		 List<WebElement> checkboxes=driver.findElements(By.name("checkboxes[]"));
		 System.out.println("size :" + checkboxes.size());
		for (WebElement checkbox :checkboxes) {
			 String checkboxName=checkbox.getAttribute("value");
			 if(checkboxName.equals("cb1")) {
				 checkbox.click();
				 System.out.println("cb1 is clicked");
			 }
			 
			 List<WebElement> radio =driver.findElements(By.name("radioval"));
			 System.out.println("radiosize:" + radio.size());
			 	for(WebElement radioButton : radio) {
			 		String radioname = radioButton.getAttribute("value");
			 		if(radioname.equals("rd3")) {
			 			radioButton.click();
			 			System.out.println("rd3 button clicked");
			 		}
			 	}
			}
		}
 
	}
 
 
 