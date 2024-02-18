package Readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadexcelSheet {

	public void dataReadTest() throws Exception
	{
		File src = new File("C:\\excel");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = xsf.getSheetAt(0);
		String entry1 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("This data in the box is "+ entry1);
		
		xsf.close();
		
	}	
}
