package ListBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dateselction {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select d1= new Select(day);
		
		d1.selectByValue("27");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select m1= new Select(month);
		m1.selectByVisibleText("Apr");
		//m1.selectByIndex(3);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y1= new Select(year);
		y1.selectByValue("1996");
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
		
		
	}

}
