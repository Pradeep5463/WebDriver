package aug21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///D:/MultiListboxHtmlpage_lyst3659.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//select 0 to 10 items
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(5000);
			dropdown.selectByIndex(i);
			
		}
			//print no. of items selected
		List<WebElement> Selected_Items = dropdown.getAllSelectedOptions();
		System.out.println("No. of items selected are::"+Selected_Items.size());
		//print name of all selected items
		for (WebElement each : Selected_Items) {
			System.out.println(each.getText());
			
		}
		driver.quit();
	}

}
