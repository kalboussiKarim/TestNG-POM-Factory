import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithFactory {

    private WebDriver driver;

    LoginPageWithFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement usernameFieldLocator;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passwordFieldLocator;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButtonLocator;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='Dashboard']")
    WebElement dashboardItem;

    WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void fillUsernameField(String username){
        usernameFieldLocator.sendKeys(username);
    }

    public void fillPasswordField(String password){
        passwordFieldLocator.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButtonLocator.click();
    }

    boolean isDashboardItemDisplayed(){
        return dashboardItem.isDisplayed();
    }
}
