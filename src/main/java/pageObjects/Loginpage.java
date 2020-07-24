package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends AbstractPageObject {

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.EditText[1]")
    private WebElement userName;
    @FindBy(xpath = "//android.view.ViewGroup/android.widget.EditText[2]")
    private WebElement password;
    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")
    private WebElement login;


    public Loginpage(AppiumDriver driver) {
        super(driver);
    }

    public void inputNameANdPassord () throws Exception {
        try {
            userName.click();
            userName.sendKeys("710100021");
            password.click();
            password.sendKeys("12345");
        } catch (Exception ex) {
            throw new Exception("There is an error  " + ex.getMessage());
        }
    }

    public void clickLogin () throws Exception {
        try {
          login.click();
          Thread.sleep(1000);
          login.click();
        } catch (Exception ex) {
            throw new Exception("There is an error  " + ex.getMessage());
        }
    }
}
