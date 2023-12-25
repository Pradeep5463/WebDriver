package Aug17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		//capture gmail text
		String VisibleText = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(VisibleText);
		//Capture gmail link url
		String gmaillink = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(gmaillink);
		
		driver.quit();
		
		

	}

}
