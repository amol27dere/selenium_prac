package DemoBlazeBuyPhone;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DBTestWithTestng {
	
	WebDriver driver1;
	
	
	@BeforeClass
	public void Beforeclass() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1=driver;
		
	}
	
	@BeforeMethod
	public void Login() {
		//driver.get("https://www.demoblaze.com/index.html");	
		//FileInputStream file= new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium3_Frameworks\\Practice\\DemoBlaze\\testdata.xlsx");
		//Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	}
	
	
	
	@Test
	public void BuyPhone() {
		
		
		
		
	}

}
