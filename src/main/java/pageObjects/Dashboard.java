package pageObjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends AbstractPageObject {

    public Dashboard(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[1]")
    private WebElement huduma;

    @FindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    private WebElement drawer;

    @FindBy(xpath = "//android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")
    private WebElement mipangilo;

    @FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[12]/android.widget.TextView")
    private WebElement ondoka;

    @FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView")
    private WebElement thibhitiska;

    public boolean hunamaIsDisplayed() throws Exception {
      return huduma.isDisplayed();
    }
    public void clickOnDrawer() throws Exception {
        try {
            drawer.click();
            System.out.println("login was clicked");
        } catch (Exception ex) {
            throw new Exception("There is an . Error : " + ex.getMessage());
        }
    }

    public void clickOnMipangilo() throws Exception {
        try {
        mipangilo.click();
        System.out.println("login was clicked");
    } catch (Exception ex) {
        throw new Exception("There is an . Error : " + ex.getMessage());
    }
 }

    public void clickOnOndoka() throws Exception {
        try {
            ondoka.click();
            System.out.println("login was clicked");
        } catch (Exception ex) {
            throw new Exception("There is an . Error : " + ex.getMessage());
        }
    }

    public void clickOnThibhitiska() throws Exception {
        try {
            thibhitiska.click();
            System.out.println("login was clicked");
        } catch (Exception ex) {
            throw new Exception("There is an . Error : " + ex.getMessage());
        }
    }
}
