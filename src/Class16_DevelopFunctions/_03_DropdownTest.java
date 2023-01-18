package Class16_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class _03_DropdownTest {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        String expectedOutput = "January";

        List<WebElement> listOfMonths = driver.findElements(By.cssSelector("select[name='Month'] option"));



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


}
