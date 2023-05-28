package OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		WebElement un =driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][1]"));
		String un1=un.getText();
		System.out.println(un1);
		//login
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Home Page
		//String title=driver.getTitle();
		//System.out.println(title);
		
		Thread.sleep(2000);
		
	WebElement header=	driver.findElement(By.xpath("//h6[contains(@class,'oxd-text oxd-text--h6 oxd-topbar-header-')]"));
	 		String header1	=header.getText();
		
	 		
		if (header1.equalsIgnoreCase("Dashboard")) {
			System.out.println("login success");
		}
		else {
			System.out.println("login failed");
		}
		
		
		
		
		
	}

}
