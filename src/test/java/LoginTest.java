import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    WebDriver driver;

    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    }

    @Test
    void testLogin(){
        LoginPage loginPage = new LoginPage(driver);
        String username = "Admin";
        String password ="admin123";
        loginPage.fillUsernameField(username);
        loginPage.fillPasswordField(password);
        loginPage.clickLoginButton();
        boolean isDashboardItemDisplayed = loginPage.isDashboardItemDisplayed();
        Assert.assertTrue(isDashboardItemDisplayed);

    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
