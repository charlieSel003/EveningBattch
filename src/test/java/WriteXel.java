import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteXel {
	
	@Test
	public void writeExcel() throws IOException{
		File f = new File("C:\\Users\\Kitty\\Desktop\\demo.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		sh.getRow(0).createCell(6).setCellValue("charlie");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}}


