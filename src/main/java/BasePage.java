import org.openqa.selenium.WebDriver;
import utilities.Navigation;
import utilities.Waits;

public class BasePage {

    protected WebDriver driver;
    Navigation nav;
    Waits waits;
    NavBar navBar;
    public BasePage(WebDriver driver){
        this.driver = driver;
        this.nav = new Navigation(driver);
        this.waits = new Waits(driver);
        this.navBar = new NavBar(driver);
    }

}
