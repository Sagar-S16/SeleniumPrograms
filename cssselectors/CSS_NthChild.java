package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_NthChild {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		String header =  driver.findElement(By.cssSelector("#table1 thead tr:nth-child(1) th:nth-child(6)" )).getText();
		System.out.println(header);
		String name1 = driver.findElement(By.cssSelector("#table1  tr:nth-child(4) td:nth-child(1)")).getText();
		System.out.println(name1);
		String name2 = driver.findElement(By.cssSelector("#table1 tbody tr:nth-child(2) td:nth-child(5)")).getText();
		driver.navigate().to(name2);
		driver.findElement(By.cssSelector("div.MuiStack-root.header_mstrMobileNav__lQ8Wl.mui-style-1lxwves>div.MuiTypography-root.MuiTypography-inherit.MuiLink-root.MuiLink-underlineAlways.header_mstrTopLevelNavLink__NNGNn.mui-style-1c5jn5m>a")).click();
		System.out.println(name2);
		Thread.sleep(5000);
		driver.quit();
	}

}
