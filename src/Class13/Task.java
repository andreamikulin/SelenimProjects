package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class Task {

    public static void main(String[] args) throws InterruptedException {
        setUp("https://ui.vision/demo/webtest/frames/");

        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_5.html']")));
        System.out.println(driver.findElement(By.xpath("//*[contains(text(), 'a9t9')]")).getText());
        driver.findElement(By.xpath("//*[contains(text(), 'a9t9')]")).click();
        Thread.sleep(2000);
        tearDown();
    }
}
