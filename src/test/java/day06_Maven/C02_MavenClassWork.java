package day06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C02_MavenClassWork {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        http://zero.webappsecurity.com sayfasina gidin
        Signin buttonuna tiklayin
        Login alanine  “username” yazdirin
        Password alanine “password” yazdirin
        Sign in buttonuna tiklayin
        Pay Bills sayfasina gidin
        amount kismina yatirmak istediginiz herhangi bir miktari yazin
        tarih kismina “2020-09-10” yazdirin
        Pay buttonuna tiklayin
       “The payment was successfully submitted.” mesajinin ciktigini control edin
         */

        //http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
        //Signin buttonuna tiklayin
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();
        //Login alanine  “username” yazdirin
        WebElement login = driver.findElement(By.xpath("//*[@id='user_login']"));
        login.sendKeys("username");

        //Password alanine “password” yazdirin-->//*[@id='user_password']
        WebElement password = driver.findElement(with(By.tagName("input")).below(login));
        password.sendKeys("password");

        //Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.navigate().back();//--> Sign in buttonuna bastıktan sonra güvenlik problemini geçmek için back() yaptık
        //Pay Bills sayfasina gidin-->Pay Bills bölümüne ulaşabilmek için önce Online Banking bölümüne tıklamalıyız
        //       xpath-->//strong[text()='Online Banking']
        //       xpath-->//*[.='Online Banking']
        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click();
        driver.findElement(By.xpath("//*[text()='Pay Bills']")).click();


        //amount kismina yatirmak istediginiz herhangi bir miktari yazin
        WebElement amount = driver.findElement(By.cssSelector("input[id='sp_amount']"));
        amount.sendKeys("100");
        //tarih kismina “2020-09-10” yazdirin
        WebElement tarih = driver.findElement(By.cssSelector("input[id='sp_date']"));
        tarih.sendKeys("2020-09-10");
        //Pay buttonuna tiklayin
        driver.findElement(By.cssSelector("input[id='pay_saved_payees']")).click();
        //“The payment was successfully submitted.” mesajinin ciktigini control edin
        WebElement mesaj = driver.findElement(By.xpath("//*[text()='The payment was successfully submitted.']"));
        if (mesaj.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");
        //Sayfayi kapatınız
        driver.close();

    }
}
