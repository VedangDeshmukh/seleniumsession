package TestNgBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest extends BaseTest {
	

	
	@Test
	public void urlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.co.in/");
	}
	
	@Test
	public void titleTest() {
		Assert.assertTrue(driver.getTitle().contains("Google"));
	}
	

}
