package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {
    private static String url = "http://exelentersdet.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Exelent2022Sdet!");
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("input.button")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("a[class$='Trigger']")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#welcome-menu a")).click();
        Thread.sleep(2000);

        driver.close();


    }
}
