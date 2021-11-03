import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignUpPage extends PageObject {

    @FindBy(id = "L-UserNameField")
    private WebElement userName;

    @FindBy(id = "L-PasswordField")
    private WebElement pwd;

    @FindBy(id = "gg-login-enter")
    private WebElement loginButton;


    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(String userName) {
        this.userName.clear();
        this.userName.sendKeys(userName);
    }

    public void enterPassword(String pwd) {
        this.pwd.clear();
        this.pwd.sendKeys(pwd);
    }

    //TODO: To be completed
    public boolean isInitialized() {
        return true;
    }

    public PageObject login() {
        this.loginButton.click();
        return new PageObject(this.driver);
    }
}