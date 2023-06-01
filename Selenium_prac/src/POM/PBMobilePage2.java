package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobilePage2 {
  @FindBy (xpath="(//input[@type='number'])[2]")	private WebElement mobNo;
  
@FindBy(xpath="(//span[text()='Sign in with Password'])[2]") private WebElement SigninWithPWDBtn;

PBMobilePage2(WebDriver driver){
	PageFactory.initElements(driver, this);
}

public void EnterMob() {
	mobNo.sendKeys("7744005888");
	
}
public void ClickSigninWithPWDBtn() {
	SigninWithPWDBtn.click();
}



}
