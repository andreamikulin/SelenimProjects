package Class10;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");
        Row headerRow = sheet1.getRow(0);
        Cell r0c5_Salary = headerRow.getCell(5);
        System.out.println("r0c5_Salary = " + r0c5_Salary);
        Cell qa = sheet1.getRow(1).getCell(4);
        System.out.println(qa);
        CellType cellType = sheet1.getRow(1).getCell(4).getCellType();
        System.out.println("cellType = " + cellType);

        int rows = sheet1.getPhysicalNumberOfRows();
        short cols = sheet1.getRow(0).getLastCellNum();

        System.out.println("rows = " + rows);
        System.out.println("col = " + cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                Cell cellValues = sheet1.getRow(i).getCell(j);
                System.out.print(cellValues + " \t");
            }
            System.out.println();
        }


    }



}
