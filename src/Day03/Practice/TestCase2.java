package Day03.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.exelenter.com");
        Thread.sleep(2000);

        //driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().refresh();

        String URL = driver.getCurrentUrl();
        String expectedURL = "Exelenter";
        if (URL.contains(expectedURL.toLowerCase())) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed.");
        }

        driver.quit();

}
}
