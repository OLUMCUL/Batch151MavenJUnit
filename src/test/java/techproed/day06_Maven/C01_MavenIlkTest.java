package techproed.day06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C01_MavenIlkTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com.tr/ref=nav_logo");
        //arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]"));

        //“Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones",Keys.ENTER);

        //Bulunan sonuc sayisini yazdiralim
        String[] sonucSayisi = driver.findElement(By.xpath("//*[@class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText().split(" ");
        System.out.println("sonucSayisi = " + sonucSayisi[0]);

        //Ilk urunu tiklayalim
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"sp-cc-accept\"]")).click();

        driver.findElement(By.xpath("(//*[@class=\"s-image\"])[1]")).click();

        //Sayfadaki tum basliklari yazdiralim
        List<WebElement> tumBasliklar = driver.findElements(By.xpath("//h1|//h2"));
        for (WebElement w:tumBasliklar) {
            System.out.println(w.getText());
        }




    }
}
