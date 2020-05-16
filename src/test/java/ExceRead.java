import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExceRead {

	@Test
	public void ReadExcel() throws IOException {
		File f = new File("C:\\Users\\Kitty\\Desktop\\demo123.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		sh.getRow(3).createCell(6).setCellValue("test");
		sh.getRow(4).createCell(5).setCellValue("charlie");
		
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
	}

}
