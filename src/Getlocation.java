//Here we are perfoming webelement method getlocation to fetch the postion of webelement in the form of point class(x and y axis).

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getlocation {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			WebElement creataccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
			creataccount.click();
			Thread.sleep(1000);
			WebElement name = driver.findElement(By.xpath("//input[@name=\'firstname\']"));
			name.sendKeys("Nidhi");
			WebElement surename = driver.findElement(By.xpath("//input[@name='lastname']"));
			surename.sendKeys("Kami");
			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			Select s = new Select(day);
			s.selectByVisibleText("27");
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			Select s1 = new Select(month);
			s1.selectByValue("1");
			WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
			Select s2 = new Select(year);
			s2.selectByValue("1995");
			WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
			male.click();
			Thread.sleep(1000);
			System.out.println("Gender click is "+ male.isSelected());
			System.out.println(male.getTagName());
			Point loc = male.getLocation();
			System.out.println(loc);
			System.out.println(loc.getX() + "  " + loc.getY());
			
		}
	}


