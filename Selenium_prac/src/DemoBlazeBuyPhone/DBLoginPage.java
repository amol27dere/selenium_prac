package DemoBlazeBuyPhone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBLoginPage {
	
 @FindBy (xpath="//input[@id='loginusername']")	private WebElement UsernameFeild;
 @FindBy (xpath="//input[@id='loginpassword']") private WebElement Passfeild;
 @FindBy(xpath="//button[text()='Log in']") private WebElement LoginBtn;
 
 DBLoginPage(WebDriver driver){
	 PageFactory.initElements(driver, this);
 }
 
 public void EnterDBLoginPageUsernameFeild(String user) {
	 UsernameFeild.sendKeys(user);
}
 public void EnterDBLoginPagePassfeild(String pass) {
	 Passfeild.sendKeys(pass);
}
 public void ClickOnDBLoginPageLoginBtn() {
	 LoginBtn.click();
}

}
