import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    private WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://buggy.justtestit.org/");
        homePage = new HomePage(driver);

    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }







}
