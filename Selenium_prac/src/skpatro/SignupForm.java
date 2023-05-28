package skpatro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupForm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/signup/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Amol Dere");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("amol@dere.com");
		driver.findElement(By.xpath("//input[@id='tel']")).sendKeys("9876543210");
		//driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("9632587410");
		
		try {
			driver.findElement(By.xpath("//input[@id='fax']")).sendKeys("9632587410");
			
		} catch (Exception e) {
			System.out.println("Fax is disabled ");
		}
		
		WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));
		Select s= new Select(gender);
		s.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@value='four']")).click();
		
		driver.findElement(By.xpath("//input[@value='TestingBasics']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium']")).click();
		driver.findElement(By.xpath("//input[@value='Java']")).click();

		  WebElement auto_tools = driver.findElement(By.xpath("//select[@id='tools']"));
		 
		Select s1= new Select(auto_tools);
		
		s1.selectByIndex(2);
		s1.selectByIndex(0);
		s1.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();

		
		
		
		
		
		
	}

}
