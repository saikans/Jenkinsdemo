package edu.kannan.testing.makemytrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() throws InterruptedException {
		String driverPath = System.getProperty("user.dir") + "/drivers/"; 
		System.setProperty("webdriver.chrome.driver",driverPath + "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		driver.get("http://makemytrip.com");
		driver.manage().window().maximize();  
		Thread.sleep(10000);
		driver.close();
	}
}
