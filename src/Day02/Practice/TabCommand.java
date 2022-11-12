package Day02.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabCommand {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.properstar.com/");
        Thread.sleep(3000);
        driver.navigate().refresh();

        Thread.sleep(3000);

       // driver.close();
        driver.quit();

    }
}
