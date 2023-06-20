package Pom_Ddf_BaseClass_utility_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobNumPage {
	
	@FindBy (xpath="(//input[@type='number'])[2]") private WebElement MobFeild;
	@FindBy (xpath="(//span[text()='Sign in with Password'])[2]") private WebElement SigninwithPasswordBtn;

	
	PBMobNumPage (WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterPBMobNumPageMobFeild(String mob) {
		MobFeild.sendKeys(mob);
	}
	
	public void ClickOnPBMobNumPageSigninwithPasswordBtn() {
		SigninwithPasswordBtn.click();
	}
	
	
}
