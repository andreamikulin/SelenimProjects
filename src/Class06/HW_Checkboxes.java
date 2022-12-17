package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class HW_Checkboxes {
    public static void main(String[] args) {
        setUp();

        driver.findElement(By.linkText("Checkboxes")).click();

        WebElement element1 = driver.findElement(By.xpath("//form/input[1]"));
        WebElement element2 = driver.findElement(By.xpath("//form/input[2]"));

        System.out.println("element1 is displayed = " + element1.isDisplayed()
                + "\nelement1 is enabled = " + element1.isEnabled()
                + "\nelement1 is selected = " + element1.isSelected());

        System.out.println("-------------------------------------------");

        System.out.println("element2 is displayed = " + element2.isDisplayed()
                + "\nelement2 is enabled = " + element2.isEnabled()
                + "\nelement2 is selected = " + element2.isSelected());

        tearDown();
    }

}
