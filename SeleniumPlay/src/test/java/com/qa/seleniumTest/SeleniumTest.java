package com.qa.seleniumTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.page.GoogleSearchPage;

public class SeleniumTest {
	
	public String chromeLocation="C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	@Before
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver",chromeLocation);	
		driver=new ChromeDriver();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	
	@Test
	public void testGoogleSearch() throws InterruptedException {
		driver.get("http://www.google.com/");
		GoogleSearchPage page= PageFactory.initElements(driver, GoogleSearchPage.class);
		page.searchFor("BBC football gossip");
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/h3/a")).click();
		if(driver.getPageSource().contains("Liverpool"))
		{
			page.scroll(driver);
			Thread.sleep(10000);
			page.scroll(driver);
			Thread.sleep(10000);
			page.scroll(driver);
			Thread.sleep(10000);
			page.scroll(driver);
			Thread.sleep(10000);
			page.scroll(driver);
			Thread.sleep(10000);
			page.scroll(driver);
			Thread.sleep(50000);
			
		}
		
		
	}
//JavascriptExecutor jse = (JavascriptExecutor)driver;
//jse.executeScript("window.scrollBy(0,250)", "");
}
