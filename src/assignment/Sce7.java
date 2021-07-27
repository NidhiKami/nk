package assignment;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sce7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement jewellery = driver.findElement(By.xpath("//a[contains(.,'All Jewellery' )]"));
		Actions a = new Actions(driver);
		a.moveToElement(jewellery).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(.,'Kadas' )]")).click();
		driver.findElement(By.xpath("//div/a[@onclick=\"trackGA( 'BsUI',  'ClickedHoverImage-ProductHover',  '8994');\"]")).click();
		Thread.sleep(1000);
		Set<String> wins = driver.getWindowHandles();
		for(String win :wins)
		{
			driver.switchTo().window(win);
		}
		Thread.sleep(1000);
		WebElement buy = driver.findElement(By.xpath("//input[@id='buy-now']"));
		buy.click();
		Thread.sleep(1000);
		WebElement err = driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println(err.getText());

	}
}
