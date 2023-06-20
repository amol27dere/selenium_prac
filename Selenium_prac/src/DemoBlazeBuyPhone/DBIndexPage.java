package DemoBlazeBuyPhone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBIndexPage {
	
	@FindBy(xpath="//a[text()='Log in']") private WebElement loginBtn;
	@FindBy (xpath="//a[text()='Samsung galaxy s6']") private WebElement S6Phone;
	
	DBIndexPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickOnDBIndexPageloginBtn() {
		loginBtn.click();
	}
	
	public void ClickOnDBIndexPageS6Phone() {
		S6Phone.click();
	}

}
