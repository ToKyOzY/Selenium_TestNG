package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.Driver;
import utilities.TestBaseBeforeMethodAfterMethod;
import utilities.TestBaseCross;

public class C03_SoftAssert extends TestBaseCross {
    @Test
    public void test01() {

        SoftAssert softAssert = new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"girdiginiz kelimeyi icermiyor");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        softAssert.assertTrue(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isEnabled(),"WE erisilemez");
        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement result=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(result.isDisplayed(),"sonuc WE goruntulenemedi");
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(result.getText().contains("Nutella"),"Nutella icermiyor");
        //softAssert.assertAll();
        System.out.println("hata varsa burasi calismaz");

        Driver.closeDriver();


    }
}
