package automation_exercise_cucumber.step_definitions;

import automation_exercise_cucumber.pages.HomePage;
import automation_exercise_cucumber.pages.LoginPage;
import automation_exercise_cucumber.pages.SignLoginPage;
import automation_exercise_cucumber.utilities.ConfigurationReader;
import automation_exercise_cucumber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TestCase2_StepDefs {
    HomePage homePage=new HomePage();
    SignLoginPage signLoginPage=new SignLoginPage();
    LoginPage loginPage=new LoginPage();
    @Given("The user is on the home page")
    public void the_user_is_on_the_home_page() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }
    @When("The user navigates to sign-log in page")
    public void theUserNavigatesToSignLogInPage() {
        homePage.loginBtn.click();
    }
    @Then("The user should be able to see {string} text")
    public void the_user_should_be_able_to_see_text(String expectedMessage) {
       String actualMessage=signLoginPage.loginText.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @When("The user enters correct {string} and {string}")
    public void the_user_enters_correct_and(String email, String password) {
        signLoginPage.logIn(email,password);
    }
    @Then("The welcome message contains {string}")
    public void the_welcome_message_contains(String username) {
        loginPage.verifyLogin(username);
    }

}
