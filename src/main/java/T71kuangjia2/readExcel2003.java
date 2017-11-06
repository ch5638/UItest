package T71kuangjia2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class readExcel2003 {

	public static void main(String[] args) {

		File excelFile=new File("./config/stu2003.xls");
		FileInputStream in;
		
		try {
			in=new FileInputStream(excelFile);
			HSSFWorkbook wb=new HSSFWorkbook(in);
			Sheet sheet=wb.getSheetAt(0);
			
			//获取总的列数
			int coloumNum=sheet.getRow(0).getPhysicalNumberOfCells();
			//获取总的行数
			int rowNum=sheet.getLastRowNum(); //行数总零来上，需要加1
			
			System.out.println("列数："+coloumNum);
			System.out.println("行数："+(rowNum+1));
	
			//读取第二行
			Row row2=sheet.getRow(1);
			
			Cell cell0=row2.getCell(0);
			Cell cell1=row2.getCell(1);
			Cell cell2=row2.getCell(2);
			
			//提取数据
			int stuNo= (int)   cell0.getNumericCellValue(); //其他整数
			String stuName= cell1.getStringCellValue();
			int stuAge=(int) cell2.getNumericCellValue();
	        System.out.println("学号："+stuNo);
	        System.out.println("姓名："+stuName);
	        System.out.println("年龄："+stuAge);
	        
	        //获取类型
	        System.out.println(cell0.getCellType());
	        System.out.println(cell1.getCellType());
	        System.out.println(cell2.getCellType());
	        
	        //循环取数
	        for(int i=0;i<=rowNum;i++){
	        	Row row=sheet.getRow(i);
	        	for(int j=0;j<coloumNum;j++){
	        		Cell cell=row.getCell(j);
	        		System.out.print(cell+"  ");
	        	}
	        	System.out.println("");
	        }
	        	
	        
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
