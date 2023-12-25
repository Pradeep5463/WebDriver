package sep6;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidate {

	public static void main(String[] args) throws Throwable{
		//read path of file
		FileReader fr = new FileReader("D:/logindata.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while ((str=br.readLine())!=null) {
			//split notepad data into array
			String login[] = str.split(";");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://orangehrm.qedgetech.com/");
			Thread.sleep(5000);
			driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
			driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(3000);
			String Expected = "dashboard";
			String Actual = driver.getCurrentUrl();
			if(Actual.contains(Expected)) {
				System.out.println("login success"+"  "+Expected+"  "+Actual);
			}
			else
			{
				//capture error message
				String Error_Message = driver.findElement(By.id("spanMessage")).getText();
				System.out.println(Error_Message+"  "+Expected+"  "+Actual);
			}
			driver.quit();
			
		}
		
		
		

	}

}
