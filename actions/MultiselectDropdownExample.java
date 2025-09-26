package actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDropdownExample {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();

        
        driver.get("http://demoqa.com/select-menu");

        
        WebElement multiselectElement = driver.findElement(By.id("cars"));
        
        Select multiselect = new Select(multiselectElement);
        
        
        if (multiselect.isMultiple()) {
            
            multiselect.selectByVisibleText("Volvo");
            multiselect.selectByVisibleText("Saab");

           
            List<WebElement> selectedOptions = multiselect.getAllSelectedOptions();
            System.out.println("Selected Options:");
            for (WebElement option : selectedOptions) {
                System.out.println(option.getText());
            }

           
            multiselect.deselectByVisibleText("Saab");

            
            System.out.println("After deselecting Saab:");
            for (WebElement option : multiselect.getAllSelectedOptions()) {
                System.out.println(option.getText());
            }
            
        } else {
           System.out.println("This dropdown does not support multiple selections.");
       }
    }
}