package Day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("REGISTER")).click();

        driver.findElement(By.name("firstName")).sendKeys("Fred");
        driver.findElement(By.name("lastName")).sendKeys("Flinstone");
        driver.findElement(By.name("phone")).sendKeys("303-333-3232");
        driver.findElement(By.name("userName")).sendKeys("fflinstone@bedrock.com");
        driver.findElement(By.name("email")).sendKeys("fflinstone");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);

        //driver.close();
    }

}
