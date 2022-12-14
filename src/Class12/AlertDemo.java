package Class12;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BaseClass.*;

public class AlertDemo {
    static String url = "https://selenium08.blogspot.com/2019/11/dropdown.html";

    public static void main(String[] args) throws InterruptedException {
        setUp(url);  // switch to URL: https://selenium08.blogspot.com/2019/07/alert-test.html

        // How to handle a simple alert
        WebElement simpleAlert = driver.findElement(By.id("simple"));  // for all alert types we use .switchTo().alert()
        simpleAlert.click();
        Thread.sleep(2000);

        // Question: What happens when we try to click on another element without handling an ALERT first?
//        driver.findElement(By.xpath("//div[text()='Search']")).click();
        // Answer: You will get "UnhandledAlertException" if you don't handle alert before doing anything else.

        Alert alert = driver.switchTo().alert();             // We switch the focus of the web browser to the alert window
        String alertText = alert.getText();                  // I am storing the text from the Alert in a String var.
        System.out.println("alertText: " + alertText);
        alert.accept();                                      // accept = 'OK' button

        Thread.sleep(2000);

        // Handling Confirmation Alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        Alert confirmationAlert = driver.switchTo().alert();
        String confirmationAlertText = confirmationAlert.getText();
        System.out.println("confirmationAlertText = " + confirmationAlertText);
        Thread.sleep(2000);
        confirmationAlert.dismiss();                        // dismiss = 'Cancel' button
        Thread.sleep(2000);

        // Handling Prompt Alert
        driver.findElement(By.id("prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        String promptAlertText = promptAlert.getText();
        System.out.println("promptAlertText = " + promptAlertText);
        promptAlert.sendKeys("Andrea");
        Thread.sleep(2000);
        promptAlert.accept();


        // verify entered text
        String enteredText = driver.findElement(By.xpath("//div[contains(text(),'Hello Andrea')]")).getText();
        System.out.println("enteredText = " + enteredText);

        String expectedText = "Andrea";
        if (enteredText.contains(expectedText))
            System.out.println("Text is added successfully. Test passed.");
        else
            System.out.println("Text is NOT added. Test failed.");
        tearDown();
    }
}
