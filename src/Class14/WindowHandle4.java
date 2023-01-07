package Class14;

import org.openqa.selenium.WindowType;

import java.util.Set;

import static utils.BaseClass.*;

public class WindowHandle4 {

    public static void main(String[] args) {
        setUp("https://google.com");

        String parentWindow = driver.getWindowHandle();

        System.out.println("Parent window: " + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://about.google/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://store.google.com/US");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://exelenter.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");

        String expectedTitle = "Exelenter";
        Set<String> allWindows = driver.getWindowHandles();
        // allWindows.forEach(System.out::println);
        switchToWindow(expectedTitle, allWindows);
        // switchToWindow("Store", allWindows);
        // switchToWindow(ConfigsReader.getProperties("expectedTitle"), allWindows);

        for (String window : allWindows) {
            if (!window.contains(parentWindow)) {
               System.out.println("This is a child window: " + driver.switchTo().window(window).getTitle());
            }
        }



        tearDown();

    }

    public static void switchToWindow(String windowTitle, Set<String> windows) {
        for (String windowOrTab : windows) {
            String title = driver.switchTo().window(windowOrTab).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Window is found: " + driver.getTitle() + " URL: " + driver.getCurrentUrl());
            }
        }
    }


}
