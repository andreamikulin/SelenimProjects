package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;

    public static void setUp() {
        ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getProperties("browser").toLowerCase())   {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                WebDriver driver = new ChromeDriver();
            }
            case "firefox" -> {
//                System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH); //need to create
            }
            default -> throw new RuntimeException("Browser is not supported");
        }
    }
    //driver.get(ConfigsReader.getProperties("url"); not working for some reason
}
