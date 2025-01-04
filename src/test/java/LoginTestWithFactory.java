import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTestWithFactory {

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
        LoginPageWithFactory loginPageWithFactory = new LoginPageWithFactory(driver);
        String username = "Admin";
        String password ="admin123";
        loginPageWithFactory.fillUsernameField(username);
        loginPageWithFactory.fillPasswordField(password);
        loginPageWithFactory.clickLoginButton();
        boolean isDashboardItemDisplayed = loginPageWithFactory.isDashboardItemDisplayed();
        Assert.assertTrue(isDashboardItemDisplayed);

    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
