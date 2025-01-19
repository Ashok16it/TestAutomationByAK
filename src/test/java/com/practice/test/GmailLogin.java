package com.practice.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class GmailLogin {
@Test
public void launchApp() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\santo\\OneDrive\\Desktop\\chromedriver.exe" );
	
	WebDriver driver= new ChromeDriver();
	String gmailUrl= "https://mail.google.com/mail/u/0/#inbox";
	driver.get(gmailUrl);
Thread.sleep(2000);
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement loginid= driver.findElement(By.id("identifierId")); 
loginid.sendKeys("ashok2umar@gmail.com");
Thread.sleep(2000);
loginid.sendKeys(Keys.ENTER);
WebElement passwordId= driver.findElement(By.className("whosOnd zHQkBf")); 
passwordId.sendKeys("@desire22");
passwordId.submit();
 Thread.sleep(2000);
driver.quit();
	
	
}
	
	
}
