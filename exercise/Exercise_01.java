package exercise;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class Exercise_01 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		WebElement titleDropdown =	driver.findElement(By.id("user_title"));
		Select selectTitle = new Select(titleDropdown);
		selectTitle.selectByVisibleText("Mr");
        driver.findElement(By.id("user_firstname")).sendKeys("Sagar");
        driver.findElement(By.id("user_surname")).sendKeys("S");
        driver.findElement(By.id("user_phone")).sendKeys("9876543210");
        Select dobYear = new Select(driver.findElement(By.id("user_dateofbirth_1i")));
        dobYear.selectByVisibleText("1995");
        Select dobMonth = new Select(driver.findElement(By.id("user_dateofbirth_2i")));
        dobMonth.selectByVisibleText("August");
        Select dobDay = new Select(driver.findElement(By.id("user_dateofbirth_3i")));
        dobDay.selectByVisibleText("16");
        driver.findElement(By.id("licencetype_t")).click();
        Select licencePeriod = new Select(driver.findElement(By.id("user_licenceperiod")));
        licencePeriod.selectByVisibleText("5");
        Select occupation = new Select(driver.findElement(By.id("user_occupation_id")));
        occupation.selectByVisibleText("Engineer");
        driver.findElement(By.id("user_address_attributes_street")).sendKeys("Domlur");
        driver.findElement(By.id("user_address_attributes_city")).sendKeys("Bengaluru");
        driver.findElement(By.id("user_address_attributes_county")).sendKeys("Karnataka");
        driver.findElement(By.id("user_address_attributes_postcode")).sendKeys("560076");
        driver.findElement(By.id("user_user_detail_attributes_email")).sendKeys("sagar@example.com");
        driver.findElement(By.id("user_user_detail_attributes_password")).sendKeys("Sagar@123");
        driver.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys("Sagar@123");
        //driver.findElement(By.name("submit")).click();
          
        String originalWindow = driver.getWindowHandle();
        WebElement linkedinLink = driver.findElement(By.xpath("//a[contains(@href,'linkedin.com')]"));
        linkedinLink.click();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        System.out.println("LinkedIn:" + driver.getCurrentUrl());

        driver.close();
        driver.switchTo().window(originalWindow);

        
        WebElement facebookLink = driver.findElement(By.xpath("//a[contains(@href,'facebook.com')]"));
        facebookLink.click();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!originalWindow.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        System.out.println("Facebook: " + driver.getCurrentUrl());

        
        driver.quit();

 
   
	}
 
}