package tests.day20;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HmcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_SmokeNegativeTest {
    @Test
    public void yanlisKullanici() {// 1. Senaryo => Yanlış kullanıcı dogru sifre
        // https://www.hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage=new HmcPage();
        //login butonuna bas
        hmcPage.login.click();
        //test data username: manager1 ,  test data password : manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongUserName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya girilemedigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }
    @Test
    public void yanlisSifre() {//2. Senaryo => dogru kullanıcı yanlış şifre
        // https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage=new HmcPage();
        /*Page class'ındaki locate'lerimize ulaşabilmek için page
        class'ımızdan bir obje oluşturarak oluşturmuş oldugumuz obje ile
        page class'ımızdaki locate'lerimize ulaşabiliriz

         */
        hmcPage.login.click();
        //test data username: manager ,  test data password : Manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("userName"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPassword"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }
    @Test
    public void yanlisKullaniciSifre() { //3. Senaryo => Yanlış kullanıcı, Yanlış şifre
        // https://www.hotelmycamp.com/ adresine git  login butonuna bas
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage=new HmcPage();
        /*Page class'ındaki locate'lerimize ulaşabilmek için page
        class'ımızdan bir obje oluşturarak oluşturmuş oldugumuz obje ile
        page class'ımızdaki locate'lerimize ulaşabiliriz

         */
        hmcPage.login.click();
        //test data username: manager ,  test data password : Manager1!
        hmcPage.username.sendKeys(ConfigReader.getProperty("hmcWrongUserName"));
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("hmcWrongPassword"))
                .sendKeys(Keys.ENTER).perform();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hmcPage.girisYapilamadi.isDisplayed());
        //Sayfayı kapatınız
        Driver.closeDriver();
    }

}
