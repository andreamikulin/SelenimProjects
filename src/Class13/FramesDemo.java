package Class13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class FramesDemo {

    public static void main(String[] args) throws InterruptedException {
        setUp("http://www.uitestpractice.com/Students/Switchto");

        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'©')]")).getText());

        driver.switchTo().frame(0);

        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("SDET");

        driver.switchTo().defaultContent();

        System.out.println(driver.findElement(By.xpath("//p[contains(text(),'©')]")).getText());
        Thread.sleep(2000);

        driver.switchTo().frame("iframe_a");
        textBox.clear();
        textBox.sendKeys("QA Engineer");
        Thread.sleep(2000);

        driver.switchTo().defaultContent();

        WebElement frame = driver.findElement(By.cssSelector("iframe[src='/Demo.html']"));
        driver.switchTo().frame(frame);
        textBox.clear();
        textBox.sendKeys("Frame By WebElement");


        tearDown();
    }
}
