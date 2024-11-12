package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CompleteSignUpPage extends PageBase {
    public CompleteSignUpPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "id_gender1")
    WebElement maleGenderBtn ;
    @FindBy(id = "password")
    WebElement passwordTxtBox;
    @FindBy(id = "days")
    WebElement dayMenu;
    @FindBy(id = "months")
    WebElement monthMenu;
    @FindBy(id = "years")
    WebElement yearMenu;
    @FindBy(id = "newsletter")
    WebElement newsCheckBox;
    //address information
    @FindBy(id = "first_name")
    WebElement addressTextBOX1;
    @FindBy(id = "last_name")
    WebElement addressTextBOX2;
    @FindBy(id = "address1")
    WebElement addressTextBox;
    @FindBy(id = "country")
    WebElement countryMenu;
    @FindBy(id = "state")
    WebElement stateTextBox;
    @FindBy(id = "city")
    WebElement cityTextBox;
    @FindBy(id = "zipcode")
    WebElement zipTextBox;
    @FindBy(id = "mobile_number")
    WebElement mobileTextBox;
    @FindBy(css = "button.btn.btn-default")
    WebElement createAccBtn ;
    @FindBy(css = "h2.title text-center")
    public WebElement successLogin ;
    @FindBy(linkText = "Continue")
    public WebElement continueLink;
    @FindBy(linkText = "Logout")
    public WebElement logoutLink;
    public void signupSuccessfully(String password,String Day ,String Month ,String Year ,String address1 , String address2 ,String Address,  String Country,String State , String City ,String ZipCode , String MobileNo){
        clickButton(maleGenderBtn);
        setTextForTxtBox(passwordTxtBox,password);

        Select day = new Select(dayMenu);
        day.selectByValue(Day);

        Select month = new Select(monthMenu);
        month.selectByValue(Month);

        Select year = new Select(yearMenu);
        year.selectByValue(Year);


        clickButton(newsCheckBox);
        setTextForTxtBox(addressTextBOX1,address1);
        setTextForTxtBox(addressTextBOX2,address2);
        setTextForTxtBox(addressTextBox,Address);

        Select country = new Select(countryMenu);
        country.selectByValue(Country);

        setTextForTxtBox(stateTextBox,State);
        setTextForTxtBox(cityTextBox,City);
        setTextForTxtBox(zipTextBox,ZipCode);
        setTextForTxtBox(mobileTextBox,MobileNo);
        clickButton(createAccBtn);
        clickButton(continueLink);
        clickButton(logoutLink);
    }
}
