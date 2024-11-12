package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Signup / Login")
    WebElement signupLink;
    @FindBy(linkText = " Signup / Login")
    WebElement loginLink;
    @FindBy(linkText = "Contact us")
    WebElement contactUsLink ;

    public void openSignupPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(signupLink)).click();
        clickButton(signupLink);
}
    public void openLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.elementToBeClickable(loginLink)).click();

        clickButton(loginLink); ;
    }
    public void openContactUsPage(){
        clickButton(contactUsLink);
    }
}
