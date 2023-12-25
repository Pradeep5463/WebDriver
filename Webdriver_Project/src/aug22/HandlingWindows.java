package aug22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://gmail.com");
		Thread.sleep(5000);
		//print parent window ID
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		//click on links like help'privacy and terms link to open in new tab
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//get collection of all window Ids
		Set<String> allwins = driver.getWindowHandles();
		System.out.println(allwins);
		//iterate all windows
		for (String each : allwins) {
			//parent ID should not be equal to child ID
			if (!parent.equals(each)) {
				//switch to each title window get title and close
				Thread.sleep(5000);
				String pagetitle = driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				Thread.sleep(5000);
				driver.close();
				
			}
			
		}
		
		//switch to parent
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		driver.findElement(By.id("identifierId")).sendKeys("pradeep.a4812@gmail.com");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
