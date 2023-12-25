package Aug18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.google.com");
		System.out.println("pagetitle[1]"+driver.getTitle());
		Thread.sleep(5000);
		//click on gmail link
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("pagetitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		//click on back button
		driver.navigate().back();
		System.out.println("pagetitle[3]"+driver.getTitle());
		Thread.sleep(5000);
		//click on forward button
		driver.navigate().forward();
		System.out.println("pagetitle[4]"+driver.getTitle());
		//click on reload page and close browser
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.quit();
		
		
		

	}

}
