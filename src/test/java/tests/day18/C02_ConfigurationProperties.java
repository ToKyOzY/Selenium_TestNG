package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigurationProperties {
    @Test
    public void test01() {
        //Amazon sayfasına ve facebook sayfasına gidiniz
        String urlamzn=ConfigReader.getProperty("amazon_Url");
        String urlface=ConfigReader.getProperty("face_url");
        Driver.getDriver().get(urlamzn);
        Driver.getDriver().get(urlface);
        Driver.closeDriver();

    }
}
