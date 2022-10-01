package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
            switch (ConfigReader.getProperty("browser")){
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                 case "firefox":
                     WebDriverManager.firefoxdriver().setup();
                     driver=new FirefoxDriver();
                     break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }

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
