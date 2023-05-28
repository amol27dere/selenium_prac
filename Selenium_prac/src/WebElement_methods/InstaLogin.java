package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaLogin {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abcdf");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456977");
		
		try {
			driver.findElement(By.xpath("//div[text()='Save login info']")).click();
			
		}
		catch(Exception e) {
			System.out.println("save info button not present");
			
			
		}
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		System.out.println(driver.getTitle());
		
	}

}
