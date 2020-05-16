import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excelwrite {
	@Test
	public void read() throws IOException{
		File loc=new File("C:\\Users\\Kitty\\Desktop\\test.xlsx");
		FileInputStream fin=new FileInputStream(loc);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sh=wb.getSheet("sheet1");
		int rowNumber=4;
		int columnNumber=0;
		//int rowNumber1=4;
		//int columnNumber1=1;
		//int rowNumber2=4;
		//int columnNumber2=2;
		if(sh.getRow(rowNumber)==null){
		sh.createRow(rowNumber);	
		}
	Cell cel=sh.getRow(rowNumber).getCell(columnNumber);
	
	if(cel==null){
		sh.getRow(rowNumber).createCell(columnNumber).setCellValue("9");
	}
	else{
		sh.getRow(rowNumber).getCell(columnNumber).setCellValue("4");
	}
	FileOutputStream fout = new FileOutputStream(loc);
	
	
		wb.write(fout);
		fout.close();
	
		

}
}