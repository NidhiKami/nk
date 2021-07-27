//Here we are perfoming webelement method isenable for checking weblement present in weg page is enable or not.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(search.isDisplayed());
		System.out.println("is Enable : " + search.isEnabled());
		search.sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));
		for(WebElement sg:suggestion)
		{
			System.out.println(sg.getText());
		}
		
		suggestion.get(3).click();
	}

}
