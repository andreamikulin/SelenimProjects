package Class14;

import org.openqa.selenium.By;

import java.util.Set;

import static utils.BaseClass.*;

public class Task {

    /**
     *  Task: Go to this URL: https://the-internet.herokuapp.com/windows
     *     1. Identify and print parent window ID and Title
     *     2. Click on the link where it says 'Click Here' three times
     *     3. Switch to new tabs and print their title to the console as well.
     *          Bonus: Load facebook website in all children pages.
     */

    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/windows");

        for (int i = 0; i < 3; i++) {
            driver.findElement(By.linkText("Click Here")).click();
            Thread.sleep(500);
        }

        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent window ID: " + parentWindow);
        System.out.println("Parent window title: " + driver.getTitle());

        Set<String> allWindows = driver.getWindowHandles();

        for (String tab : allWindows) {
            if (!tab.contains(parentWindow)){
                //System.out.println("Child page title: " + driver.switchTo().window(tab).getTitle());
                driver.switchTo().window(tab);
                driver.get("https://fb.com");
                System.out.println("Child page title: " + driver.getTitle());
                Thread.sleep(500);
            }
        }

        tearDown();
    }
}
