import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");//to load the url
        driver.manage().window().maximize();// to maximize the window
        String title = driver.getTitle();//to fetch the title of webpage
        System.out.println(title);
        Thread.sleep(2000);
        driver.navigate().back();//navigate method
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
		//driver.close();//to close the url
	}
}
