package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import static utils.BaseClass.driver;

public class CommonMethods {

    /**
     * Method will switch focus to next window/tab based on the window title/name
     * @param windowTitle String
     */
    public static void switchToWindow(String windowTitle) {
        Set<String> windows = driver.getWindowHandles();
        for (String windowOrTab : windows) {
            String title = driver.switchTo().window(windowOrTab).getTitle();
            if (title.contains(windowTitle)) {
                System.out.println("Window is found! Page Title: " + driver.getTitle() +  " URL: " + driver.getCurrentUrl());
                break;
            }
        }
    }


    public static void sendText(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static WebDriverWait waitForElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
        return wait;
    }

    public static void waitForClickability(WebElement element) {
        waitForElement().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void clickButWaitForClickability(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    public static void waitForVisibility(WebElement element) {
        waitForElement().until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForVisibility(By by) {
        waitForElement().until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void clickButWaitForVisibility(WebElement element) {
        waitForVisibility(element);
        element.click();
    }

    public static void clickRadioOrCheckbox(List<WebElement> radioOrCheckbox, String expectedValue) {
        for (WebElement element : radioOrCheckbox) {
            String actualValue = element.getAttribute("value");
            if (element.isEnabled() && !element.isSelected() && actualValue.equals(expectedValue)) {
                element.click();
                break;
            }
        }
    }

    public static void clickRadioOrCheckbox(WebElement element) {
        if (element.isEnabled() && !element.isSelected()) {
            element.click();
        }
    }

    public static void selectDdValue(List<WebElement> dropdownList, String expectedValue) {
        for (WebElement element : dropdownList) {
            String actualValue = element.getText();
            if (actualValue.equals(expectedValue)) {
                element.click();
                break;
            }
        }
    }

    public static void selectDdValue(WebElement element, String expectedValue) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(expectedValue)) {
                select.selectByVisibleText(expectedValue);
                break;
            }
        }
    }

    public static void selectDdValue(WebElement element, int index) {
        Select select = new Select(element);
        List<WebElement> options = select.getOptions();
        if (index < options.size()) {
            select.selectByIndex(index);
        } else {
            try {
                throw new IndexOutOfBoundsException(index);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                System.out.println("Incorrect Index used. Please use a number between 1 and " + options.size());
            }
        }
    }


    public static void acceptAlert() {
        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
            System.out.println("Alert is not present.");
        }
    }

    public static void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public static void sendAlertText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public static String getAlertText() {
        String alertText = null;
        try {
            alertText = driver.switchTo().alert().getText();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
        return alertText;
    }


    /**
     * Method will wait for an element, but this is a static wait, please use with caution.
     *
     * @param second int
     */
    public static void waitInSeconds(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
