package WebDriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	
	static WebDriver driver ;
	
	public static void main(String[] args) {

		String browser = "chrddddome";
		
		
//		if(browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}else if(browser.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}else if(browser.equals("safari")) {
//			driver = new SafariDriver();
//		}else {
//			System.out.println("Please pass the correct browser");
//		}
//		
//		
//		driver.get("https://www.google.com");
		
		
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}else {
			System.out.println("Please pass the correct browser");
		}
		
		driver.get("https://www.google.com");
	}

}
