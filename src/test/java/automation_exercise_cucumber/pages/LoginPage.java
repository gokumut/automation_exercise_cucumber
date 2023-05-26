package automation_exercise_cucumber.pages;

import automation_exercise_cucumber.utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
    @FindBy(xpath = "//*[.='marquis']/..")
    public WebElement welcomeText;

    @FindBy(css = "[href=\"/delete_account\"]")
    public WebElement deleteBtn;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement logoutBtn;

    public void verifyLogin(String username){
        Assert.assertTrue(welcomeText.getText().contains(username));
    }
    public void deleteAccount(){
        deleteBtn.click();
    }
}
