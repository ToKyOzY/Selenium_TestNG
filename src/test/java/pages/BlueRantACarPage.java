package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRantACarPage {

   public BlueRantACarPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy (xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement brcLogin;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement brcEmail;


    @FindBy (xpath = "//*[@id='formBasicPassword']")
    public WebElement brcPassword;

    @FindBy (xpath = "//*[@class='btn btn-primary']")
    public WebElement brcSubmit;

    @FindBy (id = "dropdown-basic-button")
    public WebElement brcBasariliGiris;
}
