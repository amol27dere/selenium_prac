package Pom_Ddf_BaseClass_utility_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPasswordPage {

	@FindBy (xpath="//input[@name='password']") private WebElement passFeild;
	
	
	@FindBy (xpath="//span[text()='Sign in']") private WebElement SigninBTN;
	
	PBPasswordPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterPBPasswordPagepassFeild(String pass) {
		passFeild.sendKeys(pass);
	}
	public void ClickOnPBPasswordPageSigninBTN() {
		SigninBTN.click();
		
	}
	
}
