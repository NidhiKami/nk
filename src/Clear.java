//Here we are perfoming webelement method clear for clear the value which is present in wbelement.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(search.isDisplayed());
		search.sendKeys("java");
		Thread.sleep(2000);
		search.clear();
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		for(WebElement sg:suggestion)
		{
			System.out.println(sg.getText());
		}
		
		suggestion.get(3).click();
	}
}

