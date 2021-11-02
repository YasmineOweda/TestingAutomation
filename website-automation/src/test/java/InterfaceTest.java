import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * make this class for testing
 */
@RunWith(MockitoJUnitRunner.class)
public class InterfaceTest {
    private WebDriver driver;
//    use this https://www.selenium.dev/documentation/guidelines/page_object_models/

    @Before
    public void setUp() {
        //Step 1- Driver Instantiation: Instantiate driver object as ChromeDriver
        driver = new ChromeDriver();
        //Step 2- Navigation: Open a website
        driver.navigate().to("https://www.gittigidiyor.com");
    }

    @After
    public void tearDown() {
        //Step 1- Close Driver
        driver.close();
        //Step 2- Quit Driver
        driver.quit();
    }

    @Test
    public void testLogin() {

    }
}
