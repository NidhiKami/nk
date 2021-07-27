//Here we are using alert popup and sending text to textbox  and fetching text to console.

package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo2 {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	Alert a = driver.switchTo().alert();
	System.out.println(a.getText());
	a.sendKeys("Kami");
	a.accept();
	WebElement result = driver.findElement(By.xpath("//span[@id='promptResult']"));
	System.out.println(result.getText());
	
}
}
