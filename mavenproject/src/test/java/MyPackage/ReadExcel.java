package MyPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel  {
	
@Test

public static void readExcelData() throws Exception
{
File src = new File("D:\\Datasheet1.xlsx");

FileInputStream fis = new FileInputStream(src);

XSSFWorkbook wb = new XSSFWorkbook(fis);
XSSFSheet sheet1 = wb.getSheetAt(0);
int rowcount = sheet1.getLastRowNum();
System.out.println("Total rows are "+rowcount);
for(int i=0;i<rowcount;i++)
{
String data = sheet1.getRow(i).getCell(0).getStringCellValue();
System.out.println("Data from excel is "+data);
}
wb.close();
	


}
}
