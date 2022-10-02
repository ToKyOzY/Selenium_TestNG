package tests.day19;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SinglePattern {
    @Test
    public void test01() {
        Driver obj=new Driver();
        obj.getDriver().get(ConfigReader.getProperty("amznUrl"));
        /*
        SingletonPattern = tekli kullanım demektir.
        Bir class'ın farklı classlardan obje oluşturarak kullanımını engellemektir.
         */

    }
}
