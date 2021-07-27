import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Bluestone
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='Gold Mine 10+1 Monthly Plan']")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kami@kami");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value=\"Start Now\"]")).click();
	}
}