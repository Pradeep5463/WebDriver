package aug29;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript5 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(5000);
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('txtPassword').value='Qedge123!@#'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(5000);
		String expected = "dashboard";
		
		String actual = js.executeScript("return document.URL").toString();
		if (actual.contains(expected)) {
			System.out.println("login success::"+expected+"  "+actual);
			
		}
		
		else
		{
			//capture error message
			String error_message = js.executeScript("return document.getElementById('spanMessage').innerHTML").toString();
			System.out.println(error_message+"  "+expected+"  "+actual);
			
		}
	}

}
