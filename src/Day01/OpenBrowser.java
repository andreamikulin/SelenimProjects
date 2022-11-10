package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
        //driver.close();

        String title = driver.getTitle();
        System.out.println(title);

        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
