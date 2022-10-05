package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRantACarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
    // -https://www.bluerentalcars.com/ adresine git
    //    -login butonuna bas
    //    -test data user email: customer@bluerentalcars.com ,
    //    -test data password : 12345 dataları girip login e basın
    //    -login butonuna tiklayin
    //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


    @Test
    public void test01() {
        extentTest=extentReports.createTest("Pozitif Test", "Gecerli Kullanici adi ve password ile giris yapildi");
        // -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("blrcrUrl"));
        extentTest.info("lue RentaCar sitesine gidildi");
        //    -login butonuna bas
        BlueRantACarPage blueRantACarPage=new BlueRantACarPage();
        blueRantACarPage.brcLogin.click();
        extentTest.info("login butonuna basildi");
        //    -test data user email: customer@bluerentalcars.com ,
        //    -test data password : 12345 dataları girip login e basın
        blueRantACarPage.brcEmail.sendKeys(ConfigReader.getProperty("userEmail"));
        blueRantACarPage.brcPassword.sendKeys(ConfigReader.getProperty("passW"));
        //    -login butonuna tiklayin
        blueRantACarPage.brcSubmit.click();
        extentTest.info("Dogru kullanici email ve password girildi ,login butonuna basildi");
        //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(blueRantACarPage.brcBasariliGiris.isDisplayed());
        extentTest.pass("Sayfaya basarili sekilde girildi");
    }
}
