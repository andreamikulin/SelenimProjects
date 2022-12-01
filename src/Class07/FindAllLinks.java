package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindAllLinks { //using TagName
    private static String url = "https://amazon.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks = " + allLinks.size());

//        for (WebElement link : allLinks)   {
//            String linkText = link.getText();
//            System.out.println(linkText);
//        }

        //remove empty space:
        int count = 0;
        for (WebElement link: allLinks){
            String linkText = link.getText();
            if (!linkText.isEmpty() && !linkText.isBlank()){
                System.out.println(linkText);
                count++;
            }
        }
        System.out.println(count);

        Thread.sleep(2000);
        driver.close();
    }

}
