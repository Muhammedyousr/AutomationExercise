package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.Helper;

public class TestBase {
public static WebDriver driver ;

@BeforeSuite
@Parameters(("browser"))
    public void startDriver(@Optional ("chrome") String browserName){
    if (browserName.equalsIgnoreCase("chrome")){
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "//sources//chromedriver.exe");
        driver = new ChromeDriver();
    } else if (browserName.equalsIgnoreCase("edge")) {
        System.setProperty("webdriver.edge.driver",
                System.getProperty("user.dir") + "//sources//msedgedriver.exe");
        driver = new EdgeDriver();
    }
    driver.manage().window().maximize();
    driver.navigate().to("https://automationexercise.com/");
}
@AfterSuite
    public void closeDriver(){
    //driver.quit();
}
//take screenshot when testcase fail &add to scrshot folder
    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult result){
    if (result.getStatus()==ITestResult.FAILURE){
        System.out.println("fail");
        System.out.println("taking screenshot");
        Helper.captureScreenShot(driver , result.getName());
    }
    }
}
