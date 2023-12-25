package sep9;

import org.openqa.selenium.By;

public class child extends Parent{
	public static void clickBranches()
	{
	driver.findElement(By.xpath("(//img)[5]")).click();
	}

	public static void main(String[] args) {
		Parent.launchurl("http://primusbank.qedgetech.com/");
		Parent.login("Admin", "Admin");
		child.clickBranches();
		

	}

}
