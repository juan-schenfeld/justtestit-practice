import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By mainElementLocator = By.xpath("//main/my-home");
    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean isLoaded(){
        waits.elementLocatedBy(mainElementLocator, 20);
        return true;
    }












}
