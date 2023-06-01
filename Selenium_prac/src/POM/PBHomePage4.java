package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage4 {

	@FindBy(xpath="//div[text()='My Account']") private WebElement Myacc;
	@FindBy(xpath="//span[text()=' My profile ']") private WebElement myprofile;
	WebDriver driver1;
	
	PBHomePage4(WebDriver driver){
		PageFactory.initElements(driver, this);
		driver1=driver;
		
	}
	
	public void MoveToMacc() {
		
		Actions act= new Actions(driver1);
		act.moveToElement(Myacc).perform();
		
	}
	public void Clickonmyprofile() {
		myprofile.click();
		
	}
	
	
}
