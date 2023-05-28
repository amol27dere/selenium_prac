package HandlingMultipleWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSugestions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("India");
		Thread.sleep(2000);
		
		List<WebElement> allopt = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		String exptext="India map";
		
		for (WebElement a:allopt) {
			
			String acttext = a.getText();
			
			if (acttext.equalsIgnoreCase(exptext)) {
				
				a.click();
			}
			
			
		}
		
		
	}

}
