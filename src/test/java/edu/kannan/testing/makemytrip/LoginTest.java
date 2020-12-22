package edu.kannan.testing.makemytrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void login() throws InterruptedException {
		String driverPath = System.getProperty("user.dir") + "/drivers/"; 
		System.setProperty("webdriver.chrome.driver",driverPath + "chromedriver.exe");  
		WebDriver driver=new ChromeDriver();  
		//driver.get("http://makemytrip.com");
		driver.get("http://gmail.com");
		driver.manage().window().maximize();  
		Thread.sleep(5000);
		Reporter.log( "Gmail launched successfully", true );
		System.out.println("Gmail launched successfully");
		driver.findElement(By.id("identifierId")).sendKeys("testing.purpose0102");
		driver.findElement(By.xpath(".//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("f0rtesting1920(*)");
		driver.findElement(By.xpath(".//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']")).click();
		Thread.sleep(10000);
		Reporter.log( "Login successful", true );
		System.out.println("Login successful");
		driver.findElement(By.xpath(".//div[@class='gb_Tf gb_Sa gb_Fg gb_i']/a[@class='gb_D gb_Na gb_i']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//div[@class='gb_9f gb_Cb']/a[@class='gb_Db gb_dg gb_lg gb_0e gb_5c']")).click();
		Thread.sleep(5000);
		Reporter.log( "Logout successful", true );
		System.out.println("Logout successful");
		driver.quit();
	}
}
