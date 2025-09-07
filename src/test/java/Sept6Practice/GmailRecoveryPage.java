package Sept6Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailRecoveryPage extends GmailBase{

	String Url="https://accounts.google.com/signin/v2/usernamerecovery?flowName=GlifWebSignIn&flowEntry=ServiceLogin";
	
	@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz/main/div[2]"
			+ "/div/div/div[1]/form/span/section/div/div/div[3]/button") WebElement forg;
	@FindBy(xpath="//*[@id=recoveryIdentifierId]") WebElement Username;
	@FindBy(xpath="//*[@id=\"queryPhoneNext\"]/div/button/span") WebElement next;
	@FindBy(xpath="//*[@id=\"firstName\"]") WebElement FirstName;
	@FindBy (xpath="//*[@id=\"lastName\"]") WebElement Surname;
	@FindBy (xpath="//*[@id=\"collectNameNext\"]/div/button/span") WebElement next2 ;
	public void GmailRecoveryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	
	public GmailRecoveryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void verifyEmail(String user) throws InterruptedException {
		        forg.click();
		        Thread.sleep(2000);
                Username.sendKeys(user);
                next.click();		
	}
	public void verifyName(String name, String sur) {
		FirstName.sendKeys(sur);
		Surname.sendKeys(sur);
		next2.click();
	}
}