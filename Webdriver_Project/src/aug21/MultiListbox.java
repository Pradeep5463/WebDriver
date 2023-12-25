package aug21;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiListbox {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/MultiListboxHtmlpage_lyst3659.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//verify listbox is single or multiselection
		Boolean value = dropdown.isMultiple();
		System.out.println(value);
		//select 0 to 8 items in listbox
		for (int i=0;i<8;i++)
		{
			Thread.sleep(5000);
			dropdown.selectByIndex(i);
		}
		//deselect from selection
		dropdown.deselectByIndex(5);
		Thread.sleep(5000);
		dropdown.deselectByVisibleText("Yellow");
		Thread.sleep(5000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
