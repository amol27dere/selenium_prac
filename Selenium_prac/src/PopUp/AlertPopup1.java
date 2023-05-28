package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/alerts/");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		alt.accept();
		
		driver.findElement(By.xpath("//input[@value='PromptMe']")).click();
		
		alt.sendKeys("AmolTest");
		alt.accept();
		
		
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		//alt.dismiss();
		alt.accept();
		
		
	}

}
