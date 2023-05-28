package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import intallation.chrome;

public class PersnoalDetails {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		//login page 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		//home page
		String dash=   driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		
		//String title = dash.getText();
		//System.out.println(title);
		if (dash.equalsIgnoreCase("Dashboard")) {
			System.out.println("login success ");
		}
		else {
			System.out.println("login failed ");
		}
		
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
		//my info page 
		Thread.sleep(20000);
		String pim=driver.findElement(By.xpath("//h6[text()='PIM']")).getText();
		if (pim.equalsIgnoreCase("PIM")) {
			System.out.println("my info page ");
		}
		else {
			System.out.println("not my info page");
		}
		
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("AmolTest");
		
		
		
		
		
		
		
	}

}
