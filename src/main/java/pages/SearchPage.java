package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
    WebElement productsLinkTxt ;
    @FindBy(id = "search_product")
    WebElement searchTxtBox ;
    @FindBy(id = "submit_search")
    WebElement searchBtn ;
    @FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a")
    WebElement productDetailsTxtLink ;
public void openProductPageAndSearchForProducts(String productName) {
    clickButton(productsLinkTxt);
    setTextForTxtBox(searchTxtBox , productName );
    clickButton(searchBtn);
    clickButton(productDetailsTxtLink);
}
}
