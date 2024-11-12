package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
@FindBy(name = "email")
    WebElement emailTxtBox;
@FindBy(name = "password")
    WebElement passwordTxtBox;
@FindBy(css = "button.btn.btn-default")
    WebElement loginBtn;
public void userCanLogin(String Email , String Password){
    setTextForTxtBox(emailTxtBox,Email);
    setTextForTxtBox(passwordTxtBox,Password);
    loginBtn.click();
}

}
