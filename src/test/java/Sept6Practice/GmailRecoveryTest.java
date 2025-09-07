package Sept6Practice;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailRecoveryTest extends GmailBase {
 String email= "ashok16.it@gmail.com";
 String name= "Ashok";
 String sur= "kumar";
 
	@Test
	public void TC_01(String email) throws InterruptedException {
		System.out.println(" This program is for recovery of gmai ");
		GmailRecoveryPage gp= new GmailRecoveryPage(driver);
		gp.verifyEmail(email);
		gp.verifyName(name, sur);
		System.out.println("test run perfactly");
	}
	
}
