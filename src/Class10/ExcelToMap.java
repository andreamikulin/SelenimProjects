package Class10;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ExcelToMap {

    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/EmployeeList.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet1 = workbook.getSheet("Sheet1");


        int rows = sheet1.getPhysicalNumberOfRows();
        int columns = sheet1.getRow(0).getLastCellNum();

        Map<String, String> map = new LinkedHashMap<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                String key = sheet1.getRow(0).getCell(j).toString();
                String value = sheet1.getRow(i).getCell(j).toString();
                map.put(key,value);
                System.out.println(key + " : " +  value);

            }

            Set<Map.Entry<String, String>> entries = map.entrySet();
            for (Map.Entry entry : entries) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            System.out.println();
        }
    }
}
