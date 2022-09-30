package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceBookPage {


    public FaceBookPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//*[@id='email']")

    public WebElement email;

    @FindBy (xpath = "//*[@id='pass']")
    public WebElement password;

    @FindBy (xpath = "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement login;

    @FindBy (xpath = "//*[@class='_9ay7']")
    public WebElement faultyInput;
}
