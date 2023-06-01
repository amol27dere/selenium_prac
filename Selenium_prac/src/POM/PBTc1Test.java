package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBTc1Test {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.policybazaar.com/");
		
		PBLoginPage1 login= new PBLoginPage1(driver);
		login.ClickOnSigninbtn();
		
		PBMobilePage2 mob= new PBMobilePage2(driver);
		mob.EnterMob();
		mob.ClickSigninWithPWDBtn();
		
		PBPwdPage3 pwd= new PBPwdPage3(driver);
		pwd.EnterPwd();
		pwd.ClicksigninBtn();
		
		Thread.sleep(2000);
		
		PBHomePage4 home= new PBHomePage4(driver);
		home.MoveToMacc();
		home.Clickonmyprofile();
		
		PBProfilePage5 profile= new PBProfilePage5(driver);
		profile.moveTab();
		profile.validateFullName();
		
		driver.quit();
		
		
	}

}
