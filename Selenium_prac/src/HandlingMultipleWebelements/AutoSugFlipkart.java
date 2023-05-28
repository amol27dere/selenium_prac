package HandlingMultipleWebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugFlipkart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi");
		
		Thread.sleep(2000);
		
		List<WebElement> allopt = driver.findElements(By.xpath("//ul[@class=\"col-12-12 _1MRYA1 _38UFBk\"]/li"));
		
		String exptext = "redmi note 12";
		
		
		for(WebElement a:allopt) {
			
			String acttext = a.getText();
			
			if(acttext.equals(exptext)) {
				a.click();
				break;
				
				
				
				
			}
			
		}
		
		
	}

}
