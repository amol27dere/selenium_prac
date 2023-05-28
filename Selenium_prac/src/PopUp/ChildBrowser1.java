package PopUp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> allids = driver.getWindowHandles();
		
		ArrayList<String> al= new ArrayList<String>(allids);
		String child1 = al.get(1);
		
		
		driver.switchTo().window(child1);
		
		driver.findElement(By.xpath("//span[text()='Appium']")).click();
		
	
		
		//goback to main window 
		
		driver.switchTo().window(al.get(0));
		//click on new window
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		Set<String> allids1 = driver.getWindowHandles();
		ArrayList<String> al1= new ArrayList<>(allids1);
		driver.manage().window().maximize();
		
		//String child2 = al.get(2);
		
		al1.get(0);
		System.out.println(al1.get(0));
		System.out.println(al1.get(1));
		System.out.println(al1.get(2));
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(2));
		
		driver.manage().window().maximize();
		
	}

}
