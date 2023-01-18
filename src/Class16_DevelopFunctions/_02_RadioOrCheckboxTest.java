package Class16_DevelopFunctions;

import Day04.WebElementsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utils.BaseClass.*;

public class _02_RadioOrCheckboxTest {

    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");

        List<WebElement> colorsList = driver.findElements(By.name("color"));
        List<WebElement> browserList = driver.findElements(By.name("browser"));

        String expectedValue = "green";

        clickRadioOrCheckbox(colorsList, expectedValue);
        clickRadioOrCheckbox(browserList, "Mozilla");
//        for (WebElement color : colorsList) {
//            String colorAttribute = color.getAttribute("value");
//            if (colorAttribute.equalsIgnoreCase("green")) {
//                color.click();
//                break;
//            }
//        }

        tearDown();
    }

    public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String expectedValue) {
        for (WebElement element : radioOrCheckbox) {
            String actualValue = element.getAttribute("value");
            if (actualValue.equals(expectedValue)) {
                element.click();
                break;
            }
        }
    }

}
