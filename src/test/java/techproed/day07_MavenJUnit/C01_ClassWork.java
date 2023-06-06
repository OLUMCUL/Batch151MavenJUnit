package techproed.day07_MavenJUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ClassWork {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1.http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //2.Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id=\"signin_button\"]")).click();

        //3.Login alanine “username” yazdirin//4.Password alanine “password” yazdirin
        driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("username", Keys.TAB,"password");

        //5.Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//*[@name=\"submit\"]")).click();
        driver.navigate().back();

        //6.Pay Bills sayfasina gidin
        driver.findElement(By.xpath("//*[@id=\"onlineBankingMenu\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"pay_bills_link\"]")).click();

        //7.amount kismina yatirmak istediginiz herhangi bir miktari yazin//8.tarih kismina “2020-09-10” yazdirin
        driver.findElement(By.xpath("//*[@id=\"sp_amount\"]")).sendKeys("999",Keys.TAB,"2020-09-10");

        //9.Pay buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id=\"pay_saved_payees\"]")).click();

        //10.“The payment was successfully submitted.” mesajinin ciktigini control edin
        System.out.println("alert = " + driver.findElement(By.xpath("//*[@id=\"alert_content\"]")).getText());
    }
}
