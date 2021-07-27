//to close only child browser 

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukri2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println("hello" + parent);
		Set<String> wins = driver.getWindowHandles();
		wins.remove(parent);
		for (String win : wins)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			driver.close();
			Thread.sleep(1000);
		}
	}

}