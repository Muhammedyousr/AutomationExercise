package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends PageBase{
    public SignupPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    WebElement nameTextBOX ;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    WebElement emailTextBox;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    WebElement signupBtn;
public void signupFirstStage(String Name , String Email){
    setTextForTxtBox(nameTextBOX , Name );
    setTextForTxtBox(emailTextBox ,Email);
    clickButton(signupBtn);
}

}

