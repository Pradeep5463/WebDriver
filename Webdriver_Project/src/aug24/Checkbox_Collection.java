package aug24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Collection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/checkbox_1_lyst1698.html");
        Thread.sleep(5000);
        //get collection of checkboxes in webpage
        List<WebElement> all_checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println("No. of checkboxes are::"+all_checkboxes.size());
        //iterate all checkboxes
        for (WebElement each : all_checkboxes) {
        	//verify each cheackbox which is true or false
        	boolean value = each.isSelected();
        	//capture each box name
        	String checkbox_name = each.getAttribute("value");
        	System.out.println(checkbox_name+"  "+value);
        	//check checkbox which are not selected and uncheck selected
        	Thread.sleep(5000);
        	each.click();
		}
        Thread.sleep(5000);
        driver.quit();
        

	}

}
