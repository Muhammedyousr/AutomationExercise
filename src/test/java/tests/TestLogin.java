package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TestLogin extends TestCompleteSignupPage{
    LoginPage loginObject ;
    @Test(priority = 2)
public void loginSuccessfully(){
    loginObject = new LoginPage(driver);
    loginObject.userCanLogin("kollatreceixo-20017@yopmail.com","Pass@123");
        Assert.assertTrue(completeSignupObject.logoutLink.isDisplayed());
}
}
