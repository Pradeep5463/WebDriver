package Aug12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws Throwable {
		//Create instance object for different browsers
				WebDriver driver = new ChromeDriver();
				//to maximise window
				driver.manage().window().maximize();
				//delete all cookies in browser
				driver.manage().deleteAllCookies();
				//launch URL
				driver.get("http://google.com");
				//suspend too from execution for 5sec
				Thread.sleep(5000);
				driver.close();
				

	}

}
