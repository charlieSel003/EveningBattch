import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class excelread {
	@Test
	public void read() throws IOException{
		File loc=new File("C:\\Users\\Kitty\\Desktop\\test.xlsx");
		FileInputStream fin=new FileInputStream(loc);
		Workbook wb=new XSSFWorkbook(fin);
		Sheet sh=wb.getSheet("sheet3");
		for(int i=0;i<sh.getPhysicalNumberOfRows();i++){
			Row row=sh.getRow(i);
			for(int j=0;j<row.getPhysicalNumberOfCells();j++){
		org.apache.poi.ss.usermodel.Cell ce=row.getCell(j);
				int num=ce.getCellType();
				if(num==1){
					System.out.println(ce.getStringCellValue());
				}else if(num==0){
					System.out.println(ce.getNumericCellValue());
					
				}
				
			}
		}
		
	}

}
