import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage extends BasePage{

    private By firstNameField = By.id("firstName");

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public boolean isLoaded(){
        waits.elementLocatedBy(firstNameField, 15);
        return true;
    }





}
