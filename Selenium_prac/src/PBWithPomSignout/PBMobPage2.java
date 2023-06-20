package PBWithPomSignout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMobPage2 {
	
  @FindBy (xpath="(//input[@type='number'])[2]")	 private WebElement MobNoFeild;
  @FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]") private WebElement SignInPwdBtn;
  
  
  PBMobPage2(WebDriver driver){
	  
	  PageFactory.initElements(driver, this);
  }
  
  public void EnterMobNo() {
	  MobNoFeild.sendKeys("7744005888");
  }
  
  public void ClickonSignInPwdBtn() {
	  SignInPwdBtn.click();
	
}

}
