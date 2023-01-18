package Class15;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utils.BaseClass.*;

/**
 *  Task: Get the text from a link which will load a paragraph when you click on it.
 *    1. Go to this URL: http://uitestpractice.com/Students/Contact
 *    2. Click on the link where it says 'This is a Ajax link'
 *    3. First use without wait, handle the exception, should say "Element is not found, Please wait longer for element to become visible".
 *    4. Wait for its content to load and retrieve the text from it and print it to the console.
 *
 */
public class ImplicitWait_Task {
    public static void main(String[] args) {
        setUp("http://uitestpractice.com/Students/Contact");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Global wait - applies to all elements in class
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));  // Explicit wait - not global

        try {
            driver.findElement(By.linkText("This is a Ajax link")).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ContactUs")));
            System.out.println(driver.findElement(By.className("ContactUs")).getText());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Element is not found. Wait longer.");
        }


        tearDown();
    }
}
