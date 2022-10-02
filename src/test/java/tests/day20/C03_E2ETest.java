package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_E2ETest {
    @Test
    public void E2ETest() throws InterruptedException {
        //https://www.hotelmycamp.com adresine git.
        //Login butonuna tıklayın.
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage=new HmcPage();
        hmcPage.login.click();
        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        //Login butonuna tıklayın.
        hmcPage.username.sendKeys(ConfigReader.getProperty("userName"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.ENTER).perform();
        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hmcPage.hotelManagementButton.click();
        Thread.sleep(3000);
        hmcPage.roomReservationButton.click();
        hmcPage.addRoomReservationButton.click();
        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //Save butonuna tıklayın.
        hmcPage.idUser.sendKeys("manager");
        Faker faker=new Faker();
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel").
                sendKeys(Keys.TAB).sendKeys("1500").
                sendKeys(Keys.TAB).sendKeys("10/02/2022").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("10/13/2022").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("1").sendKeys(Keys.TAB).
                sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB).
                sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).
                sendKeys("afaflhbfldjfaa").sendKeys(Keys.TAB).sendKeys(Keys.SPACE).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hmcPage.successfully.getText().isBlank());
        //OK butonuna tıklayın.
        hmcPage.okButton.click();


    }
}
