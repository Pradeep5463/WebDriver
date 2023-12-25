package Aug16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		//create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.tatacliq.com/");
		//print title and length of title
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		System.out.println(pagetitle.length());
		//print URL and its length
		String strurl = driver.getCurrentUrl();
		System.out.println(strurl);
		System.out.println(strurl.length());
		

	}

}
