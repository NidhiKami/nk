package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement close = driver.findElement(By.xpath("//button[@class = '_2KpZ6l _2doB4z']"));
		close.click();
		Actions a = new Actions(driver);
		List<WebElement> menues = driver.findElements(By.xpath("//div[@class='_37M3Pb']/div"));
		for(WebElement menuname : menues)
		{
			System.out.println(menuname.getText());
			Thread.sleep(1000);
			a.moveToElement(menuname).build().perform();
			Thread.sleep(1000);
		}
		driver.close();
	}
}

