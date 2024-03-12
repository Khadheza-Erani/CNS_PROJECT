package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LogInPage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {
    HomePage homePage = new HomePage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    LogInPage logInPage = new LogInPage();

    @Test
    public void testHomePageTitle(){
       getDriver().get(homePage.homePageUrl);
        Assert.assertEquals(getDriver().getTitle(),homePage.homePageTitle);
    }

    @Test
    public void testHomePageUrl(){
        getDriver().get(homePage.homePageUrl);
        Assert.assertEquals(getDriver().getCurrentUrl(),homePage.homePageUrl);
    }

    @Test
    public void testHomePageDashBoardButton() throws InterruptedException {
        getDriver().get(dashBoardPage.dashBoardUrl);
        dashBoardPage.getElement(dashBoardPage.dashBoardPageButton).click();
        Thread.sleep(5000);
        Assert.assertEquals(getDriver().getCurrentUrl(),dashBoardPage.dashBoardUrl);
    }

    @Test
    public void testHomePageLogInButton() throws InterruptedException {
        getDriver().get(logInPage.LogInPageUrl);
        //dashBoardPage.getElement(logInPage.loginButton).click();
        logInPage.clickOnElement(logInPage.loginButton);
        Thread.sleep(5000);
        Assert.assertEquals(getDriver().getCurrentUrl(),logInPage.LogInPageUrl);
        Assert.assertTrue(logInPage.isElementVisible(logInPage.loginButton));
    }

}
