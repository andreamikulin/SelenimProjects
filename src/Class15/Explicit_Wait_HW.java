package Class15;

import org.apache.xmlbeans.GDurationSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class Explicit_Wait_HW {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/dynamic_loading/2");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true"); //gets rid of extgra error logs from console
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implicit, dynamic wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // explicit wait

        try {
            driver.findElement(By.cssSelector("div[id='start'] button")).click();

            //Thread.sleep(10000);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div#finish h4")));

            System.out.println(driver.findElement(By.cssSelector("div#finish h4")).getText());
            //Thread.sleep(1000);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Element is not found; wait longer or for element to become visible on UI");
        }
        tearDown();
    }
}
