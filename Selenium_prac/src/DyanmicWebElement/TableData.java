package DyanmicWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		String row1 = driver.findElement(By.xpath("(//table[@id='customers']//tr)[2]")).getText();
		
		System.out.println(row1);
		
		
	}

}
