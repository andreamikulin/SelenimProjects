package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioAndButtons {

    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> colors = driver.findElements(By.cssSelector("input[name='color']"));
        for (WebElement element : colors)   {
            String colorName = element.getAttribute("value");
            while (colorName.equalsIgnoreCase("yellow") || colorName.equalsIgnoreCase("orange")){
                element.click();
                System.out.println(element.getAttribute("value"));
                break;
            }
        }
// You can use a for loop like below, but the above enhanced for loop is preferred
//        System.out.println("-----For Loop-----");
//        for (int i = 0; i < colors.size(); i++) {
//            while (colors.get(i).getAttribute("value").equalsIgnoreCase("red") ||
//                    colors.get(i).getAttribute("value").equalsIgnoreCase("blue")) {
//                colors.get(i).click();
//                System.out.println(colors.get(i).getAttribute("value"));
//                break;
//            }
//
//        }

        Thread.sleep(2000);
        driver.close();

    }
}
