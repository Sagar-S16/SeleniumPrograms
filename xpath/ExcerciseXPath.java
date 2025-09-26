package xpath;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class ExcerciseXPath {
 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.findElement(By.name("username")).sendKeys("Skandha Jain");
		driver.findElement(By.name("password")).sendKeys("Abc@123");
        driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("C:/Users/Dell/Desktop/Output.txt");
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb1']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb3']")).click();
        driver.findElement(By.xpath("//input[@type='radio' or @value='rd2']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Drop Down Item 5");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
       // driver.findElement(By.xpath("//*[@id=\"back_to_form\"]")).click();
		
	}}
 





















//public class ExcerciseXPath {
//  public static void main(String[] args) throws InterruptedException {
//      
//      WebDriver driver = new ChromeDriver();
//
//      
//      driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
//
//      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("SagarS");
//     
//      driver.findElement(By.xpath("//input[@name='password']")).sendKeys("MySecret123");
//
//      
//      driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb1']")).click();
//      driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb2']")).click();
//      driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb3']")).click();
//
//      
//      driver.findElement(By.xpath("//input[@type='radio' and @value='rd2']")).click();
//
//      
//      
//      driver.findElement(By.xpath("//input[@name='filename'])")).sendKeys("C:/Users/DELL/Desktop/Output.txt");
//      
//      WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
//      Select select = new Select(dropdown);
//      select.selectByVisibleText("Drop Down Item 3");
//
//      
//      driver.findElement(By.xpath("//input[@type='submit']")).click();
//
//      
//      System.out.println("Form completed successfully");
//
//      Thread.sleep(5000);
//      driver.quit();
//  }
//}
























//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//public class ExcerciseXPath {
//    public static void main(String[] args) {
//        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//        WebDriver driver = new ChromeDriver();
//
//        
//        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
//
//        
//        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("SagarS");
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("MySecret123");
//
//        
//        driver.findElement(By.cssSelector("input[type='checkbox'][value='cb1']")).click();
//        driver.findElement(By.cssSelector("input[type='checkbox'][value='cb3']")).click();
//
//        
//        driver.findElement(By.cssSelector("input[type='radio'][value='rd2']")).click();
//        
//        
//
//        WebElement dropdown = driver.findElement(By.cssSelector("select[name='dropdown']"));
//        Select select = new Select(dropdown);
//        select.selectByVisibleText("Drop Down Item 3");
//
//        
//        driver.findElement(By.cssSelector("input[type='submit']")).click();
//
//        
//        System.out.println("Form completed successfully");
//
//        
//        driver.quit();
//    }
//}



































