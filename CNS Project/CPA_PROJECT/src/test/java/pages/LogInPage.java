package pages;

import org.openqa.selenium.By;

public class LogInPage extends BasePage {

    public String LogInPageUrl="http://123.200.20.20:5302/login";
    public String LogInPageTitle="CPA Job Portal CPA Job Portal";
    public By loginButton =By.xpath("//span[normalize-space()='Login']");

    public String logInPageUrl="http://123.200.20.20:5302/login";
    public String logInPageTitle="CPA Job Portal CPA Job Portal";
    public By loginByEmailOrMobileNumber =By.xpath("//input[@placeholder='Enter Mobile/Email']");
    public By loginPassword =By.xpath("//input[@placeholder='Enter Password']");
    public By loginButtonOne =By.xpath("//button[@type='submit']");



    public void doLogin(String username_text, String password_text){
        writeOnElement(loginByEmailOrMobileNumber, username_text);
        writeOnElement(loginPassword, password_text);
        clickOnElement(loginButton);
    }


}
