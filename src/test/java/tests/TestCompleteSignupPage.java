package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CompleteSignUpPage;

public class TestCompleteSignupPage extends TestSignupPage {
    CompleteSignUpPage completeSignupObject;

    @Test(priority = 1)
    public void completeSignupSuccessfully(){
        completeSignupObject = new CompleteSignUpPage(driver);
        completeSignupObject.signupSuccessfully("Pass@123","22" , "2" ,"1996", "20st" , "Bacus", "20St-Bacus","Canada" , "single","Alexandria", "4120","01111111122");


    }
}
