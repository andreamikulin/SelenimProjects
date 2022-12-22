package Class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class ModalAlert {
    static String url = "https://demoqa.com/modal-dialogs";

    public static void main(String[] args) {
        setUp(url); //switch to url: demoqa

        WebElement modalAlert = driver.findElement(By.id("showSmallModal"));
        modalAlert.click();
        System.out.println(modalAlert.getText());

       // Thread.sleep();
        driver.findElement(By.xpath("//button[text()='Close']")).click();

        tearDown();
    }
}
