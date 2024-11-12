package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductDetailsPage;
import pages.SearchPage;
public class TestSearchPage extends TestBase {
    SearchPage productObject ;
    ProductDetailsPage productDetailsObjects;
    String productName = "Premium Polo T-Shirts";
    @Test (priority = 3)
    public void userCanExploreProducts()
    {
        productObject = new SearchPage(driver);
        productObject.openProductPageAndSearchForProducts(productName);
        productDetailsObjects = new ProductDetailsPage(driver);
       Assert.assertTrue(productDetailsObjects.productInformationBreadCrumb.getText().contains("Premium  Polo  T-Shirts"));
}
}
