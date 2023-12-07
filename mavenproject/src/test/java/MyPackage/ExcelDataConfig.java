package MyPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public ExcelDataConfig(String excelpath) throws IOException
	{
		File src = new File(excelpath);

		FileInputStream fis = new FileInputStream(src);

		wb = new XSSFWorkbook(fis);
		
	}
	
	public String getData(int sheetnumber, int row, int column)
	{   sheet1 = wb.getSheetAt(sheetnumber);
		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}

}
