package pages;

import org.openqa.selenium.By;

public class DashBoardPage extends BasePage {
    public String dashBoardUrl = "http://123.200.20.20:5302/";
    public String dashBoardTitle = "CPA Job Portal Dashboard";

    public By dashBoardPageButton =By.xpath("//li[@class='nav-item active']//a");



}
