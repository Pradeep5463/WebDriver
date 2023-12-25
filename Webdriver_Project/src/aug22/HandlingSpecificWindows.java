package aug22;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSpecificWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://gmail.com");
		Thread.sleep(5000);
		//click on links like help'privacy and terms link to open in new tab
				driver.findElement(By.linkText("Help")).click();
				driver.findElement(By.linkText("Privacy")).click();
				driver.findElement(By.linkText("Terms")).click();
				//store all windows into arraylist
				ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
				System.out.println(brw);
				//switch to google account help and click on link
				driver.switchTo().window(brw.get(2));
				Thread.sleep(5000);
				//click link
				driver.findElement(By.linkText("Community")).click();
				Thread.sleep(5000);
				driver.close();
				//switch to privacy window and click on link
				driver.switchTo().window(brw.get(3));
				driver.findElement(By.linkText("Technologies")).click();
				Thread.sleep(5000);
				driver.quit();
				
				
		

	}

}
