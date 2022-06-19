package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String getText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetAttributeValue(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}

	public boolean doCheckIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public boolean doCheckIsEnabled(By locator) {
		return getElement(locator).isEnabled();
	}

	
	
	public void clickOnLink(By locator, String value) {

		List<WebElement> links = getElements(locator);
		System.out.println("size of links" + links.size());

		for (WebElement e : links) {

			String text = e.getText();
			if (!text.isEmpty()) {
				System.out.println(text);

				if (text.equals(value)) {
					e.click();
					break;
				}
			}

		}

	}

	public List<String> getLinkTextList(By locator) {

		List<String> linktextlist = new ArrayList<>();

		List<WebElement> eleList = getElements(locator);
		System.out.println("size of elements:" + eleList.size());
		for (WebElement e : eleList) {

			if (!e.getText().isEmpty())

				System.out.println(e.getText());
			linktextlist.add(e.getText());
		}

		return linktextlist;
	}

	public boolean elementIsExist(By locator) {

		List<WebElement> eleList = getElements(locator);

		if (eleList.size() > 0) {
			System.out.println("element is present");
			return true;
		} else {
			System.out.println("element is not present");

			return false;
		}
	}
		
	
	//==============================================================================================================/
		//*******************DropDown Utitlity*****************************************************
		
		
		
	public void doSelectDropDownValueByIndex(By locator, int index) {

		Select s = new Select(getElement(locator));
		s.selectByIndex(index);
	}

	public void doSelectDropDownValueByText(By locator, String text) {
		Select s = new Select(getElement(locator));
		s.selectByVisibleText(text);
	}

	public void doSelectDropDownValueByValue(By locator, String value) {
		Select s = new Select(getElement(locator));
		s.selectByValue(value);

	}

	public List<String> getDropDownOptions(By locator) {

		List<String> dropdownoptionslist = new ArrayList<>();

		Select s = new Select(getElement(locator));
		List<WebElement> dropdownelements = s.getOptions();

		for (WebElement e : dropdownelements) {
			String text = e.getText();
			dropdownoptionslist.add(text);
		}

		return dropdownoptionslist;
	}

	public void selectDropDownValueByOptions(By locator, String value) {

		Select s = new Select(getElement(locator));
		List<WebElement> dropdownelements = s.getOptions();

		for (WebElement e : dropdownelements) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}

	}

	public void selectDropDownValue(By locator, String value) {

		List<WebElement> dropdownelements = getElements(locator);

		for (WebElement e : dropdownelements) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}

		}

	}

	public void selectChoice(By locator, String... value) {

		List<WebElement> eleList = getElements(locator);
		System.out.println("size of elements is:" + eleList.size());

		if (!value[0].equalsIgnoreCase("all")) {
			for (WebElement e : eleList) {
				String text = e.getText();

				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						e.click();
						break;
					}
				}

			}
		} else {
			// all selection logic
			try {
				for (WebElement e : eleList) {
					e.click();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}
	
	
	public void selectValue(By locator , String value) {
		
		  List<WebElement> elelist =	getElements(locator);
		  for(WebElement e : elelist) {
			  if(e.getText().equals(value)) {
				  e.click();
				  break;
			  }
		  }
		}
	
	/***********************************************************************************************************/
	//==================================== Actions Utility ===================================================
	
	
	public void twoLevelMenuhandel(By parent, By child) {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).perform();
		getElement(child).click();
	}

	public void threeLevelMenuhandel(By parent, By child, By subchild) {

		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).perform();
		act.moveToElement(getElement(child)).perform();
		getElement(subchild).click();
	}
	
	
	public void rightClickAndSelect(By rightclickelementlocator, By optionslocator, String value) {

		Actions act = new Actions(driver);
		act.contextClick(getElement(rightclickelementlocator)).perform();

		List<WebElement> elelist = getElements(optionslocator);
		for (WebElement e : elelist) {

			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	public void actionsSendKeys(By locator , String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public void actionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	//********************* Wait Utility *************************************************************
	
	
	/**
	 * Wait for the element located inside the DOM for the specific period of time 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public  WebElement waitForElementPresence(By locator , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	public  WebElement waitForElementPresence(By locator , int timeout , int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, timeout, intervalTime);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public  Alert waitForAleart(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		 return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public  String getAleartText(int timeout) {
		return waitForAleart(timeout).getText();
	}
	
	public  void acceptAleart(int timeout) {
		 waitForAleart(timeout).accept();
	}
	
	public  void dissmissAleart(int timeout) {
		 waitForAleart(timeout).dismiss();
	}
	
	public  void sendKeysOnAleart(int timeout, String value) {
		waitForAleart(timeout).sendKeys(value);
	}
	
	public  String waitForTitleContains(String title , int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		if(wait.until(ExpectedConditions.titleContains(title))){
			return driver.getTitle();
		}else {
			return null;
		}
	}	
		
		
		public  String waitForTitleIS(String fulltitle , int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			if(wait.until(ExpectedConditions.titleIs(fulltitle))){
				return driver.getTitle();
			}else {
				return null;
			}
			
	}
		
		public  String waitForUrlConatain(String urlvalue, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			if(	wait.until(ExpectedConditions.urlContains(urlvalue))) {
				return driver.getCurrentUrl();
			}else {
				return null;
			}
		}
		
		public  String waitForFullUrl(String urlvalue, int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			if(	wait.until(ExpectedConditions.urlToBe(urlvalue))) {
				return driver.getCurrentUrl();
			}else {
				return null;
			}
		}
		
		
		public  void waitForFrameAndSwitchToIt(String name,int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(name));
		}
		
		public  void waitForFrameAndSwitchToIt(By locator,int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		}
		
		public  void waitForFrameAndSwitchToIt(int frameindex,int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameindex));
		}
		
		public  void waitForFrameAndSwitchToIt(WebElement element,int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		}
		
		
		
		//-----------------------------------------------------------------------
		
		public  WebElement waitForElementVisible(By locator , int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public  List<WebElement> waitForElementsToBeVisible(By locator , int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
		
		
		public WebElement waitForElementToBeClickable(By locator , int timeout) {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			return wait.until(ExpectedConditions.elementToBeClickable(locator));
		}
		
		public void clickWhenReady(By locator) {
			waitForElementToBeClickable(locator, 10).click();
		}
	
	
	

	
	
}
