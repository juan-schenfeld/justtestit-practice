package utilities;

import org.openqa.selenium.WebDriver;

public class Navigation {

    private WebDriver driver;

    public Navigation(WebDriver driver){
        this.driver = driver;
    }
    public Navigation goBack(){
        driver.navigate().back();
        return this;
    }

    public Navigation forward(){
        driver.navigate().forward();
        return this;
    }






}
