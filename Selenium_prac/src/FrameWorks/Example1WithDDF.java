package FrameWorks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example1WithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream file = new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium3_Frameworks\\DDF\\DDF_testData.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//login
		driver.get("https://www.policybazaar.com/");
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();	
		Thread.sleep(2000);
		
		//navigate to my acc
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='My Account']")));
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		
		
		
		
	}

}
