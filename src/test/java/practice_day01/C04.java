package practice_day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C04 {
    public static void main(String[] args) {
        // https://www.amazon.com/ adresine gidin
        // Kaynak Kodlarini konsola yazdiriniz
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        // sayfayi kapatiniz

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();

        // https://www.amazon.com/ adresine gidin

        driver.get("https://www.amazon.com/");

        // Kaynak Kodlarini konsola yazdiriniz
       String sayfaKaynakKodlari= driver.getPageSource();
        System.out.println(sayfaKaynakKodlari);
        // Kaynak Kodlarinda "Gateway" yazdigini test edin
        if(sayfaKaynakKodlari.contains("Gateway")){
            System.out.println("sayfakaynakkodlarında Gateway içeriyor");
        }else {
            System.out.println("içermiyor");
        }
        // sayfayi kapatiniz
        driver.close();
    }
}
