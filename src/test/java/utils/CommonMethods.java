package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import steps.PageInitializer;


public class CommonMethods extends PageInitializer {

    public static WebDriver driver;

    public void openBrowserAndLauchApplication() {

        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            // for this particular example I need only chrome, but added two more options to showcase Factory Pattern

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "headless":
                ChromeOptions options = new ChromeOptions();
                options.setHeadless(true);
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
            default:
                throw new RuntimeException("Invalid browser name");
        }
        driver.get(ConfigReader.getPropertyValue("url"));
       initializePageObjects();
    }

}
