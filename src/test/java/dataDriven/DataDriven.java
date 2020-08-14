package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {


	}

	public ArrayList<String> getData(String testCasename) throws IOException{
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Documents\\Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		System.out.println(sheets);
		ArrayList<String> a = new ArrayList<String>();
		for(int i=0;i<sheets;i++){
			if (workbook.getSheetName(i).equalsIgnoreCase("Sheet1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows =  sheet.iterator();
				Row firstRow = rows.next();

				Iterator<Cell> cells = firstRow.cellIterator();
				int column = 0,k=0;
				while (cells.hasNext()) {
					Cell cell = cells.next();
					//System.out.println(cell.getStringCellValue());
					if(cell.getStringCellValue().equalsIgnoreCase("TestCases")){
						column = k;
					}
					k++;
				}
				System.out.println(column);

				while (rows.hasNext()) {
					Row row = rows.next();
					Iterator<Cell> cv = row.cellIterator();
					if(row.getCell(column).getStringCellValue().equalsIgnoreCase(testCasename)){
						while (cv.hasNext()) {
							Cell ce = cv.next();
							if(ce.getCellTypeEnum()==ce.getCellType().STRING){
								a.add((ce.getStringCellValue()));
							}else{
								a.add(NumberToTextConverter.toText(ce.getNumericCellValue()));
							}
						}
					}
				}
			}
		}
		return a;
	}

}

