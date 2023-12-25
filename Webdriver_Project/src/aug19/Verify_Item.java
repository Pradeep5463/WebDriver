package aug19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Item {

	public static void main(String[] args) throws Throwable {

        String Expected_Item = "Books";
        boolean item_Exist = false;
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://amazon.in");
        Thread.sleep(5000);
        Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
        //get items collection
        List<WebElement> all_Items = dropdown.getOptions();
        System.out.println("No of items in list are::"+all_Items.size());
        Thread.sleep(5000);
        for (WebElement each : all_Items) {
        	Thread.sleep(1000);
        	String Actual_Item = each.getText();
        	System.out.println(Actual_Item);
        	if (Actual_Item.equalsIgnoreCase(Expected_Item)) {
        		item_Exist = true;
        		break;
			}
        	
        }
        	if (item_Exist) {
        		//if item_Exist is true
        		System.out.println(Expected_Item+"  "+"Item found in listbox");
				
			}
        	else {
				//if item_Exist is false
        		System.out.println(Expected_Item+" "+"Item not found in listbox");
			}
        	driver.quit();
        	
		}
            
	}


