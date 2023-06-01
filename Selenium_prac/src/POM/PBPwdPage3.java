package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBPwdPage3 {
	
@FindBy(xpath="//input[@name='password']")  private	WebElement PwdFeild;
@FindBy(xpath="//span[text()='Sign in']")  private WebElement signinBtn;


PBPwdPage3(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void EnterPwd() {
	PwdFeild.sendKeys("Amol@policy123");
}
public void ClicksigninBtn() {
	
	signinBtn.click();
}



}
