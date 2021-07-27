package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sce5 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		WebElement rings = driver.findElement(By.xpath("//a[contains(.,'Rings ')]"));
		Actions a = new Actions(driver);
		a.moveToElement(rings).perform();
		driver.findElement(By.xpath("//ul[@class='two-col']/li/a[@title='Diamond Rings']")).click();
		Thread.sleep(1000);
		WebElement price = driver.findElement(By.xpath("//span/span[contains(.,'Price')]"));
		a.moveToElement(price).perform();
		List<WebElement> listprice = driver.findElements(By.xpath("//form[@id='price']/div[@class='form-items']/div"));
		for(WebElement dp:listprice) 
		{
			System.out.println(dp.getText());
		}
		WebElement popular = driver.findElement(By.xpath("//span/span[contains(.,'Popular')]"));
		a.moveToElement(popular).perform();
		WebElement lh = driver.findElement(By.xpath("//a[contains(.,'Price Low to High ')]"));
		a.moveToElement(lh).perform();
		lh.click();
	}
}