package javaexecutescript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltill {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		System.out.println(search.isDisplayed());
		search.sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//h3[contains(.,'Java Tutorial - Tutorialspoint')]"));
		js.executeScript("arguments[0].scrollIntoView()",ele);
	}
}

