//sending data in webelement  by using sendkeys and using click method to click on web element.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement email= driver.findElement(By.id("email"));
	    email.sendKeys("12345678");
	    WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("java");
	    WebElement login = driver.findElement(By.name("login"));
	    login.click();
	    
}
}