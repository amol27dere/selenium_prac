package Pom_Ddf_BaseClass_utility_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInPage {
	
	@FindBy (xpath="//a[text()='Sign in']") private WebElement SigninBtn;
	
	PBSignInPage (WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickOnPBSignInPageSigninBtn() {
		
		SigninBtn.click();
		
	}

}
