package aug25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouse {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://flipkart.com");
		Thread.sleep(5000);
		//create object for action class
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ESCAPE).perform();
		//move mouse to electronics
		ac.moveToElement(driver.findElement(By.xpath("(//*[span='Electronics'])[2]"))).perform();
		Thread.sleep(5000);
		//move mouse to all and click it
		ac.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		//move mouse to fashion
		ac.moveToElement(driver.findElement(By.xpath("(//*[span='Fashion'])[2]"))).perform();
		//move mouse to Mens T-shirts and click it
		ac.moveToElement(driver.findElement(By.linkText("Men's T-Shirts"))).click().perform();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
