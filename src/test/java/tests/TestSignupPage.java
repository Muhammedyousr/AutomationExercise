package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupPage;

public class TestSignupPage extends TestBase {

        HomePage homeObject;
        SignupPage signupObject;
String Name = "Mohammed yousry";
String Email ="kollatreceixo-20017@yopmail.com";
@Test(priority = 0)
public void firstStageToSignup(){
    homeObject = new HomePage(driver);
    homeObject.openSignupPage();
    signupObject = new SignupPage(driver);
    signupObject.signupFirstStage(Name , Email);
}
}