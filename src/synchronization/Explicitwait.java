//Here we are using Explicit wait for checking condition.

package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement user = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user.getText());
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(), Keys.ENTER );
		WebElement logout = driver.findElement(By.xpath("//a[@id='logoutLink']"));
		WebDriverWait ww = new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();
		

	}
}