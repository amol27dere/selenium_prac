package DemoBlazeBuyPhone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBCartPage {
	
	@FindBy(xpath="(//tr[@class='success']//td)[2]") private WebElement Productname;
	@FindBy(xpath="(//tr[@class='success']//td)[3]") private WebElement ProductPrice;
	@FindBy(xpath="//h3[@id='totalp']") private WebElement TotalPrice;
	@FindBy (xpath="//button[text()='Place Order']") private WebElement PlaceOrder;

	DBCartPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateDBCartPageProductname() {
		String name = Productname.getText();
		System.out.println("Product name on Crat page "+name);
	}
	public void ValidateDBCartPageProductPrice() {
		String price = ProductPrice.getText();
		System.out.println(price);
	}
	public void ValidateDBCartPageTotalPrice() {
		String TPrice = TotalPrice.getText();
		System.out.println(TPrice);
	}
	public void ClickOnDBCartPagePlaceOrder() {
		PlaceOrder.click();
	}
	
	
}
