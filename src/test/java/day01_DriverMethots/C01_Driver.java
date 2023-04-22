package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_Driver {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.http.factory", "jdk-http-client");
        //System.setProperty java uygulamalarında sistem
        // özelliklerini ayarlamak için kullanılır
        //Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
       // WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");// get() methodu ile adresini verdiğim sayfaya gider

        System.out.println("sayfa başlıgı=" +driver.getTitle()); //içinde bulundugum sayfanın baslıgını getirir

        System.out.println("sayfa url i "+driver.getCurrentUrl());//içinde bulundugumuz sayfanın url ini getirir

       // System.out.println(driver.getPageSource());// bulundugum sayfanın html kaynak kodlarını verir
        Thread.sleep(2000);

        driver.get("https://www.youtube.com");
        Thread.sleep(2000);

        System.out.println("sayfa url i"+driver.getCurrentUrl());
        Thread.sleep(2000);

        System.out.println("sayfa başlığı"+driver.getTitle());
        Thread.sleep(2000);

        System.out.println("sayfanın hash kodu"+driver.hashCode());

        driver.close();


    }


}
