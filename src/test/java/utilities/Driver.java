package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    static WebDriver driver;
    /*
    Testlerimizi calıtırdıgımızda her seferinde yeni driver oluşturdugu için her test methodu için yeni bir
    pencere(driver) acıyor. eger driver'a bir deger atanmamışsa yani driver== null ise bir kere
    driver'ı çalıştır diyerek bir kere if içini çalıştıracak. Ve driver artık bir kere calıştıgı icin ve deger atandıgı
    icin null olmayacak ve direkt return edecek ve diger testlerimiz aynı pencere(driver) uzerinde çalışacak.
     */
    public static WebDriver getDriver(){
        if (driver==null) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null) { //driver'a  deger atanmışsa
            driver.close();
            driver=null; //kapandıkatan sonraki açmaları garanti altına almak için driver'i tekrar null yaptık.
        }
    }
}
