package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		Set<String> allids = driver.getWindowHandles();
		
		ArrayList<String>al= new ArrayList<String>(allids);
		String childwindow = al.get(1);
		
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.xpath("//span[text()='WebdriverIO']")).click();
	}

}
