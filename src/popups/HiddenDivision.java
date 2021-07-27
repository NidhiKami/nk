package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@onclick='openHelpAndSupportMenu(event)']")).click();
	    driver.findElement(By.xpath("//a[@onclick='MenuHandler.openAbout(); return false;']")).click();
	    WebElement fetch = driver.findElement(By.xpath("//span[contains(.,'© 2021 actiTIME Inc. All rights reserved.')]"));
	    System.out.println(fetch.getText());
	}
	
}
