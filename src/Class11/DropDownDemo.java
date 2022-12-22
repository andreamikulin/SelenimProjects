package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class DropDownDemo {
    static String url = "https://selenium08.blogspot.com/2019/11/dropdown.html";

    public static void main(String[] args) {
        setUp(url);
//        List<WebElement> countries = driver.findElements(By.cssSelector("select[name='country'] option"));
//        for(WebElement country : countries) {
//            System.out.println(country.getText());
//        }

        WebElement countryDD = driver.findElement(By.cssSelector("select[name='country']"));
        Select select = new Select(countryDD);
        select.getOptions();

        List<WebElement> countriesList = select.getOptions();
        System.out.println("Total number of countries: " + countriesList.size());



     //   tearDown();
    }
}
