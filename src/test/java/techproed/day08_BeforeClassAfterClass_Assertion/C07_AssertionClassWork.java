package techproed.day08_BeforeClassAfterClass_Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_AssertionClassWork {
    /*
    1)https://amazon.com adresine gidin
    2)Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleri yapin
        ○ title Test  => Sayfa başlığının "Amazon" kelimesini içerip içermediğini test edin
        ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
        ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
        ○ wrongTitleTest => Sayfa basliginin "amazon" içermediğini doğrulayın
     */
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void titleTest() {
        driver.get("https://amazon.com.tr");
        String expectedTitle = "Amazon";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));
        System.out.println("Test basarili");

    }

    @Test
    public void imageTest() {
        WebElement amazonImage = driver.findElement(By.xpath("//*[@id=\"nav-logo\"]"));
        Assert.assertTrue(amazonImage.isDisplayed());

    }

    @Test
    public void searchBoxTest() {
        WebElement amazonImage = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

    }

    @Test
    public void wrongTitleTest() {

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}