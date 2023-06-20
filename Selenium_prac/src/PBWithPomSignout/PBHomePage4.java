package PBWithPomSignout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage4 {
	
 @FindBy (xpath="//div[text()='My Account']")	private WebElement MyAcc;
 
 
@FindBy (xpath="//span[text()=' My profile ']") private WebElement MyProfile;

 @FindBy(xpath="//span[text()='Sign out']")  private WebElement Signoutbtn;
   
WebDriver driver1;

    PBHomePage4(WebDriver driver){
	
	PageFactory.initElements(driver, this);
	driver1= driver;
	
}
    
    public void moveToMyAcc() {
    	
    	Actions act= new Actions(driver1);
    	act.moveToElement(MyAcc).perform();
	}
    
    public void ClickonMyprofile () {
    	MyProfile.click();
    }
    
    public void ClickOnSignout() {
    	Signoutbtn.click();
    }


}
