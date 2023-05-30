package skpatro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/webtable/");
		driver.manage().window().maximize();
		
		 WebElement row1 = driver.findElement(By.xpath("(//table[@id='table01']//tr)[1]"));
		System.out.println(row1.getText());
		
		System.out.println(row1.getSize());
		
		
		// click on row2 checkbox
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		//click on selenium link
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		
	}

}
