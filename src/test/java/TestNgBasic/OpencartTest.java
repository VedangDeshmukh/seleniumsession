package TestNgBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartTest extends BaseTest {
	
	
	
	@Test
	public void urlTest() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.orangehrm.com/orangehrm-30-day-trial/");
	}
	
	
	@Parameters({"name","email"})
	@Test
	public void fillForm(String name, String email) {
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys(name);
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys(email);
	}
	


}
