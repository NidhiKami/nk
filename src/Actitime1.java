//here we us Actitime example by finding user and pwd xpath and passed to usename and password  by getText method.

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement user = driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		WebElement password = driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(user.getText());
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password.getText(), Keys.ENTER );

	}
}