//Here we are performing ismultiple method to chech selected option contain multile option or not.

package selectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Nidhi/Documents/demo.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//select[@id='b']"));
		Select s = new Select(ele);
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			Thread.sleep(1000);
			s.selectByValue("323");
			Thread.sleep(1000);
			s.selectByVisibleText("324");
		}

	}
}