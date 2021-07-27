//Here we are using implicit wait to find the element so program will execute faster than thread.sleep.

package synchronization;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicitwait {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement close = driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']"));
		close.click();
		Actions a = new Actions(driver);//object creation
	    List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for(WebElement menuname :menues)
		{
			System.out.println(menuname.getText());
			Thread.sleep(1000);
			a.moveToElement(menuname).build().perform();//calling non-static method
			//Thread.sleep(2000);
		}
	}
}
