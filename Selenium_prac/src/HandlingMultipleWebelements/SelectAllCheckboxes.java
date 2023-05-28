package HandlingMultipleWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckboxes {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///D:/Study/velocity%20class/Automation/Topics/Selenium/HandlingMultipleElements/MultiCheckBox.html");
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (WebElement c : checkbox) {
			
			c.click();
			
		}
		
		
		
		
	}

}
