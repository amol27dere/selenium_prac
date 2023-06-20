package PBWithPomSignout;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage5 {
	
	@FindBy (xpath="//input[@name='personName']") private WebElement Fullname;
	
	WebDriver driver1;
	
	PBProfilePage5(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
		driver1=driver;
	}
	
	public void MoveToChildWindow() {
		
		Set<String> allid1 = driver1.getWindowHandles();
		ArrayList<String>a1= new ArrayList<>(allid1);
		driver1.switchTo().window(a1.get(1));
		
	}
	
	public void ValidateFullName() {
		
		String ActualText = Fullname.getAttribute("value");
		String ExpectedText = "Amol Saherbrao Dere";
		
		if (ActualText.equals(ExpectedText)) {
			System.out.println("TC1 Passed");
		}else {
			System.out.println("TC1 Failed");
		}
	}
	
	public void moveBackToHome() {
		Set<String> allid2 = driver1.getWindowHandles();
		ArrayList<String> a2= new ArrayList<>(allid2);
		driver1.switchTo().window(a2.get(0));		
	}
	
	
	
	
	
	
	
	

}
