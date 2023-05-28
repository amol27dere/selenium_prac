package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class expample2 {

	public static void main(String[] args) throws IOException {

		 String em = RandomString.make(2);
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File ("D:\\Study\\velocity class\\Automation\\Topics\\Selenium\\ScreenShot\\abc"+em+".jpg");
		
		FileHandler.copy(src, dest);
		
	}

}
