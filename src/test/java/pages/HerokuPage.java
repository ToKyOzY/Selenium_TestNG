package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerokuPage {
    public HerokuPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//button[@id='onblur']")
    public WebElement onBlur;

    @FindBy (xpath = "//*[@id='onclick']")
    public WebElement onClick;

    @FindBy (xpath = "//*[@id='oncontextmenu']")
    public WebElement onContextMenu;

    @FindBy (xpath = "//*[@id='ondoubleclick']")
    public WebElement onDoubleClick;

    @FindBy (xpath = "//*[@id='onfocus']")
    public WebElement onFocus;

    @FindBy (xpath = "//*[@id='onkeydown']")
    public WebElement onKeyDown;

    @FindBy (xpath = "//*[@id='onkeyup']")
    public WebElement onKeyUp;

    @FindBy (xpath = "//*[@id='onkeypress']")
    public WebElement onKeyPress;

    @FindBy (xpath = "//*[@id='onmouseover']")
    public WebElement onMouseOver;

    @FindBy (xpath = "//*[@id='onmouseleave']")
    public WebElement onMouseLeave;

    @FindBy (xpath = "//*[@id='onmousedown']")
    public WebElement onMouseDown;



}
