package popups;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		driver.findElement(By.id("file_wraper0")).click();
		Thread.sleep(2000);
		Runtime r = Runtime.getRuntime();
		//String path = "‪D:\\selenium2.exe";
		r.exec("‪D:\selenium2.exe");
}
}