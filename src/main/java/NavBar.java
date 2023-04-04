import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Waits;

public class NavBar{

    private WebDriver driver;
    private By emailField = By.name("login");
    private By passwordField = By.name("password");
    private By loginBtn = By.xpath("//button[text()='Login']");
    private By profileLink = By.linkText("Profile");
    private Waits waits;
    public NavBar(WebDriver driver){
        this.driver = driver;
        this.waits = new Waits(driver);
    }

    private void fillEmail(String email){
        waits.elementLocatedBy(emailField,15).sendKeys(email);
    }
    private void fillPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    private void clickLogin(){
        driver.findElement(loginBtn).click();
    }
    void login(String email, String password){
        fillEmail(email);
        fillPassword(password);
        clickLogin();
    }

    void loginWithDefault(){
        login("example@email.com","ACompletelySecurePassword!123");
    }

    public ProfilePage goToProfile(){
        waits.elementLocatedBy(profileLink, 15).click();
        return new ProfilePage(driver);
    }

}
