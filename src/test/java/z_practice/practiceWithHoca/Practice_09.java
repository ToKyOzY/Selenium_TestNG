package z_practice.practiceWithHoca;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchProductPage;
import utilities.Driver;

import java.util.List;

public class Practice_09 {
        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        // 4. 'Ürünler' butonuna tıklayın
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın


    @Test
    public void searchProductPage() {
        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get("https://automationexercise.com");
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String homeUrl="https://automationexercise.com/";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), homeUrl);
        // 4. 'Ürünler' butonuna tıklayın
        SearchProductPage searchProductPage=new SearchProductPage();
        searchProductPage.products.click();
        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(searchProductPage.allProducts.isDisplayed());
        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
        searchProductPage.searchBox.sendKeys("blue");
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        // 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
        Assert.assertTrue(searchProductPage.trueProduct.isDisplayed());

        List<WebElement> productList=searchProductPage.searchProductList;

        for (WebElement each:productList
             ) {
            Assert.assertTrue(each.isDisplayed());

        }
        // 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın

    }
}
