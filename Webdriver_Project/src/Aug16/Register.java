package Aug16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws Throwable {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//launch URL
		driver.get("http://flights.qedgetech.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		//click on register link
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		//fill register form
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pradeep");
		driver.findElement(By.xpath("//input[@id='contact']")).sendKeys("8121203680");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pradeep.a4812@gmail.com");
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Test1234");
		driver.findElement(By.xpath("//select[@name='gender']")).sendKeys("Male");
		driver.findElement(By.xpath("//input[@id='popupDatepicker']")).sendKeys("21-03-1996");
		driver.findElement(By.xpath("//input[@id='flexCheckChecked']")).click();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		

	}

}
