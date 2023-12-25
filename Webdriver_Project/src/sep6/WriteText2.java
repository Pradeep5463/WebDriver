package sep6;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteText2 {

	public static void main(String[] args) throws Throwable {
		File f = new File("D:/ Sample.text");
		FileWriter fr = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fr);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		String para1 = driver.findElement(By.xpath("(//*[@class='style7'])[10]")).getText();
		String para2 = driver.findElement(By.xpath("(//*[@class='style7'])[11]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.quit();
		
      
		
		
	}

}
