//Here we are using invocationcount  so we can run testcase as many time or multiple time as we want.

package demotestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
	@Test(invocationCount = 5)
	public void tc_1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("java");
		driver.close();
	}
}



