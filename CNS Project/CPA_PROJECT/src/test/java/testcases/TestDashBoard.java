package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashBoardPage;
import utilities.DriverSetup;

public class TestDashBoard extends DriverSetup {

    DashBoardPage dashBoardPage =new DashBoardPage();
    @Test
    public void testDashBoardTitle() throws InterruptedException {
    getDriver().get(dashBoardPage.dashBoardUrl);
    Assert.assertEquals(getDriver().getTitle(), dashBoardPage.dashBoardTitle);
    Thread.sleep(1000);


    }
}
