package steps;

import classes.VariablesForSteps;
import cucumber.api.java.en.*;
import org.testng.Assert;
import pageObjects.Dashboard;
import pageObjects.IndexPage;
import pageObjects.Loginpage;

public class HappyPathScenarioSteps extends VariablesForSteps {
    IndexPage indexPage;
    Loginpage loginpage;
    Dashboard dashboard;

    public void createPageInstanceForIndexPage(){
        if (indexPage == null)
            indexPage = new IndexPage(getDriver());
    }
    public void createPageInstanceForLoginPage(){
        if (loginpage == null)
            loginpage = new Loginpage(getDriver());
    }

    public void createPageInstanceForDashboardPage(){
        if (dashboard == null)
            dashboard = new Dashboard(getDriver());
    }

    @Given("^Open the application and click on Login button$")
    public void open_the_application_and_click_on_Login_button() throws Throwable {
        createPageInstanceForIndexPage();
       indexPage.clickOnLogin();
    }

    @And("^Select the Country$")
    public void select_the_Country() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^Enter the Valid username and password$")
    public void enter_the_Valid_username_and_password() throws Throwable {
        createPageInstanceForLoginPage();
        loginpage.inputNameANdPassord();
        Thread.sleep(3000);
    }

    @And("^Click on login button$")
    public void click_on_login_button() throws Throwable {
        loginpage.clickLogin();
    }

    @Then("^Verify the Dashboard$")
    public void verify_the_Dashboard() throws Throwable {
        Thread.sleep(3000);
        createPageInstanceForDashboardPage();
        Assert.assertTrue(dashboard.hunamaIsDisplayed());
    }

    @And("^Now Logout from the APP$")
    public void now_Logout_from_the_APP() throws Throwable {
     dashboard.clickOnDrawer();
     Thread.sleep(3000);
     dashboard.clickOnMipangilo();
        Thread.sleep(3000);
     dashboard.clickOnOndoka();
        Thread.sleep(3000);
     dashboard.clickOnThibhitiska();

    }
}
