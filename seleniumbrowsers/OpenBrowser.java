package seleniumbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		//launching web browser
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		//WebDriver driver2 = new FirefoxDriver();
		
		//Get methods
		driver.get("https://www.healthasyst.com/");
		
		String name = (driver.getTitle());
		String CurrentUrl = driver.getCurrentUrl();
		//String PageSource = driver.getPageSource();
		String WindowHandle = driver.getWindowHandle();
		
		//Navigate methods
		driver.navigate().to("https://in.linkedin.com/");
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.switchTo().window("https://www.cricbuzz.com/");
		
		
		//Manage window commands
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		System.out.println(name);
		System.out.println(CurrentUrl);
		//System.out.println(PageSource);
		System.out.println(WindowHandle);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.quit();
	}

}
