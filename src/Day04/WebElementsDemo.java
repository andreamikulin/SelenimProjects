package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://fb.com");
        Thread.sleep(2000);

        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("bbdd");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);

        //driver.findElement(By.className("_97w4")).click();
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();

        Thread.sleep(2000);
        //driver.close();
    }

}
