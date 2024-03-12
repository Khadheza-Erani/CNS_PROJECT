package testcases;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.JobSelectionPage;
import utilities.DriverSetup;

public class TestJobSelection extends DriverSetup {
    JobSelectionPage jobSelectionPage =new JobSelectionPage();

    @Test
    public void testJobSelectionProcess() throws InterruptedException {
        getDriver().get(jobSelectionPage.dashboardJobSelectionUrl);
        Thread.sleep(5000);
        //14/2023
        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get(jobSelectionPage.fourteenEye);
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.threeDEngineerJob).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().to("http://123.200.20.20:5302/");
        Thread.sleep(5000);

        //sixteenTwoThousandTwentyThree
        jobSelectionPage.getElement(jobSelectionPage.sixteenTwoThousandTwentyThree).click();
        Thread.sleep(5000);
        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get(jobSelectionPage.sixteenTwoThousandTwentyThreeUrl);
        jobSelectionPage.getElement(jobSelectionPage.sixteenThreeDEngineerJob).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.sixteenAssistantSubInspector).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().to("http://123.200.20.20:5302/");
        Thread.sleep(5000);
        //TwentyByTwentyThree
        jobSelectionPage.getElement(jobSelectionPage.clickTwentyByTwentyThree).click();
        Thread.sleep(5000);
        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get(jobSelectionPage.twentyByTwentyThreeUrl);
        jobSelectionPage.getElement(jobSelectionPage.clickTwentyByTwentyThreeInspectorCraft).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickTwentyByTwentyThreeDEngineer).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickTwentyByTwentyThreeLandSurveyor).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickTwentyByTwentyThreeSecurityGuard).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        getDriver().navigate().back();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickTwentyByTwentyThreeLandSurveyKhalsi).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().to("http://123.200.20.20:5302/");
        Thread.sleep(2000);
        //TwentyByTwentyThreeOne
        jobSelectionPage.getElement(jobSelectionPage.clickTwentyByTwentyThreeOne).click();
        Thread.sleep(5000);
        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get(jobSelectionPage.twentyByTwentyThreeOneUrl);
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickTwentyByTwentyThreeEngineerThreeD).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().to("http://123.200.20.20:5302/");
        Thread.sleep(2000);
        //twentySixTwoThousandTwentyFour
        jobSelectionPage.getElement(jobSelectionPage.twentySixTwoThousandTwentyFour).click();
        Thread.sleep(5000);
        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get(jobSelectionPage.twentySixTwoThousandTwentyFourUrl);
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.twentySixTwoThousandTwentyFourThreeDEngineer).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().to("http://123.200.20.20:5302/");
        Thread.sleep(2000);
        //27/2024
        jobSelectionPage.getElement(jobSelectionPage.twentySevenTwoThousandTwentyFour).click();
        Thread.sleep(5000);
        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get(jobSelectionPage.twentySevenTwoThousandTwentyFourUrl);
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.twentySevenTwoThousandTwentyFourAssistantInspectorCraft).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().to("http://123.200.20.20:5302/");
        Thread.sleep(2000);
        //40/2024
        jobSelectionPage.getElement(jobSelectionPage.fortyTwoThousandTwentyFour).click();
        Thread.sleep(5000);
        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get(jobSelectionPage.fortyTwoThousandTwentyFourUrl);
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.fortyTwoThousandTwentyFourShiftInspector).click();
        Thread.sleep(1000);
        jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        Thread.sleep(5000);
        jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        Thread.sleep(5000);
        getDriver().navigate().to("http://123.200.20.20:5302/");
        Thread.sleep(5000);
        //Prattoy-Circular
        //jobSelectionPage.getElement(jobSelectionPage.prattoyCircular).click();
        //Thread.sleep(5000);
        //getDriver().switchTo().newWindow(WindowType.TAB);
        //getDriver().get(jobSelectionPage.prattoyCircularUrl);
        //Thread.sleep(5000);
        //jobSelectionPage.getElement(jobSelectionPage.prattoyCircularThreeDEngineer).click();
       // Thread.sleep(5000);
        //jobSelectionPage.getElement(jobSelectionPage.clickApplyNow).click();
        //Thread.sleep(5000);
        //jobSelectionPage.getElement(jobSelectionPage.continueWithoutLogInButton).click();
        //Thread.sleep(5000);
        //getDriver().navigate().to("http://123.200.20.20:5302/");
       // Thread.sleep(5000);




    }
}
