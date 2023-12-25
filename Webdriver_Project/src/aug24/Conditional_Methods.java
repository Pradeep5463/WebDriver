package aug24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[starts-with(@id,'u_0')])[6]")).click();
		Thread.sleep(1000);
		//verify first name textbox is enabled or not
		WebElement firstname = driver.findElement(By.xpath("(//*[contains(@id,'u_')])[8]"));
		boolean First_IsEnabled = firstname.isEnabled();
		System.out.println(First_IsEnabled);
		//verify reenter email textbox is displayed or hidden
		WebElement reentertextbox = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean mail_isdisplayed = reentertextbox.isDisplayed();
		System.out.println(mail_isdisplayed);
		//verify radio button is true or false
		WebElement radiobutton = driver.findElement(By.xpath("(//*[@value='1'])[4]"));
		boolean radio_isselected = radiobutton.isSelected();
		System.out.println(radio_isselected);
		driver.quit();
		
		

	}

}
