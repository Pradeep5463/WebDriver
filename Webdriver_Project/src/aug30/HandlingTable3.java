package aug30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into web element object
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows,cols;
		rows = webtable.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println("No.of Rows are::"+row);
		Thread.sleep(5000);
		//iterate all rows
		for(WebElement eachrow : rows) {
			//get each row cell collection
			cols = eachrow.findElements(By.tagName("td"));
			//iterate all cells
			for(WebElement eachcol : cols) {
				Thread.sleep(5000);
				System.out.print("\n"+eachcol.getText());
			}
			System.out.println();
			System.out.println("================================================");
		}
		driver.quit();
		

	}

}
