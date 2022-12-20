package Class12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class ModalAlert {
    public static void main(String[] args) {
        setUp(); //switch to url: demoqa

        WebElement modalAlert = driver.findElement(By.id("showSmallModal"));
        modalAlert.click();
        System.out.println(modalAlert.getText());

       // Thread.sleep();
        driver.findElement(By.xpath("//button[text()='Close']")).click();

        tearDown();
    }
}
