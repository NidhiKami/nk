//here we are typing java in search bar and java page will open and we are double clicking in right java weblement.

package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java",Keys.ENTER);
		WebElement java = driver.findElement(By.xpath("//h2/span[contains(.,'Java')]"));
		Actions a = new Actions (driver);
		a.doubleClick(java).perform();
}
}
