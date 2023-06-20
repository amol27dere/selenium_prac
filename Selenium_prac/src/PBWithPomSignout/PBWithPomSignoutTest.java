package PBWithPomSignout;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBWithPomSignoutTest {

public static void main(String[] args) throws InterruptedException, IOException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.policybazaar.com/");
	PBLoginPage1 login= new PBLoginPage1(driver);
	login.ClickOnSigninBtn();
	
	PBMobPage2 mob= new PBMobPage2(driver);
	mob.EnterMobNo();
	mob.ClickonSignInPwdBtn();
	
	PBPwdPage3 Pwd= new PBPwdPage3(driver);
	Pwd.EnterPWD();
	Pwd.ClickOnSigninBtn();
	
	Thread.sleep(2000);
	
	PBHomePage4 home= new PBHomePage4(driver);
	home.moveToMyAcc();
	home.ClickonMyprofile();
	
	PBProfilePage5 profile= new PBProfilePage5(driver);
	profile.MoveToChildWindow();
	profile.ValidateFullName();
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
	File dsc= new File("D:\\Study\\velocity class\\Automation\\Topics\\Selenium3_Frameworks\\POM\\profile.jpeg");
	
org.openqa.selenium.io.FileHandler.copy(src, dsc);	
	profile.moveBackToHome();
	
	
	Thread.sleep(2000);
	
	home.moveToMyAcc();
	home.ClickOnSignout();
	
	
	
}
	
}
