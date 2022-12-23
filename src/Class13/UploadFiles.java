package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class UploadFiles {

    public static void main(String[] args) {
        setUp("https://the-internet.herokuapp.com/upload");

        String filePath = "C:\\Users\\Andrea\\Desktop\\Screenshot 2022-12-21 194815.png";

        driver.findElement(By.id("file-upload")).sendKeys(filePath);

        driver.findElement(By.id("file-submit")).click();

        WebElement fileUploadConf = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        if (fileUploadConf.isDisplayed())
            System.out.println("File is uploaded successfully");
        else
            System.out.println("File is NOT uploaded");


        tearDown();
    }
}
