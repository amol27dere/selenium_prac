package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class loginScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(10000);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File ("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ScreenShot\\OGLogin.jpg");
		
		FileHandler.copy(src, dest);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest1= new File ("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ScreenShot\\OGHome.jpg");
		
		FileHandler.copy(src1, dest1);
		
		
		
		
	}

}
