package Readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelTest {
	
	public void writeTest(String nameRecieved) throws Exception {
		
		File src = new File("C:\\excel");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook xsf = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = xsf.getSheetAt(0);
		
		sheet.getRow(1).getCell(1).setCellValue(nameRecieved);
		FileOutputStream fos = new FileOutputStream(src);
		
		xsf.write(fos);
		
		xsf.close();
		
		
		
	}

}
