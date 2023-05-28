package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenderListbox {

	public static void main(String[] args) {
 
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/signup/");
		
		WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));
		
		//Select s= new Select(gender);
		//s.selectByIndex(1);
		
		//using actionclass
		
		Actions act= new Actions(driver);
		act.click(gender).perform();
	
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

		
	}

}
