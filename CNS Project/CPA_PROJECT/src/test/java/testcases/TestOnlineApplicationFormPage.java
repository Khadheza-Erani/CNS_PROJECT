package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import pages.OnlineApplicationFormPage;
import utilities.DriverSetup;

public class TestOnlineApplicationFormPage extends DriverSetup {
    OnlineApplicationFormPage onlineApplicationFormPage = new OnlineApplicationFormPage();


    @Test
    public void testCandidateOnlineApplicationFormPageProcess() throws InterruptedException {
        getDriver().get(onlineApplicationFormPage.dashboardJobCircularUrl);
        Thread.sleep(2000);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.selectTwentyByTwentyThree).click();
        Thread.sleep(2000);
        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get(onlineApplicationFormPage.windowSwitch);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.eyeButton).click();
        Thread.sleep(2000);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.clickApplyNowButton).click();
        Thread.sleep(2000);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.continueWithoutLogIn).click();
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.quota,"GENERAL");
        onlineApplicationFormPage.clickOnElement(onlineApplicationFormPage.currentWorkingCheckBoxNo);
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.nationalIdField,"8231771135");
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.clickBrowserButton).sendKeys("C:\\Users\\Tech Land\\Downloads\\NID.jpg");
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.dateOfBirth).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.dateOfMarch).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.dateOfTwentyToTwentyNine).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.dateOfTenToNinety).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.dateOfTwentyToNine).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.dateOfNinetyToNinetyFive).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.clickNinetyFive).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.clickAugust).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.clickTwentyThree).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.clickVerifyNid).click();
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.fatherName,"Siddique Haq");
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.motherName,"Amena Begum");

        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.mobileNumber,"01765782683");
        Thread.sleep(2000);
        Alert alert =getDriver().switchTo().alert();
        System.out.println(alert.getText());
        String text = alert.getText();
        String otp=onlineApplicationFormPage.extractNumber(text);
        alert.accept();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.otp).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.otp).sendKeys(otp);
        Thread.sleep(2000);
        alert =getDriver().switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.email,"khadhezazaman@gmail.com");
        //Thread.sleep(5000);
        onlineApplicationFormPage.clickOnElement(onlineApplicationFormPage.genderMale);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.maritalStatus).click();
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.maritalStatus,"SINGLE");
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.religion,"ISLAM");


        onlineApplicationFormPage.getElement(onlineApplicationFormPage.photo).sendKeys("C:\\Users\\Tech Land\\Downloads\\Anis.online_300x300_image.jpg");
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.signature).sendKeys("C:\\Users\\Tech Land\\Downloads\\Signature.jpg");
        Thread.sleep(5000);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.clickOnNextButton).click();
        //JavascriptExecutor js=(JavascriptExecutor)getDriver();
        //js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight);");
        //Thread.sleep(500);

        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.selectDivision,"DHAKA");
        Thread.sleep(2000);
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.getSelectDistrict,"RAJBARI");
        Thread.sleep(2000);
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.selectUpazila,"RAJBARI SADAR");
        Thread.sleep(2000);
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.postOffice,"DEBGRAM");
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.postCode,"2216");
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.address,"Debagram, Goalandaghat Upazila, Rajbari, Dhaka Division, Bangladesh");


        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.currentDivision,"DHAKA");
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.currentDistrict,"DHAKA");
        Thread.sleep(2000);
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.currentThana,"KOTWALI");
        Thread.sleep(5000);
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.currentPostOffice,"DHAKA GPO");
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.currentPostCode,"1000");
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.currentAddress,"20/2,RUPNAGOR ABASHIK AREA WARD NUMBER-20PART");
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.nextButton).click();
        //Thread.sleep(2000);
        //onlineApplicationFormPage.getElement(onlineApplicationFormPage.educationLevel).click();
        Thread.sleep(5000);
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.educationLevel,"PRIMARY");
        Thread.sleep(5000);
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.exam,"PRIMARY");
        Thread.sleep(5000);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.subjectCheckBox).click();
        Thread.sleep(5000);
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.otherTypeBox,"Software Quality Assurance Engineer");
        Thread.sleep(5000);

        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.passingYear,"2013");
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.result,"1ST DIVISION");
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.jobApplicationNextButton).click();
        Thread.sleep(5000);
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.organization,"Bongo Technology");

        //Thread.sleep(5000);
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.month,"07");
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.day,"01");
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.day,"2017");
        Thread.sleep(5000);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.checkBoxOne).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.nextExperienceButton).click();
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.courseProfessional,"Photoshop");
        Thread.sleep(5000);
        onlineApplicationFormPage.writeOnElement(onlineApplicationFormPage.duration,"3");
        Thread.sleep(5000);
        onlineApplicationFormPage.selectWithVisibleText(onlineApplicationFormPage.selectTime,"YEAR");
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.certificateNextButton).click();
        Thread.sleep(5000);
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.declarationCheckBox).click();
        onlineApplicationFormPage.getElement(onlineApplicationFormPage.completedButton).click();
        Thread.sleep(5000);
        //onlineApplicationFormPage.getElement(onlineApplicationFormPage.okButton).click();
        
        Thread.sleep(2000);








    }
}
