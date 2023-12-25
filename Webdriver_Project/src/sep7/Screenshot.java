package sep7;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//create java time stamp
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("dd_MM_YYYY  hh_mm_ss");
		String datef = df.format(date);
		//take screenshot and store into one variable
		File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy Screenshot into locat File
		FileUtils.copyFile(screen, new File("D:/Screenshot/"+datef+"   "+"homepage.jpg"));
		driver.quit();
		
		

	}

}
