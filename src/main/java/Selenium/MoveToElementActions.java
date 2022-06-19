package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementActions {

	
	static WebDriver driver;
	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		//driver.get("http://mrbool.com/");
		
		driver.get("http://www.unipune.ac.in/");
		
		By source = By.className("menulink");
		By courcess = By.linkText("COURSES");
		
		By acimedic = By.id("stUI42_cnt");
		By artifical = By.id("stUI139_txt");
		By clo = By.id("stUI144_txt");
		
		
//		WebElement cources = driver.findElement(source);
//		
//		Actions act = new Actions(driver);
//		act.moveToElement(cources).perform();
//		
//		driver.findElement(courcess).click();
//		
		
		threeLevelMenuhandel(acimedic, artifical, clo);
		
		
	}

	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void twoLevelMenuhandel(By parent, By child) {
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).perform();
		getElement(child).click();
	}
	
	public static void threeLevelMenuhandel(By parent, By child, By subchild) {
		
		Actions act = new Actions(driver);
		act.moveToElement(getElement(parent)).perform();
		act.moveToElement(getElement(child)).perform();
		getElement(subchild).click();
		
		
		System.out.println("Added");
	}
	
}
