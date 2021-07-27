//Here we have perfrom Right click and Double click with the help of action class

package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightandDoubleClick {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//WebElement ele = driver.findElement(By.xpath("//span[contains(.,'right click me')]"));//Rightclick
		Actions a = new Actions(driver);
		//a.contextClick(ele).build().perform();/Right click
		WebElement le = driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));//double click
		a.doubleClick(le).build().perform();//double click
	}
}

