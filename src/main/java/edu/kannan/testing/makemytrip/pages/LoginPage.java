package edu.kannan.testing.makemytrip.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	String btnLoginWithPhoneorEmail = ".//div/p/label[text()='Login with Phone/Email']";
	String txtEmailorMobile = ".//div/input[@id='username']";
	String btnContinue = ".//button/span[text()='Continue']";
	String txtPassword = ".//input[@id='password']";
	String btnLogin = ".//button/span[text()='Login']";

	public LoginPage() {
		
	}
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLogin() {
		driver.findElement(By.xpath(btnLoginWithPhoneorEmail)).click();
	}
	
	public void enterLoginCredentials() {
		driver.findElement(By.xpath(txtEmailorMobile)).sendKeys("saikans@gmail.com");
		driver.findElement(By.xpath(btnContinue));
		driver.findElement(By.xpath(txtPassword)).sendKeys("music123");
		driver.findElement(By.xpath(btnLogin)).click();
	}
	
	
}
