package steps;

import classes.VariablesForSteps;
import pageObjects.IndexPage;

public class LoginSteps extends VariablesForSteps {
    IndexPage indexPage;

    public void createPageInstance(){
        if (indexPage == null)
            indexPage = new IndexPage(getDriver());
    }

}