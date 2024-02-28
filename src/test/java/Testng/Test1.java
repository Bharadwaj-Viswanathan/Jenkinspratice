package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	static WebDriver driver;
	@BeforeMethod
	private static void launch() {
		 driver=new ChromeDriver();
	}
	
	
	@AfterMethod
	private static void quit() {
		driver.quit();
	}
	
	@Test
	private static void google() {
		driver.get("https://www.google.co.in/");
	}
	
	@Test(priority =1)
	private static void yahoo() {
		driver.get("https://in.search.yahoo.com/");
	}
}
