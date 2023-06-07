package techproed.day08_BeforeClassAfterClass_Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_FacebookClassWork {
    WebDriver driver;

    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    //-https://www.facebook.com adresine gidin
    //            -Cookies’i kabul edin
    //-“Create an Account” button’una basin
    //-“radio buttons” elementlerini locate edin
    //-Secili degilse cinsiyet butonundan size uygun olani secin

    @Test
    public void test1() {
        driver.get("https://www.facebook.com");

    }
}
