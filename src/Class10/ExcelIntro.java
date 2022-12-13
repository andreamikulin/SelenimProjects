package Class10;

import org.apache.poi.ss.usermodel.*;
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

        // 1st way of accessing cell value
        Cell cellValue2 = sheet.getRow(0).getCell(2);
        System.out.println("cellValue2 = " + cellValue2);

        // 2nd way of accessing cell value
        String cellValue1 = sheet.getRow(0).getCell(2).getStringCellValue();  // .toString()
        System.out.println("cellValue1 = " + cellValue1);

        // You cannot get String from Numeric, if data mismatch, you will get IllegalStateException
        // String caZipCode = sheet.getRow(1).getCell(4).getStringCellValue();
        double caZipCode = sheet.getRow(1).getCell(4).getNumericCellValue();
        System.out.println("caZipCode = " + caZipCode);

        // Identifying cell data types using the .getCellTypes() method.
        CellType r0c2DataType = sheet.getRow(0).getCell(2).getCellType();
        System.out.println("r0c2DataType = " + r0c2DataType);

        // Task 4: Find data type for CA Zip Code
        CellType r1c4DataType = sheet.getRow(1).getCell(4).getCellType();
        System.out.println("r1c4DataType = " + r1c4DataType);

        // Find total number of rows:
        int numOfRows = sheet.getPhysicalNumberOfRows();
        System.out.println("numOfRows = " + numOfRows);
        
        // Find number of columns:
        int numOfColumns = sheet.getRow(0).getLastCellNum();
        System.out.println("numOfColumns = " + numOfColumns);


    }

}
