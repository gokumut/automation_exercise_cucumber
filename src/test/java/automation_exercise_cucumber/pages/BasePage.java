package automation_exercise_cucumber.pages;

import com.automationexercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy (xpath = "//a[text()=' Home']")
    public WebElement homePageBtn;
    @FindBy(xpath = "//a[text()=' Signup / Login']")
    public WebElement loginBtn;
    @FindBy(xpath = "//a[@href='/contact_us']")
    public WebElement contactUsBtn;
    @FindBy(xpath = "//a[text()=' Products']")
    public WebElement productBtn;
    @FindBy(xpath = "//a[text()=' Test Cases']")
    public WebElement testCaseBtn;
    @FindBy(xpath = "//*[.='Subscription']")
    public WebElement subscriptionText;
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    public WebElement inputSubscriptionEmail;

    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement subscriptionArrowBtn;
}


