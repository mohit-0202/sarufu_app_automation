package classes;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class VariablesForSteps {
    static AppiumDriver driver;
    static Utils utils = new Utils();

    public AppiumDriver getDriver() {
        return driver;
    }

    public void setDriver(AppiumDriver driver) {
        this.driver = driver;
    }

    public Utils getUtils() {
        return utils;
    }

    public void setUtils(Utils utils) {
        this.utils = utils;
    }
}