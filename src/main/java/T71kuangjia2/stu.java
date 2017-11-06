package T71kuangjia2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class stu {

	public static void main(String[] args) throws Exception {

		File xlsFile = new File("./config/stu2003.xls");
		FileInputStream in =new FileInputStream(xlsFile);
		HSSFWorkbook workbook = new HSSFWorkbook(in);
		Sheet sheet = workbook.getSheetAt(0);
		int coloumNum=sheet.getRow(0).getPhysicalNumberOfCells();
		int rowNum=sheet.getLastRowNum();
		Row row2 = sheet.getRow(1);
		
		Cell cell1 = row2.getCell(0);
		Cell cell2 = row2.getCell(1);
		Cell cell3 = row2.getCell(2);
		System.out.println(cell1.getNumericCellValue());
		System.out.println(cell2.getStringCellValue());
		System.out.println(cell3.getNumericCellValue());

		for(int i=0;i<=rowNum;i++){
        	Row row=sheet.getRow(i);
        	for(int j=0;j<coloumNum;j++){
        		Cell cell=row.getCell(j);
        		System.out.print(cell+"  ");
        	}
        	System.out.println("");
        }
		

		
		
	  
	}

}
