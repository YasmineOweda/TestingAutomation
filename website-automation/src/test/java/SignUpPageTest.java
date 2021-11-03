import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(MockitoJUnitRunner.class)
public class SignUpPageTest {
    WebDriver driver;
    SignUpPage signUpPage;

    @Before
    public void setUp() {
        //Step 1- Driver Instantiation: Instantiate driver object as ChromeDriver
        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        //Step 2- Navigation: Open a website
//        driver.navigate().to("https://www.gittigidiyor.com");
    }

    @After
    public void tearDown() {
        //Step 1- Close Driver
//        driver.close();
        //Step 2- Quit Driver
//        driver.quit();
    }

    @Test
    public void test_login_WrongUsername() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://www.google.com/");
        signUpPage = new SignUpPage(driver);
        Assert.assertTrue(signUpPage.isInitialized());
        signUpPage.enterUserName("yasmine.oweda@gmai.com");
        signUpPage.enterPassword("testing123#");
        PageObject output = signUpPage.login();

        System.out.println(output);

//        Assert.assertEquals("Login failed", output);
    }
}
