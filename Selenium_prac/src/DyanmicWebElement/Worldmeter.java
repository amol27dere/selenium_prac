package DyanmicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldmeter {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/");
		
		 String population = driver.findElement(By.xpath("((//div[@class='counter-heading inactive-header'])[1]//span)[1]")).getText();
		System.out.println("current world population is "+population);
		
	}

}
