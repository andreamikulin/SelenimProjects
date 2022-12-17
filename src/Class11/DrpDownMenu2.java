package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class DrpDownMenu2 {

    public static void main(String[] args) throws InterruptedException {
        setUp();

        WebElement countryDD = driver.findElement(By.cssSelector("select[name='country']"));
        Select select = new Select(countryDD);

        select.selectByIndex(1);
        Thread.sleep(2000);

        select.selectByValue("JP");
        Thread.sleep(2000);

        select.selectByVisibleText("Italy");
        Thread.sleep(2000);

        List<WebElement> countries = select.getOptions();
        for (int i = 0; i < countries.size(); i++) {
            if (countries.get(i).getText().equals("Croatia")) {
                countries.get(i).click();
                break;
            }
        }

        List<WebElement> countryLisat = driver.findElements(By.xpath("//*[@name='country']/option"));
        for (WebElement country : countries) {
            if (country.getText().equals("Cuba")) {
                country.click();
                break;
            }
        }

        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);

        WebElement months = driver.findElement(By.cssSelector("select[name='Month']"));
        Select selectMonths = new Select(months);
        System.out.println("MonthsDD is Multiple: " + selectMonths.isMultiple());


        tearDown();

    }
}
