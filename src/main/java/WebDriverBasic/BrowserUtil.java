package WebDriverBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * This class contain different utility of the browser actiosn
 * @author Admin
 *
 */
public class BrowserUtil {

	public WebDriver driver;

	/**
	 * This method is use to initilize the driver on the basic of the given browser name
	 * @param browsername
	 * @return this return the browser referance
	 */
//	public WebDriver init_Browser(String browsername) {
//
//		System.out.println("given browser is" + browsername);
//
//		switch (browsername) {
//		case "chrome":
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//			driver = new ChromeDriver();
//			break;
//
//		case "firefox":
//			System.setProperty("webdriver.chrome.driver",
//					"C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//			driver = new FirefoxDriver();
//			break;
//
//		case "safari":
//			driver = new SafariDriver();
//			break;
//
//		default:
//			System.out.println("Please pass the correct browser");
//			break;
//		}
//
//		return driver;
//	}
//
//	
//	/**
//	 * This method is use to launch the url
//	 * @param url
//	 */
//	public void launchUrl(String url) {
//		if (url == null) {
//			return;
//		}
//
//		if (url.isEmpty()) {
//			return;
//		}
//
//		driver.get(url);
//	}
//	
//	
//	public String getPageUrl() {
//		return driver.getCurrentUrl();
//	}
//
//	/**
//	 * Method to use the get the Title of web page
//	 * @return
//	 */
//	public String getPageTitle() {
//		return driver.getTitle();
//	}
//
//	/**
//	 * Method to get the source code of the page
//	 * @return
//	 */
//	public String getPageSource() {
//		return driver.getPageSource();
//	}
//
//	public void closeBrowser() {
//		driver.close();
//	}
//
//	public void quitBrowser() {
//		driver.quit();
//	}

	
	
	public WebDriver init_Browser(String browsername) {
		System.out.println("browser is launching:"+browsername);
		
		switch (browsername) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
			
		case "firefox":
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "safari":
			
			driver = new SafariDriver();
			break;
			
		default:
			System.out.println("Please pass the correct browser");
			break;
		}
		
		return driver;
	}
	
	public void launchUrl(String url) {
		
		if(url == null) {
			return;
		}
		
		if(url.isEmpty()) {
			return;
		}
		 driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getPageSource() {
		return driver.getPageSource();
	}
	
	public void closePage() {
		driver.close();
	}
	
	public void quitePage() {
		driver.quit();
	}
}
