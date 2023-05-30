package automation_exercise_cucumber.step_definitions;

import automation_exercise_cucumber.pages.SignLoginPage;
import automation_exercise_cucumber.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestCase3_StepDefs {

    SignLoginPage signLoginPage = new SignLoginPage();
    @When("The user enters incorrect {string} and {string}")
    public void theUserEntersIncorrectAnd(String email, String password) {
        signLoginPage.logIn(email,password);
    }


    @Then("The user should be able to see incorrect credentials warning message")
    public void theUserShouldBeAbleToSeeIncorrectCredentialsWarningMessage() {
        BrowserUtils.verifyElementDisplayed(signLoginPage.loginErrorText);
    }
}
