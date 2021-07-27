package demotestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo5 {
	@BeforeSuite
	public void bs()
	{
		System.out.println("bs");
	}
	@BeforeTest
	public void bT()
	{
		System.out.println("bt");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("bc");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("bm");
	}
	@Test
	public void tc1()
	{
		System.out.println("hello 1....");
	}
	@Test
	public void tc2()
	{
		System.out.println("hello 2....");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("am");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("ac");
	}
	@AfterTest
	public void at()
	{
		System.out.println("at");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("as");
	}

}
