package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    protected WebDriver driver;
public PageBase(WebDriver driver){
    PageFactory.initElements(driver,this);
}
protected static void clickButton(WebElement button){
    button.click();
}
protected static void setTextForTxtBox(WebElement textElement , String value){
    textElement.sendKeys(value);
}
}
