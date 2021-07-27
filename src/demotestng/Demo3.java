//Here we are using before method anf after method so we not need to write some testcase again .

package demotestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Demo3 {
	WebDriver driver;
	@BeforeMethod
	public void bf()
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Bf");
	}
	@Test
	public  void tc_1() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
		System.out.println("Tc1");
	}
	@Test
	public  void tc_2() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("testng",Keys.ENTER);
		System.out.println("Tc2");
	}
	@AfterMethod
	public void af()
	{
		driver.close();
		System.out.println("Af");
	}
}
