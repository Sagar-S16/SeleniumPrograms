package axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDescendantEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https:the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		int totalInputs = driver.findElements(By.xpath("//form[@name='login']/descendant::input")).size();
		System.out.println(totalInputs);
		int  totalButton = driver.findElements(By.xpath("//form[@name='login']/descendant::button")).size();
		System.out.println(totalButton);
		driver.quit();
	}

}