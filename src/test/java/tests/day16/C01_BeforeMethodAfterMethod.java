package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeMethodAfterMethod{

    @Test
    public void amazonTest1() {

        driver.get("https://www.amazon.com");
    }

    @Test (groups = "gp1")
    public void bestbuyTest1() {

        driver.get("https://www.besybuy.com");
    }

    @Test
    public void techproeducationTest1() {

        driver.get("https://www.techproeducation.com");
    }
}
