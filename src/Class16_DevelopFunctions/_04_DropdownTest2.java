package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.driver;
import static utils.BaseClass.*;

public class _04_DropdownTest2 {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        String expectedText = "April";

        List<WebElement> listOfMonths = driver.findElements(By.cssSelector("select[name='Month'] option"));
        selectDdValue(listOfMonths, "July");

        WebElement monthsDD = driver.findElement(By.cssSelector("select[name='Month']"));
        selectDdValue(monthsDD, expectedText);

        tearDown();
    }

    public static void selectDdValue(List<WebElement> dropdownList, String expectedValue) {
        for (WebElement element: dropdownList) {
            String actualValue = element.getText();
            if (actualValue.equals(expectedValue)) {
                element.click();
                break;
            }
        }
    }

    public static void selectDropDown(WebElement element, String expected) {
        Select select = new Select(element);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(expected)){
                select.getOptions().get(i).click();
                break;
            }
        }
    }

    public static void selectDdValue (WebElement element, String expectedValue) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(expectedValue)) {
                select.selectByVisibleText(expectedValue);
                break;
            }
        }
    }
}
