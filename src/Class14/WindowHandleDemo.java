package Class14;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class WindowHandleDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/windows");
        // tabs and windows in Selenium:
        // 1. getWindowHandle()  --> handles main window only (parent)
        // 2. getWindowHandles() --> handles ALL windows (or tabls)

        String mainWindowTitle = driver.getTitle();
        System.out.println("mainWindowTitle = " + mainWindowTitle);

        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        driver.findElement(By.linkText("Click Here")).click();
        System.out.println(driver.getTitle());

        //Thread.sleep(2000);
        Set<String> allWindows = driver.getWindowHandles();
        int allOpenWindows = allWindows.size();
        System.out.println("allOpenWindows = " + allOpenWindows);

        allWindows.forEach(System.out::println);

        Iterator<String> iterator = allWindows.iterator();
        String mainWindow = iterator.next();
        String childWindow = iterator.next();
        System.out.println("mainWindow = " + mainWindow);
        System.out.println("childWindow = " + childWindow);

        driver.switchTo().window(childWindow);
        System.out.println(driver.getTitle());

        Thread.sleep(1000);
        driver.close();

//        Thread.sleep(1000);  --> gives exception because child window is already closed
//        driver.close();

        tearDown();
    }

}
