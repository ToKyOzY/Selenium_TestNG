package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    //Testlerimizi çalıştırrırken istediğimiz sıraya göre çalışmasını istersek priority yazarız
    //Priority kullanmazsak default olarak 0 yazılır yani 0 olur
    @Test(priority = 1)
    public void testYoutube() {

        driver.get("https://www.youtube.com");
    }

    @Test(priority = 3)
    public void testBestbuy() {
        driver.get("https://www.bestbuy.com");
    }

    @Test(priority = 2)
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }

    @Test(priority = -1 , groups = "gp1")
    public void testHepsiburada() {
        driver.get("https://www.hepsiburada.com");
    }
}