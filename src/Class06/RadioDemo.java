package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //driver.findElement(By.xpath("//input[@name='browser'][2]")).click();

        boolean displayed = driver.findElement(By.xpath("//input[@name='browser'][2]")).isDisplayed();
        boolean enabled = driver.findElement(By.xpath("//input[@name='browser'][2]")).isEnabled();
        boolean selected = driver.findElement(By.xpath("//input[@name='browser'][2]")).isSelected();

        System.out.println("Displayed = " + displayed);
        System.out.println("Enabled = " + enabled);
        System.out.println("Selected = " + selected);



        //Thread.sleep(2000);
        //driver.close();
    }
}
