package POM;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage5 {
	
 @FindBy (xpath="//input[@name='personName']")	private WebElement FullName;
 WebDriver driver1;

 
 PBProfilePage5(WebDriver driver){
	 
	 PageFactory.initElements(driver, this);
	 driver1=driver;
 }
 
 public void moveTab() {
	Set<String> allid = driver1.getWindowHandles();
	ArrayList<String>a1= new ArrayList<>(allid);
	driver1.switchTo().window(a1.get(1));
 }
 
 public void validateFullName() {
	String actualText = FullName.getAttribute("value");
	String ExpectedText = "Amol Saherbrao Dere";
	
	if(actualText.equals(ExpectedText)) {
		System.out.println("TC1 Passed");
	}
	else {
		System.out.println("TC1 Failed ");
	}
}
 
 
 
}
