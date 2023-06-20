package DemoBlazeBuyPhone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBProdPage {
	
	@FindBy (xpath="//div[@class='product-content product-wrap clearfix product-deatil']//h2") private WebElement ProdctName;
	@FindBy (xpath="//div[@class='product-content product-wrap clearfix product-deatil']//h3") private WebElement ProductPrice;
	@FindBy (xpath="//a[@id='cartur']") private WebElement CartBtn;
	@FindBy (xpath="//a[text()='Add to cart']") private WebElement AddToCart;
	WebDriver driver1;
	DBProdPage(WebDriver  driver){
		PageFactory.initElements(driver , this);
		driver1=driver;
	}
	
	public void ValidateDBProdPageProductNameandprice(String ProName ,String price1 ) {
		String ActualTextpro = ProdctName.getText();
		String ExpectedTextpro = (ProName);
		String ExpectedTextPrice=(price1);
		String ActualTextprice = ProductPrice.getText();
		
		if (ActualTextpro.equals(ExpectedTextpro)) {
			System.out.println("ProductnameOn Site "+ActualTextpro);
			System.out.println("Price on site "+ActualTextprice);
			
			if (ActualTextprice.equals(ExpectedTextPrice)) {
				
				
				AddToCart.click();
				
				
			}else {
			 System.out.println("Price not matched");
			}
		}else {
			System.out.println("name Not matched ");
		}
	}
	
	public void HandelAleartPopup () {
		
		driver1.switchTo().alert().accept();
	}
	public void ClickOnDBProdPageCartBtn() {
		CartBtn.click();
	}
}
