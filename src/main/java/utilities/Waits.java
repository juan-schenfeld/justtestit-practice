package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {

    private WebDriver driver;

    public Waits(WebDriver driver){
        this.driver = driver;
    }

    public WebElement elementLocatedBy(By locator, int seconds){
        return new WebDriverWait(driver, Duration.ofSeconds(seconds)).
                until(ExpectedConditions.presenceOfElementLocated(locator));
    }





}
