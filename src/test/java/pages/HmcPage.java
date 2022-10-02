package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HmcPage {
    public HmcPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='nav-link'])[7]")
    public WebElement login;
    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement username;
    @FindBy(xpath = "//*[@id='Password']")
    public WebElement password;
    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy(xpath = "(//*[@class='icon-calendar'])[4]")
    public WebElement roomReservationButton;

    @FindBy(xpath = "//*[text()='Add Room Reservation ']")
    public WebElement addRoomReservationButton;
    @FindBy(xpath = "//*[@id='IDUser']")
    public WebElement idUser;

    @FindBy(xpath = "(//*[@class='modal-body'])[2]")
    public WebElement successfully;
    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement okButton;

}