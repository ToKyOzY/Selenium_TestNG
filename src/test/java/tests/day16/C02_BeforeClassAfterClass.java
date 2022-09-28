package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {

    @Test
    public void testAmazon() {
        driver.get("https://www.amazon.com");
    }

    @Test
    public void testBestBuy() {
        driver.get("https://www.besybuy.com");
    }

    @Test
    public void testTechproeducation() {
        driver.get("https://www.techproeducation.com");
    }
}
