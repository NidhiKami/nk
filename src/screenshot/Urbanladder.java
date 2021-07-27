package screenshot;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		String name = null;
		Screenshot1.takePic(driver, name);
		
		List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for(WebElement menuname :menues)
		{
			String sname = menuname.getText();
			System.err.println(menuname.getText());
			Thread.sleep(1000);
			a.moveToElement(menuname).build().perform();
			Thread.sleep(2000);
			List<WebElement> submenues = driver.findElements(By.xpath("//span[contains(.,'"+sname+"')]//parent::li/descendant::ul[@class=\"taxonslist\"]/li"));
		    for(WebElement submenue : submenues)
		    {
		    	System.out.println(submenue.getText());
		    }
		}
	}
}
