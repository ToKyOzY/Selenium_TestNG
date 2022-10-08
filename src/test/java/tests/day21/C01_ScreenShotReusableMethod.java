package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusableMethod {

    @Test
    public void test01() throws IOException {
    //Hepsi Burada sayfasına gidiniz
        Driver.getDriver().get("https://hepsiburada.com");
        //ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");
        //SAyfayı kapatınız
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        //Amazon sayfasina gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("amazon_Url"));
        AmazonPage amazonPage=new AmazonPage();
        //nutella Aratınız
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazısı Webelementinin resmini alin
        ReusableMethods.getScreenshotWebElement("serachResultElement",amazonPage.searchResultElement);

        Driver.closeDriver();

    }
}
