package SO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SO_HB1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://sellonline.tataaia.com/wps/PA_TATAAIA_SO/CampaignRedirection?campaign=HB1");
		
		driver.findElement(By.xpath("//input[@id='N']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Amol");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Test");
		//driver.findElement(By.xpath("//input[@id='gen'][@value='1']")).click();
		//driver.findElement(By.xpath("//"))
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//input[@id='gen'])[1]")).click();
		//driver.findElement(By.xpath(""))
		
	}

}
