package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class DropdownDDMMYYYY {
    static String url = "https://selenium08.blogspot.com/2019/11/dropdown.html";

    public static void main(String[] args) throws InterruptedException {
        setUp(url);

        WebElement dayDD = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        Select selectDayDD = new Select(dayDD);
        selectDayDD.selectByVisibleText("25");
        Thread.sleep(2000);

        WebElement monthDD = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        Select selectMonthDD = new Select(monthDD);
        selectMonthDD.selectByIndex(3);
        Thread.sleep(2000);

        WebElement yearDD = driver.findElement(By.xpath("(//select[@class='year '])[1]"));
        Select selectYearDD = new Select(yearDD);
        selectYearDD.selectByValue("1985");

        List<WebElement> dayList  = selectDayDD.getOptions();
        for(WebElement day : dayList){
            day.click();
            String dayText = day.getText();
            if (dayText.equals("23")){
                System.out.println(dayText);
                break;
            }
        }

        tearDown();
    }


}
