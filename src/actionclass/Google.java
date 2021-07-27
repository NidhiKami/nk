//Here we are typing java in search bar and we are fetching all suggestion in console and clicking on 3 suggestion.
package actionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		for(WebElement sg:suggestion)
		{
			System.out.println(sg.getText());
		}
		
		suggestion.get(3).click();
	}
}