package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;
    static { //Her method'dan once çalışır
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fis); //fis'in okudugu bilgileri properties'e yukledi.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static String getProperty(String key){

        /*
        test method'undan yolladıgımız String key degerini alıp
        Properties class'ından getProperty() method'unu kullanarak
        bu key'e ait value'yu bize getirir.
         */
        return properties.getProperty(key);
    }
}
