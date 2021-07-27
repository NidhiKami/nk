//to close browser in reverse order

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukri3
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> wins = driver.getWindowHandles();
		List<String> st = new ArrayList <String> (wins);
		for (int i = st.size() - 1; i>=0;i--)
		{
			String win = st.get(i);
			driver.switchTo().window(win);
			driver.close();
			Thread.sleep(1000);
		}
	}

}