package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.http.factory", "jdk-http-client");
        WebDriver driver = new ChromeDriver();// şimdi boş açılır

        //amamzon sayfasına gidelim
        driver.get("https://amazon.com");
        Thread.sleep(3000);// java kodlarını bekletmek için kullanılır

        //sonra tesla sayfasına gidelim
        driver.navigate().to("https://tesla.com");// get methodu ile aynı sekilde calışır
        Thread.sleep(3000);// java kodlarını bekletmek için kullanılır

        //tesla sayfa basligini konsola yazdiralim
        System.out.println("sayfa başlığı"+driver.getTitle());//

        //tekrar amazon sayfasına dönelim
        driver.navigate().back();//önceki sayfaya geri gidiyor
        Thread.sleep(3000);// java kodlarını bekletmek için kullanılır

        //amazon sayfası baslıgını yazalım
        System.out.println("sayfa başlığı"+driver.getTitle());//

        // tekrar tasla sayfasına gidelim
        driver.navigate().forward();

        // son olarak sayfayı yenileyelim ve sayfayı kapatalım
        driver.navigate().refresh();//sayfayı yeniler
        driver.close();//sayfayı kapatır

        //NOT: sayfalar arası geçişler hızlı olacagın dan geçişler için 3 s. bekletelim






    }
}
