package Class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static utils.BaseClass.*;

public class DropdownDDMMYYYY_Refactor {

    public static void main(String[] args)  {
        setUp();
        findDay("25");
        findMonth(4);
        findYear("1985");
        selectDay("27");
        tearDown();
    }


    /**
     *
     * @param day String
     * @return day
     */
    static String findDay(String day) {
        WebElement dayDD = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        Select selectDayDD = new Select(dayDD);
        selectDayDD.selectByVisibleText(day);
        System.out.println("day = " + day);
        return day;
    }

    /**
     *
     * @param month int (index of month)
     * @return month
     */
    static int findMonth(int month) {
        WebElement monthDD = driver.findElement(By.xpath("(//select[@class='month '])[1]"));
        Select selectMonthDD = new Select(monthDD);
        selectMonthDD.selectByIndex(month);
        System.out.println("month = " + month);
        return month;
    }

    /**
     *
     * @param year String
     * @return year
     */
    static String findYear(String year) {
        WebElement yearDD = driver.findElement(By.xpath("(//select[@class='year '])[1]"));
        Select selectYearDD = new Select(yearDD);
        selectYearDD.selectByValue(year);
        System.out.println("year = " + year);
        return year;
    }

    /**
     *
     * @param pickDay String
     * @return pickDay
     */
    static String selectDay(String pickDay) {
        WebElement dayDD = driver.findElement(By.xpath("(//select[@class='day '])[1]"));
        Select selectDayDD = new Select(dayDD);
        List<WebElement> dayList  = selectDayDD.getOptions();
        for(WebElement day : dayList){
            day.click();
            String dayText = day.getText();
            if (dayText.equals(pickDay)){
                System.out.println(dayText);
                break;
            }
        }
        return pickDay;
    }

}
