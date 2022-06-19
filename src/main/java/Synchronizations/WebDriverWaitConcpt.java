package Synchronizations;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcpt {
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
//		By email = By.id("Form_submitForm_Email");
//		By name= By.id("Form_submitForm_Name");
//		
//		waitForElementPresence(email, 10).sendKeys("vedang");
//		waitForElementPresence(name, 10).sendKeys("mmm");
//		
		
		waitForElementVisible(By.xpath("//div[@id='OKTab']//button"), 5).click();
	String text=	 getAleartText(5);
	System.out.println(text);
		
		
	}
	
	
	
	/**
	 * Wait for the element located inside the DOM for the specific period of time 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public static WebElement waitForElementPresence(By locator , int timeout , int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeout, intervalTime);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static Alert waitForAleart(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		 return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static String getAleartText(int timeout) {
		return waitForAleart(timeout).getText();
	}
	
	public static void acceptAleart(int timeout) {
		 waitForAleart(timeout).accept();
	}
	
	public static void dissmissAleart(int timeout) {
		 waitForAleart(timeout).dismiss();
	}
	
	public static void sendKeysOnAleart(int timeout, String value) {
		waitForAleart(timeout).sendKeys(value);
	}
	
	public static String waitForTitleContains(String title , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if(wait.until(ExpectedConditions.titleContains(title))){
			return driver.getTitle();
		}else {
			return null;
		}
	}	
		
		
		public static String waitForTitleIS(String fulltitle , int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			if(wait.until(ExpectedConditions.titleIs(fulltitle))){
				return driver.getTitle();
			}else {
				return null;
			}
			
	}
		
		public static String waitForUrlConatain(String urlvalue, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			if(	wait.until(ExpectedConditions.urlContains(urlvalue))) {
				return driver.getCurrentUrl();
			}else {
				return null;
			}
		}
		
		public static String waitForFullUrl(String urlvalue, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			if(	wait.until(ExpectedConditions.urlToBe(urlvalue))) {
				return driver.getCurrentUrl();
			}else {
				return null;
			}
		}
		
		
		public static void waitForFrameAndSwitchToIt(String name,int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(name));
		}
		
		public static void waitForFrameAndSwitchToIt(By locator,int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		}
		
		public static void waitForFrameAndSwitchToIt(int frameindex,int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
		}
		
		public static void waitForFrameAndSwitchToIt(WebElement element,int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		}
		
		
		
		//-----------------------------------------------------------------------
		
		public static WebElement waitForElementVisible(By locator , int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public static List<WebElement> waitForElementsToBeVisible(By locator , int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
		
		
		public static WebElement waitForElementToBeClickable(By locator , int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			return wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		
		public static void clickWhenReady(By locator) {
			waitForElementToBeClickable(locator, 10).click();
		}
	
	
	

	
}
