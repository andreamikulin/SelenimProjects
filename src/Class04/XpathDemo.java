package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    private static String url = "http://exelentersdet.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Exelent2022Sdet!");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).click();
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//div[@id='welcome-menu']//a")).click();
//        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[starts-with(text(),'Log')]")).click();
        Thread.sleep(2000);

        driver.close();


    }
}
