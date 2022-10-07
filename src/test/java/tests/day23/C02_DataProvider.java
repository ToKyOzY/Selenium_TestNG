package tests.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BlueRantACarPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {


    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"zeynep@gmail.com", "12345"},{"zynp@gmail.com","54321"},{"zeyno@gmail.com","98765"}};
    }

    @Test (dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blrcr_Url"));

        //login butonuna bas
        BlueRantACarPage blueRantACarPage=new BlueRantACarPage();
        blueRantACarPage.brcLogin.click();

        //Data provider ile 3 farklı useremail ve 3 frklı password girelim
        blueRantACarPage.brcEmail.sendKeys(userEmail);
        blueRantACarPage.brcPassword.sendKeys(password);

        //Login butonuna tıklayın
        blueRantACarPage.brcSubmit.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(blueRantACarPage.brcSubmit.isDisplayed()); //girilemeyecegi için burayı submitle aldım



    }
}
