package Aug17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_URL {

	public static void main(String[] args) {
		//Create Instance Object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		String Expected = "https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("Url is Secured::"+Expected+"  "+Actual);
		}
		else
		{
			System.out.println("Url is not secured::"+Expected+"  "+Actual);
		}

		
		driver.quit();
		
	}

}
