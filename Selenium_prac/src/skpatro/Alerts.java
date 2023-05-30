package skpatro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/alerts/");
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		// alert 1
		 Alert alt1 = driver.switchTo().alert();
		 System.out.println(alt1.getText());
		 alt1.accept();
		 
		 //alert2
		 driver.findElement(By.xpath("//input[@id='prompt']")).click();
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.sendKeys("Amol 1");
		alt2.accept();
		
		String msg = driver.findElement(By.xpath("//p[@id='Parademo']")).getText();
		System.out.println(msg);
		
		if ( msg.equalsIgnoreCase("Hello Amol 1! How are you today?")) {
			
			System.out.println("message is correct");
		}
		else {
			System.out.println("message is incorrect");
		}
		
		// alert 3
		
		// press ok on alert
		
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		Alert alt3 = driver.switchTo().alert();
		
		System.out.println(alt3.getText());
		alt3.dismiss();
		String msg2 = driver.findElement(By.xpath("//p[@id='Parademo']")).getText();
		
		if (msg2.equalsIgnoreCase("You pressed OK!")) {
			System.out.println("pressed ok button ");
		}
		else if (msg2.equalsIgnoreCase("You pressed Cancel!"))
		{
			System.out.println("pressed cancel button ");
		}
		else {
			System.out.println("invalid Selection");
		}
		
		
		
		
	}

}
