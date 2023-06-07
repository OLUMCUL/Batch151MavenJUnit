package techproed.day08_BeforeClassAfterClass_Assertion;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BeforeClassAfterClass {
    /*
        Before class ve After class test methodlarimizdan once bir sefer calismasini istedigimiz
    kodlari bu methodlara koylariz.
        Mesela testlerimiz baslamadan once database baglantisi yapmak icin kullanilabilir yada hangi driveri
    kullanacaksak yine bunu before class'a koyabiliriz. Ayni sekilde teslerimizden sonra database'i sonlandirmak icin yada
    raporlari sonlandirmak icin de kullanabilirz.
     */

    WebDriver driver;
    @BeforeClass
    public static void Before() throws Exception {
        WebDriverManager.chromedriver().setup();
    }
    @Before
    public void setUp() {
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://techproeducation.com");

    }

    @Test
    public void test01() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("qa", Keys.ENTER);

    }

    @Test
    public void test02() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='search']")).sendKeys("developer", Keys.ENTER);

    }

    //qa aratin
    //cikan sonuclari test edin
    //linkleri tiklayin
    //assertion
    //raporla

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
