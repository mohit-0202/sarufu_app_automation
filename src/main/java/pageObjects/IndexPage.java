package pageObjects;

import classes.GenerateData;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage extends AbstractPageObject {


    @FindBy(xpath = "//android.view.ViewGroup[3]/android.widget.TextView")
    private WebElement loginOnindex;
    public IndexPage(AppiumDriver driver) {
        super(driver);
    }

    public void clickOnLogin() throws Exception {
        try {
            loginOnindex.click();
            System.out.println("login was clicked");
        } catch (Exception ex) {
            throw new Exception("There is an error clicking on cancel button. Error : " + ex.getMessage());
        }
    }



}