package DemoBlazeBuyPhone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DBTestName {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream file= new FileInputStream("D:\\Study\\velocity class\\Automation\\Topics\\Selenium3_Frameworks\\Practice\\DemoBlaze\\testdata.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		DBIndexPage index= new DBIndexPage(driver);
		index.ClickOnDBIndexPageloginBtn();
		
		DBLoginPage login= new DBLoginPage(driver);
		 String user = sh.getRow(1).getCell(0).getStringCellValue();
		login.EnterDBLoginPageUsernameFeild(user);
		 String pass = sh.getRow(1).getCell(1).getStringCellValue();
		 login.EnterDBLoginPagePassfeild(pass);
		 login.ClickOnDBLoginPageLoginBtn();
		 Thread.sleep(2000);
		 
		 index.ClickOnDBIndexPageS6Phone();
		 
		String ProName = sh.getRow(1).getCell(2).getStringCellValue();
		String price1 = sh.getRow(1).getCell(3).getStringCellValue();
		
		DBProdPage prod= new DBProdPage(driver);
		
		prod.ValidateDBProdPageProductNameandprice(ProName , price1);
		Thread.sleep(2000);
		prod.HandelAleartPopup();
		prod.ClickOnDBProdPageCartBtn();
		
		DBCartPage cart= new DBCartPage(driver);
		cart.ValidateDBCartPageProductname();
		cart.ValidateDBCartPageProductPrice();
		cart.ValidateDBCartPageTotalPrice();
		cart.ClickOnDBCartPagePlaceOrder();
		
		
		DBPlaceOrderPage porder= new DBPlaceOrderPage(driver);
		String name = sh.getRow(1).getCell(4).getStringCellValue();
		String country = sh.getRow(1).getCell(5).getStringCellValue();
		String city = sh.getRow(1).getCell(6).getStringCellValue();
		String creditcard = sh.getRow(1).getCell(7).getStringCellValue();
		String month = sh.getRow(1).getCell(8).getStringCellValue();
		String year = sh.getRow(1).getCell(9).getStringCellValue();
		
		porder.EnterDBPlaceOrderPagenameFeild(name);
		porder.EnterDBPlaceOrderPagecountryFeild(country);
		porder.EnterDBPlaceOrderPagecityFeild(city);
		porder.EnterDBPlaceOrderPagecreditcardFeild(creditcard);
		porder.EnterDBPlaceOrderPagemonthFeild(month);
		porder.EnterDBPlaceOrderPageyearFeild(year);
		porder.ClickonDBPlaceOrderPagepurchaseBtn();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dsc= new File ("D:\\Study\\velocity class\\Automation\\Topics\\Selenium3_Frameworks\\Practice\\DemoBlaze\\order.jpeg");
		org.openqa.selenium.io.FileHandler.copy(src, dsc);
		
		//driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
