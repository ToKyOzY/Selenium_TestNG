package utilities;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public abstract class TestBaseBeforeMethodAfterMethod {
    protected WebDriver driver;
    protected Actions actions;
    protected Faker faker;
    @BeforeMethod
    //TestNG framework'unda before ve after notasyonları yerine beforeMethod ve afterMethod kullanılır
    //calışma prensibi JUnitteki before ve after ile aynıdır
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        actions=new Actions(driver);
        faker=new Faker();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

  
