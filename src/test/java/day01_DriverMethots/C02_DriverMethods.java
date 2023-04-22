package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.tesla.com");// önce tesa ya gider

        System.out.println(driver.getTitle());// sayfanın basligina yazdır
        System.out.println(driver.getCurrentUrl());// sayfanın url ine yazdır

        driver.get("https://www.amazon.com");// sonra amazona gider

        System.out.println("sayfa başlıgı" +driver.getTitle()); //içinde bulundugum sayfanın baslıgını yazdırır
        System.out.println("sayfa url i "+driver.getCurrentUrl());//içinde bulundugumuz ssayfanın url ini yazdırır

        System.out.println("sayfanın Handle degeri="+driver.getWindowHandle());// sayfanın windowhandle degerini yazdırır





    }
}
