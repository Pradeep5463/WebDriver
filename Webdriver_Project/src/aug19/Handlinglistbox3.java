package aug19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinglistbox3 {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		//click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		//store date in select class
		Select dropdown = new Select(driver.findElement(By.id("day")));	
		//get collection of all items in dropdown
		List<WebElement> all_items = dropdown.getOptions();
		System.out.println("No of items in listbox is::"+all_items.size());
		//iterate all items
		for (WebElement each : all_items) {
			System.out.println(each.getText());
			
		}
		
           driver.quit();
           
		

	}

}
