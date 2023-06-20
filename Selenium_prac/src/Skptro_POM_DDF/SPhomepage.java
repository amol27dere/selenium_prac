package Skptro_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SPhomepage {
	
	@FindBy (xpath="//a[text()='SignUp Form']") private WebElement SignUpFormBtn;
	@FindBy (xpath="//a[text()='WebTable']") private WebElement webtableBtn;
	@FindBy (xpath="//a[text()='iFrames']") private WebElement iframebtn;
	@FindBy (xpath="//a[text()='Alerts']") private WebElement Alertbtn;
	@FindBy (xpath="//a[text()='Links']") private WebElement linksbtn;
	@FindBy (xpath="//a[text()='DragnDrop']") private WebElement dragdropbtn;
	
	SPhomepage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnSPhomepageSignUpFormBtn() {
		SignUpFormBtn.click();
	}
	public void ClickOnSPhomepagewebtableBtn() {
		webtableBtn.click();
	}
	public void ClickOnSPhomepageiframebtn() {
		iframebtn.click();
	}
	public void ClickOnSPhomepageAlertbtn() {
		Alertbtn.click();
	}
	public void ClickOnSPhomepagelinksbtn() {
		linksbtn.click();
	}
	public void ClickOnSPhomepagedragdropbtn() {
		dragdropbtn.click();
	}
	
	
	
	

}
