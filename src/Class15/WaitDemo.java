package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static utils.BaseClass.*;

public class WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/dynamic_loading/2");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Thread.sleep(2000);

        try {
            driver.findElement(By.cssSelector("div#start button")).click();
            WebElement helloWorld = driver.findElement(By.cssSelector("div#finish h4"));
            System.out.println("Hello World text: " + helloWorld.getText());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Element is not found. You might want to wait longer for it to appear");
        }



        tearDown();
    }
}
