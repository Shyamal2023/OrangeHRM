package MyPackage;

import java.io.IOException;

import org.testng.annotations.Test;

public class ReadExcelData {
	@Test
	public void readData() throws Exception
	{
		ExcelDataConfig obj1 = new ExcelDataConfig("D:\\Datasheet1.xlsx");
		 System.out.println(obj1.getData(0, 0, 1));
	}

}
