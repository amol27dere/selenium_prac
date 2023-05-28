package WebElement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
		
		//un.sendKeys("sghdfsghfgdshdgfd");
		
		//Thread.sleep(2000);
		
		//un.clear();
		
		WebElement text =driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		System.out.println(text);
		
		boolean a=text.isEnabled();
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
	}

}
