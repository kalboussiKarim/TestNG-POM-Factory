import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private By usernameFieldLocator = By.xpath("//input[@placeholder='Username']");
    private By passwordFieldLocator = By.xpath("//input[@placeholder='Password']");
    private By loginButtonLocator = By.xpath("//button[@type='submit']");
    private WebDriver driver;

    LoginPage(WebDriver driver){
        this.driver = driver;
    }

    WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void fillUsernameField(String username){
        find(usernameFieldLocator).sendKeys(username);
    }

    public void fillPasswordField(String password){
        find(passwordFieldLocator).sendKeys(password);
    }

    public void clickLoginButton(){
        find(loginButtonLocator).click();
    }



}
