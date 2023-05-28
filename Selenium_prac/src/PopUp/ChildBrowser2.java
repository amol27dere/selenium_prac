package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser2 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String>al= new ArrayList<String>(id);
		
		String child1 = al.get(1);
		driver.switchTo().window(child1);
		
		driver.findElement(By.xpath("(//span[text()='Selenium'])[1]"));
		
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Set<String> id1 = driver.getWindowHandles();
		
		ArrayList<String>al1= new ArrayList<String>(id1);
		
		driver.switchTo().window(al.get(2));
	
	
	}

}
