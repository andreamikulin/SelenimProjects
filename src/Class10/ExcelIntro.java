package Class10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelIntro {
    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/Andrea/Desktop/TestFile.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println("cell = " + cell);;

        Row row1 = sheet.getRow(1);
        Cell cell1 = row1.getCell(2);
        System.out.println(cell1);
        
    }

}
