package sep1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender1 {

	public static void main(String[] args) throws Throwable {
		String dob = "21-Mar-1996";
		String temp[] = dob.split("-");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		//click registed link
		driver.findElement(By.linkText("Register")).click();
		//click dob textbox to get calender
		driver.findElement(By.name("dob")).click();
		Thread.sleep(5000);
		//select year from listbox
		new Select(driver.findElement(By.className("ui-datepicker-year"))).selectByVisibleText(year);
		Thread.sleep(5000);
		//select month from listbox
		new Select(driver.findElement(By.className("ui-datepicker-month"))).selectByVisibleText(month);
		Thread.sleep(5000);
		//store table into webelement
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		//get row collection
		rows = webtable.findElements(By.tagName("tr"));
		for(WebElement eachrow : rows) {
			cols = eachrow.findElements(By.tagName("td"));
			for(WebElement eachcell : cols) {
				if(eachcell.getText().equals(date)) {
					Thread.sleep(5000);
					eachcell.click();
					break;
					
				}
			}
		}
		

	}

}
