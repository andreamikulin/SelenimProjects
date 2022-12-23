package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class NestedFrames {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://ui.vision/demo/webtest/frames/");

        WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.name("mytext3")).sendKeys("Frame Three");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'docs')]")));

        String text = driver.findElement(By.cssSelector("div[class*='F9yp7e']")).getText();
        System.out.println("title = " + text);

        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_4.html']")));
        driver.findElement(By.name("mytext4")).sendKeys("Frame Four");

        Thread.sleep(2000);

        tearDown();
    }
}
