package Class14;

import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

import static utils.BaseClass.*;

public class WindowHandle2 {
    public static void main(String[] args) {
        setUp("https:google.com");

        System.out.println("Parent window: " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://about.google/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://store.google.com/US");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://exelenter.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("Tabs open = " + allWindows.size());

        Iterator<String> iterator = allWindows.iterator();

        while(iterator.hasNext()) {
            String nextWindow = iterator.next();
            System.out.println(nextWindow);
            driver.switchTo().window(nextWindow);
            System.out.println(driver.getTitle());
        }


        tearDown();
    }
}
