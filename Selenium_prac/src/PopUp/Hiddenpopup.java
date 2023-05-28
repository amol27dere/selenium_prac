package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import intallation.chrome;

public class Hiddenpopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		//driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("434343");
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
	}

}
