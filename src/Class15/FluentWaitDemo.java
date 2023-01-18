package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static utils.BaseClass.*;

public class FluentWaitDemo {
    public static void main(String[] args) {
        setUp("https://omayo.blogspot.com/");
        FluentWait<WebDriver> fluentWait = new FluentWait<>(driver);
        fluentWait.withTimeout(Duration.ofSeconds(15)); // Wait for up to given time (15 seconds)
        fluentWait.pollingEvery(Duration.ofSeconds(1));  // Keep checking for presence of element ever 1 second
        fluentWait.ignoring(NoSuchElementException.class); // Do not throw given exception until max time (15 seconds) is reached

        driver.findElement(By.cssSelector("button[class='dropbtn']")).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook")));
        driver.findElement(By.partialLinkText("Face")).click();

        tearDown();

    }

}
