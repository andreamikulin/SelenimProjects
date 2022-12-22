package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class FramesDemo2 {

    public static void main(String[] args) throws InterruptedException {
        setUp("https://ui.vision/demo/webtest/frames/");

        List<WebElement> allLinks = driver.findElements(By.tagName("a")); // for links
        System.out.println("allLinks.size() = " + allLinks.size());
        
        List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
        System.out.println("allFrames = " + allFrames.size());

        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_1.html']")));
        driver.findElement(By.name("mytext1")).sendKeys("Frame One");

        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_2.html']")));
        driver.findElement(By.name("mytext2")).sendKeys("Frame Two");

        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='frame_5.html']")));
        driver.findElement(By.name("mytext5")).sendKeys("Frame Five");



        tearDown();
    }
}
