package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C03 {
    public static void main(String[] args) throws InterruptedException {
        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        // ilk kutucuga 20 giriniz
        // ikinci kutucuga 30 giriniz
        // calculate'e tıklayınız
        // sonucu yazdırınız
        // sayfayi kapatiniz

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();

        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");

        // ilk kutucuga 20 giriniz
       WebElement ilkkutucuk= driver.findElement(By.id("number1"));
       ilkkutucuk.sendKeys("20");
       Thread.sleep(2000);


        // ikinci kutucuga 30 giriniz

       WebElement ikincikutucuk= driver.findElement(By.id("number2"));
       ikincikutucuk.sendKeys("30");
       Thread.sleep(2000);
        // calculate'e tıklayınız
       WebElement calculate = driver.findElement(By.id("calculate"));
       calculate.click();

        // sonucu yazdırınız

       WebElement sonuc= driver.findElement(By.id("answer"));
        System.out.println("toplama işleminin sonucu"+sonuc.getText());

        // sayfayi kapatiniz

        driver.close();


    }
}
