package Aug17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validate_Login {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
        //store username into web element
		WebElement username = driver.findElement(By.name("txtUsername"));
		//clear text
		username.clear();
		username.sendKeys("Admin");
		//capture user value into one variable
		String Objuservalue = username.getAttribute("value");
		//Store password value into web element
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.clear();
		password.sendKeys("Qedge123!@#");
		//capture password into one variable
		String Objpassvalue = password.getAttribute("value");
		//print username and password value
		System.out.println(Objuservalue+"  "+Objpassvalue);
		//click login button
		driver.findElement(By.name("Submit")).submit();
		Thread.sleep(5000);
		String Expected = "dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("login Success::"+Expected+"  "+Actual);
		}
		else
		{
			//capture error message
			String error_message = driver.findElement(By.id("spanMessage")).getText();
			System.out.println(error_message+"  "+Expected+"  "+Actual);
		}
		
		
		
		
		
	}

}
