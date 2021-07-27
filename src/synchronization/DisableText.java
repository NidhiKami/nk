//Here we are using custom wait and checking  and passing text to the text box.

package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisableText {
	public static void main(String []arg)
	{

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nidhi/Documents/DisableText.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait ww = new WebDriverWait(driver,10);
		ww.until(new ExpectedCondition<Boolean>()
		{
			@Override
			public Boolean apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("//input[@id='abc']")).isEnabled();
			}
		}
				);
		driver.findElement(By.xpath("//input[@id='abc']")).sendKeys("Nidhi");

	}
}
