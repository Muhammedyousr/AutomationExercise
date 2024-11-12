package pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name= "name")
    WebElement nameTxtBox;
    @FindBy(name = "email")
    WebElement emailTxtBox;
    @FindBy(name = "subject")
    WebElement subjectTxtBox;
    @FindBy(id = "message")
    WebElement messageTxtBox;
    @FindBy(name = "upload_file")
    WebElement uploadFileBtn;
    @FindBy(css = "input.btn.btn-primary.pull-left.submit_form")
    WebElement submitBtn;
    @FindBy(linkText = "home")
    WebElement backHomeLink ;

    public void ContactWithCutomerCare(String Name, String Email, String Subject, String Message, String FilePath) {
       setTextForTxtBox(nameTxtBox ,Name );
       setTextForTxtBox(emailTxtBox, Email);
       setTextForTxtBox(subjectTxtBox, Subject);
       setTextForTxtBox(messageTxtBox,Message);
       setTextForTxtBox(uploadFileBtn,FilePath);
       clickButton(submitBtn);
       clickButton(backHomeLink);
    }
}
