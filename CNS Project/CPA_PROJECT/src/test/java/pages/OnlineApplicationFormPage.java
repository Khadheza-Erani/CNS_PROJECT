package pages;

import org.openqa.selenium.By;

public class OnlineApplicationFormPage extends BasePage{
    public String dashboardJobCircularUrl ="http://123.200.20.20:5302/";
    public String onlineApplicationFormPageUrl ="http://123.200.20.20:5302/job-application/23120650";
    public String windowSwitch ="http://123.200.20.20:5302/show-dtl-list?cir_id=23120649";

    public By selectTwentyByTwentyThree =By.xpath("//a[normalize-space()='20/2023']");
    public By eyeButton =By.xpath("//tbody/tr[2]/td[7]/a[1]/i[1]");

    public By clickApplyNowButton =By.xpath("//strong[contains(text(),'Apply')]");
    public By continueWithoutLogIn=By.xpath("//a[normalize-space()='Continue without Login']");
    public By quota=By.xpath("//select[@id='quota']");
    public By currentWorkingCheckBoxNo = By.xpath("(//input[@id='gov_org_no'])[1]");
    //public By currentWorkingCheckBoxYes = By.xpath("(//input[@id='gov_org_yes'])[1]");
    public By nationalIdField = By.xpath("//input[@id='national_id']");
    public By clickBrowserButton =By.xpath("//input[@id='national_id_attachment']");
    public By dateOfBirth =By.xpath("//input[@id='date_of_birth']");
    public By dateOfMarch =By.xpath("//th[@title='Select Month']");
    public By dateOfTwentyToTwentyNine =By.xpath("//th[@title='Select Year']");
    public By dateOfTenToNinety =By.xpath("//span[@title='Previous Decade']");
    public By dateOfTwentyToNine =By.xpath("//span[@title='Previous Decade']");
    public By dateOfNinetyToNinetyFive =By.xpath("//span[@title='Previous Decade']");
    public By clickNinetyFive =By.xpath("//span[normalize-space()='1995']");
    public By clickAugust =By.xpath("//span[normalize-space()='Aug']");
    public By clickTwentyThree =By.xpath("//td[normalize-space()='23']");
    public By clickVerifyNid =By.xpath("//button[@id='nid_verification']");
    public By fatherName = By.xpath("//input[@id='father_name']");
    public By motherName= By.xpath("//input[@id='mother_name']");
    public By mobileNumber =By.xpath("//input[@id='mobile']");
    public By otp =By.xpath("//input[@id='otp']");
    public By email= By.xpath("//input[@id='email']");
    public By genderMale= By.xpath("//label[@for='gender_1']");
    public By maritalStatus =By.xpath("//select[@id='marital_status']");
    public By religion=By.xpath("//select[@id='religion']");
    public By photo =By.xpath("//input[@id='photo']");
    public  By signature =By.xpath("//input[@id='signature']");
    public By clickOnNextButton =By.xpath("//button[@value='first']");
//next Address page
    public By selectDivision=By.xpath("//select[@id='permanent_division']");
    public By getSelectDistrict=By.xpath("//select[@id='permanent_district']");
    public By selectUpazila=By.xpath("//select[@id='permanent_thana']");
    public By postOffice=By.xpath("//input[@id='permanent_post_office_name']");
    public By postCode=By.xpath("//input[@id='permanent_post_code']");
    public By address=By.xpath("//input[@id='permanent_address']");

    public By currentDivision= By.xpath("//select[@id='present_division']");
    public By currentDistrict= By.xpath("//select[@id='present_district']");
    public By currentThana= By.xpath("//select[@id='present_thana']");
    public By currentPostOffice= By.xpath("//input[@id='present_post_office_name']");
    public By currentPostCode= By.xpath("//input[@id='present_post_code']");
    public By currentAddress= By.xpath("//input[@id='present_address']");
    public By nextButton = By.xpath("//div[@id='enable_after_district_verification']//button[@type='button'][normalize-space()='Next']");

    public By educationLevel = By.xpath("//select[@id='education_0_education_level']");
    public By exam = By.xpath("//select[@id='education_0_exam']");
    public By subjectCheckBox =By.xpath("//input[@id='education_0_other_subject_body_checkbox']");
    public By otherTypeBox=By.xpath("//input[@id='education_0_other_subject_body']");
    public By passingYear = By.xpath("//input[@id='education_0_passing_year']");
    public By result = By.xpath("//select[@id='education_0_result_type']");
    public By jobApplicationNextButton = By.xpath("//div[@id='nextButtonContainer']//button[@type='button'][normalize-space()='Next']");

   public By course = By.xpath("//span[@class='select2 select2-container select2-container--default select2-container--below select2-container--focus']//b[@role='presentation']");

   public By organization =By.xpath("//input[@id='jobexperience_0_organization']");
   public By designation=By.xpath("//select[@id='jobexperience_0_designation']");

   public  By month =By.xpath("//input[@id='jobexperience_0_start_date']");
    public  By day =By.xpath("//input[@id='jobexperience_0_start_date']");
    public  By year =By.xpath("//input[@id='jobexperience_0_start_date']");
    public By checkBoxOne =By.xpath("//tbody/tr[@role='row']/td[@role='cell']/div[1]/input[1]");
    public By nextExperienceButton = By.xpath("//button[@class='btn btn-secondary jobExpNext nextBtn']");

    public  By courseProfessional= By.xpath("//select[@id='training_0_course']");
    public  By duration=By.xpath("//input[@id='training_0_duration']");
    public By selectTime=By.xpath("//select[@class='form-control durationType']");
    public By certificateNextButton=By.xpath("//button[@class='btn btn-secondary trainingExpNext nextBtn']");
    public By declarationCheckBox=By.xpath("//label[@for='accepted']");
    public By completedButton =By.xpath("//button[@name='completeBtn']");
    public By okButton =By.xpath("//button[normalize-space()='Yes']");







}
