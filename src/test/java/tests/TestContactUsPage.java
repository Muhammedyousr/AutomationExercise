package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class TestContactUsPage extends TestBase {
    HomePage homePageObject;
    ContactUsPage contactObject;

    String Name = "MO yousry";
    String Email = "mo@gmail.com";
    String Subject = "asking about product";
    String Message = "i want to ask about some products (prices and different color available ";
    String FilePath = "C://Users//myousry//Pictures//pic.jpeg";


    @Test
    public void userCanContactWithCstCare() {
        homePageObject = new HomePage(driver);
        homePageObject.openContactUsPage();
        contactObject = new ContactUsPage(driver);
        contactObject.ContactWithCutomerCare(Name, Email, Subject, Message, FilePath);
    }
}
