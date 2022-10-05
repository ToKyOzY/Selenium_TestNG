package tests.day21;

import org.testng.annotations.Test;
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
}
