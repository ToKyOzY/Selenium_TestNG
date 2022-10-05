package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C04_DependsOnMethod extends TestBaseBeforeClassAfterClass {

    @Test
    public void test1() {
        //amazon ana sayfasına gidiniz
        driver.get("http://amazon.com");
    }

    @Test (dependsOnMethods = "test1")
    public void test2() {
        //Nutella ratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);
    }

    @Test (dependsOnMethods = "test2")
    public void test3() {
        //sonuc yazısının amazon icerdigini test edin
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).isDisplayed());
    }
}
