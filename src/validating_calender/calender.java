package validating_calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calender {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
	Thread.sleep(1000);
	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected());
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

	
	driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
	driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-hover']")).click();
	
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5")) {
		System.out.println("Disabled");
	} else if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 1")) {
	System.out.println("enabled");	
	}
	
	Thread.sleep(3000);
	driver.quit();
	}
}