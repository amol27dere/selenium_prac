package DemoBlazeBuyPhone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBPlaceOrderPage {
	
	@FindBy (xpath="//input[@id='name']")private WebElement nameFeild;
	@FindBy (xpath="//input[@id='country']")private WebElement countryFeild;
	@FindBy (xpath="//input[@id='city']")private WebElement cityFeild;
	@FindBy (xpath="//input[@id='card']")private WebElement creditcardFeild;
	@FindBy (xpath="//input[@id='month']")private WebElement monthFeild;
	@FindBy (xpath="//input[@id='year']")private WebElement yearFeild;
	@FindBy(xpath="//button[text()='Purchase']") private WebElement purchaseBtn;

	
	DBPlaceOrderPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	public void EnterDBPlaceOrderPagenameFeild(String name) {
		nameFeild.sendKeys(name);
	}
	
	
	public void EnterDBPlaceOrderPagecountryFeild(String country) {
		nameFeild.sendKeys(country);
		
	}
    public void EnterDBPlaceOrderPagecityFeild(String city) {
    	countryFeild.sendKeys(city);
	}
public void EnterDBPlaceOrderPagecreditcardFeild(String creditcard) {
	creditcardFeild.sendKeys(creditcard);
	}
public void EnterDBPlaceOrderPagemonthFeild(String month) {
	monthFeild.sendKeys(month);
}
public void EnterDBPlaceOrderPageyearFeild(String year) {
	yearFeild.sendKeys(year);
}
public void ClickonDBPlaceOrderPagepurchaseBtn() {
	purchaseBtn.click();
}
	
	
	
	
	
	
}
