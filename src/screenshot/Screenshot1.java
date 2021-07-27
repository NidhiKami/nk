package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot1 {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	public static void takePic(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot )driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		File sssave = new File("./ScreenShot/" +  name + ".png");
		Files.copy(ss, sssave);
	}
}
