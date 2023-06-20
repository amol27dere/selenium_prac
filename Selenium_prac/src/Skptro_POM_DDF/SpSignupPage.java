package Skptro_POM_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpSignupPage {
	
	@FindBy (xpath="//input[@id='username']") private WebElement FristNameFeild;
	@FindBy (xpath="//input[@id='email']") private WebElement EmailFeild;
	@FindBy (xpath="//input[@id='tel']") private WebElement TelPhoneFeild;
	@FindBy (xpath="//select[@name='sgender']") private WebElement GenderDropdown;
	@FindBy (xpath="//input[@value='five']") private WebElement Experiance;
	@FindBy (xpath="//input[@value='TestingBasics']") private WebElement MTCheckbox;
	@FindBy (xpath="//input[@value='Selenium']") private WebElement ATCheckbox;
	@FindBy (xpath="//input[@value='Java']") private WebElement JavaCheckbox;
	@FindBy (xpath="//select[@id='tools']") private WebElement Atools;
	@FindBy (xpath="//input[@type='submit']") private WebElement SubmitBtn;
	
	SpSignupPage (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	
}
