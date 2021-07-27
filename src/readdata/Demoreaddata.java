package readdata;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demoreaddata {
public static void main(String[] args) throws Exception
{
	//String path = "‪D:/login.xlsx";
	FileInputStream fis = new FileInputStream("‪D:\\login.xlsx");//mentioning path of the file
	Workbook wb = WorkbookFactory.create(fis);//to load the excel file
	Sheet sh = wb.getSheet("Sheet1");//loading the sheet of excel
	int rowCount = sh.getPhysicalNumberOfRows();//to get the row count
	int cell = sh.getRow(0).getLastCellNum();//to get the cell count of 0th row
	{
		for(int i = 0 ; i < rowCount; i++) {
			int colCount = 0;
			for(int j = 0 ; j < colCount; j++) {
				Cell c1 = sh.getRow(i).getCell(j);
				System.out.println(c1);
			}
		}
	}
	
}
}
