package Day02.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");
        String title = driver.getTitle();
        System.out.println("title = " + title);

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        if (title.equals(expectedTitle)) {
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed.");
        }

        driver.close();
    }
}
