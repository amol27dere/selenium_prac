package skpatro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/iframes/");
		//print text from frame
		
		driver.switchTo().frame("Framename1");
		
		String text1 = driver.findElement(By.xpath("//p[@id='frametext']")).getText();
		System.out.println(text1);
		
		//click on cterory 1 from same frame
		//driver.findElement(By.xpath("//a[text()='Category1']")).click();
		
		//click on category3 on second frame
		//driver.findElement(By.xpath("//iframe[@id='Frame2']"))
		
		driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		
		//driver.switchTo().frame(driver.findElement(By.id("Frame2")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='Frame2']")));
		String cat3 = driver.findElement(By.xpath("//a[text()='Category3']")).getText();
		System.out.println(cat3);
		
		//driver.findElement(By.xpath("//a[text()='Category3']")).click();
		
		//click on Pavilion
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Pavilion']")).click();
		
		
		
		
	}

}
