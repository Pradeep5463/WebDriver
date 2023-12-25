package sep1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender2 {

	public static void main(String[] args) throws Throwable {
		String doj = "11/May/2030";
		String temp[] = doj.split("/");
		String date = temp[0];
		String month = temp[1];
		String year = temp[2];
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(5000);
		//switch to frame
		driver.switchTo().frame(0);
		//click date textbox
		driver.findElement(By.id("datepicker")).click();
		//capture year from calender
		String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!calyear.equals(year)) {
			//click next button
			Thread.sleep(100);
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			System.out.println(calyear);
		}
		//capture month from calender
		String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equalsIgnoreCase(month)) {
			//click next button
			Thread.sleep(100);
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			System.out.println(calmonth);
			
		}
		WebElement webtable = driver.findElement(By.className("ui-datepicker-calendar"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		for(WebElement eachrow : rows) {
			cols = driver.findElements(By.tagName("td"));
			for(WebElement eachcell : cols) {
				if(eachcell.getText().equals(date)) {
					Thread.sleep(2000);
					eachcell.click();	
				}
				
			}
		}
		
		
		

	}

}
