import org.testng.annotations.Test;


import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTest{


    @Test
    public void goToProfileAndUseNavButtons(){
        homePage.navBar.loginWithDefault();
        var profilePage = homePage.navBar.goToProfile();

        profilePage.isLoaded();
        homePage.nav.goBack();

        homePage.isLoaded();
        homePage.nav.forward();

        profilePage.isLoaded();

        assertTrue(true);
    }




}
