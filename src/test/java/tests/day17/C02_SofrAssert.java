package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_SofrAssert extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        //3-arama kutusnun erişilebilir oldugunu tets edin
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled());
        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        Assert.assertTrue(driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']")).isDisplayed());
        //6-arama sonucunun Nutella içerdigini test edin

    }
}
