package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchProductPage {

    public SearchProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@class='material-icons card_travel']" )
            public WebElement products;

    @FindBy (xpath = "//*[@class='title text-center']" )
    public WebElement allProducts;

    @FindBy (xpath = "//*[@id='search_product']" )
    public WebElement searchBox;

    @FindBy (xpath = "//*[@class='productinfo text-center']" )
    public WebElement trueProduct;
    @FindBy (xpath = "//div[@class='product-image-wrapper']" )
    public List<WebElement> searchProductList;
}
