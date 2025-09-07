package Sept6Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import jdk.javadoc.doclet.Doclet.Option;

public class GmailBase {
;	WebDriver driver;
	ExtentReports extentReport;
	ExtentTest extentChildTest;
	ExtentTest extentParentTest;
	ChromeOptions option= new ChromeOptions();
	option.addArguments("--incognito");
	driver= new ChromeDriver(option);
	
	@BeforeSuite
	public void extentSetup() {
		ExtentSparkReporter spark=new ExtentSparkReporter("C:\\Users\\santo\\OneDrive\\Desktop\\GitProjectSept5\\TestAutomationByAK\\ExtentReportSept6\\GmailRecovery.html");
		extentReport= new ExtentReports();
		extentReport.attachReporter(spark);
		
	}
	@BeforeMethod
	public void setupDriver() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://accounts.google.com/v3/si//*[@id=%22yDmH0d%22]/c-wiz/main/div[2]/div/div/div[1]/form/span/section/div/div/div[3]"
				+ "/buttongnin/identifier?ifkv=AdBytiOjALK57GHBl1w5gHn-FgLkP38fKKx-yZB-s3shZlIXPcA1wrS_-_-ZwugHF1ALwmFXfMv3fA&flowName"
				+ "=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S2082762221%3A1757156861323803");
	}
}

























