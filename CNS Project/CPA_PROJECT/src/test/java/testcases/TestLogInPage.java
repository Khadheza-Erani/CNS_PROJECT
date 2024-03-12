package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LogInPage;
import utilities.DriverSetup;

public class TestLogInPage extends DriverSetup {
    LogInPage logInPage = new LogInPage();

    @Test
    public void testLogInPage() throws InterruptedException {
        getDriver().get(logInPage.LogInPageUrl);
        Assert.assertEquals(getDriver().getTitle(), logInPage.LogInPageTitle);

    }
}