package week8.day2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {

		// Step 1: Load Excel File
		// Step 2: Go to the workbook
		XSSFWorkbook wb=new XSSFWorkbook();
				
		// Step 3: Go to the sheet
		XSSFSheet sheet = wb.createSheet("Sheet1");
		
		// Create header Row
		XSSFRow header = sheet.createRow(0);
		
		// Create a cell
		XSSFCell cell = header.createCell(0);
		
		// Set Cell Value
		cell.setCellValue("Testcase");
		
		// Write to FOS
		FileOutputStream fos = new FileOutputStream(
				new File("./data/report.xlsx"));
		
		wb.write(fos);	
		
		// Close
		wb.close();		
	}

}






