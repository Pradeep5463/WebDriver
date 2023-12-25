package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript4 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		js.executeScript("document.querySelector(\"#input-firstname\").value='Pradeep'");
		js.executeScript("document.getElementById('input-lastname').value='Kumar'");
		js.executeScript("document.getElementById('input-email').value='pradeep.a4812@gmail.com'");
		js.executeScript("document.getElementById('input-password').value='Pradeep@123.'");
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('input-newsletter-yes').click()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");
		
		
		
		
		

	}

}
