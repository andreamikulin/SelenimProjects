package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//Task:
//        TC 4.3: Print visible links from the Exelenter Homepage
//        1. Open the Chrome browser
//        2. Go to Exelenter Website
//        3. Iterate through the links until you find "Enroll Now"
//        4. Once expected keyword is found, print it and exit
//        5. Close the browser
public class FindSpecificLink {

    private static String url = "https://exelenter.com";
    private static String expectedText = "Enroll Now";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks = " + allLinks.size());

        int totalLinks = allLinks.size();
        System.out.println("totalLinks = " + totalLinks);

        for (WebElement link : allLinks) {
            String linkText = link.getText();
            if (!linkText.isEmpty()){
                System.out.println("linkText = " + linkText);
            }
            if (linkText.contentEquals(expectedText )) {
                System.out.println("Expected text is found: " + linkText);
                break;
            }
        }

        Thread.sleep(2000);
        driver.close();
    }
}
