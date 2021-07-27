package demotestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoProvider {
@DataProvider
public String [][] data(){
	String [][]val = new String [3][2];
	val[0][0] = "User A";
	val[0][1] = "A";
	val[1][0] = "User A";
	val[1][1] = "A";
	val[2][0] = "User A";
	val[2][1] = "A";
	return val;
	}
@Test(dataProvider = "data")
public void tc(String user,String pass)
{
	System.out.println(user + "  "   + pass);
}
}
