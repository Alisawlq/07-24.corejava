package excel;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Read {

	public static void main(String[] args) throws Exception {
		
		InputStream in = new FileInputStream("C:/07.24-file/demo.xls");
		
		HSSFWorkbook wb = new HSSFWorkbook(in);
		
		HSSFSheet sheet = wb.getSheetAt(0);
		
		Iterator<Row> rows = sheet.iterator();
		
		while(rows.hasNext()) {
			
			Row row = rows.next();
			
			Iterator<Cell> cells =  row.cellIterator();
			
			while(cells.hasNext()) {
				
				Cell cell = cells.next();
				
				
				
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t\t");
					break;

				default:
					break;
				}
				
				
			}
			System.out.println();
			
		}
		

	}

}
