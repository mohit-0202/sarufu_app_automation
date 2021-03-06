package steps;

import classes.DeviceHandler;
import classes.VariablesForSteps;
import com.google.gson.JsonObject;
import cucumber.api.java.en.Given;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;

public class DeviceSteps extends VariablesForSteps {

    @Given("^The device is setted and the application called \"([^\"]*)\" is opened$")
    public void openDevice(String applicationName) throws Exception {
        try {
            JsonObject deviceInformation = getUtils().readJsonFromResources("device.json");
            DeviceHandler deviceHandler = new DeviceHandler(deviceInformation.get("deviceName").getAsString(),
                    deviceInformation.get("platformVersion").getAsString(), deviceInformation.get("platformName").getAsString());
            JsonObject applicationInformation = getUtils().getApplicationFromJson(applicationName);
            deviceHandler.setApp(getUtils().getApkFromResources(applicationInformation.get("applicationValue").getAsString()));

            System.out.println("Setting environment...");
            System.out.println("Giving time to start the application...");
            AppiumDriver driver = deviceHandler.CreateDevice();
            setDriver(driver);
            Thread.sleep(10000);

        } catch (Exception ex) {
            throw new Exception("Error creating the device configuration. " + ex.getMessage());
        }
    }

}
