package utilities;

import org.testng.annotations.DataProvider;

public class AllDataSet {


    @DataProvider(name = "invalidLogInCredentials")
    //invalid credentials
    public static Object invalidLogInCredentialsDataSet(){
        return new Object[][]{
                {"","","Alert Text"},
                {"Mobile Number","", "Alert Text"},
                {"","Password","Please type mobile number"},
                {"Mobile Number","password", "Alert Text"},
                {"Mobile Number","password",""}

        };
    }
//for keeping the multi set of data
}
