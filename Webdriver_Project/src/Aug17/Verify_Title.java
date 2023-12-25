package Aug17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	
		public static void main(String[] args) throws Throwable {
			//create instance object
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.google.com");
			Thread.sleep(5000);
	        String Expected_Title = "google";
	        String Actual_Title = driver.getTitle();
	        //Verify Expected Title equals to Actual Title
	        if(Expected_Title.equalsIgnoreCase(Actual_Title))
	        {
	        	System.out.println("Title is Matching::"+Expected_Title+"  "+Actual_Title);
	        }
	        else
	        {
	        	System.out.println("Title is Not Matching::"+Expected_Title+"  "+Actual_Title);
	        }
	        
	        driver.quit();
	}

}
