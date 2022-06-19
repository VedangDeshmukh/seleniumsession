package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import WebDriverBasic.BrowserUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartRegistraction {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		BrowserUtil br = new BrowserUtil();
		driver= br.init_Browser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By tele = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmpass = By.id("input-confirm");
		
		
		ElementUtil elementUtil = new ElementUtil(driver);
		
		elementUtil.doSendKeys(firstname, "Vedang");
		elementUtil.doSendKeys(lastname, "Deshmulk");
		elementUtil.doSendKeys(email, "vedang@gmail.com");
		elementUtil.doSendKeys(tele, "8765456789");
		elementUtil.doSendKeys(password, "Vednag@hgail.com");
		elementUtil.doSendKeys(confirmpass, "Vednag@hgail.com");
		
		
	}

}
