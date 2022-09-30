package tests.day18;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceBookPage;
import utilities.Driver;

public class C01_FaceBookPageTest {


    @Test
    public void test01() {
        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        FaceBookPage faceBookPage=new FaceBookPage();
        Faker faker=new Faker();
        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
       faceBookPage.email.sendKeys(faker.internet().emailAddress());
       faceBookPage.password.sendKeys(faker.internet().password());
        faceBookPage.login.click();
        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(faceBookPage.faultyInput.isDisplayed());

    }
}
