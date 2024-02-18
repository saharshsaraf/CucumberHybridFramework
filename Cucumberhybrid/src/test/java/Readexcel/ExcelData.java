package Readexcel;

import java.util.Scanner;

public class ExcelData {

	public void exceldata() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.next();
		
		WriteExcelTest ret = new WriteExcelTest();
		ret.writeTest(name);
		
	}
	
}
