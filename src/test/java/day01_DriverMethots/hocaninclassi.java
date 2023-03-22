package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class hocaninclassi {

    public static void main(String[] args) {
       // System.setProperty("ChromeDriver", "src/resources/driver/chromedriver.exe");
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        //System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
        //Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
        //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz

        System.out.println(System.getProperty("ChromeDriver"));
        //getProperty methodu ile "Key değerini girerek "value"'ya ulaşabilirim

        WebDriver driver = new ChromeDriver();//Boş bir browser açar

        driver.get("https://tesla.com");//get() methodu ile adresini belittiğimiz sayfaya gideriz

        System.out.println("Sayfa Başlığı = "+driver.getTitle()); // içinde bulunduğumuz sayfanın başlığını verir

        System.out.println("Sayfa Url'i = "+driver.getCurrentUrl()); //içinde bulunduğumuz sayfanın url'i verir
        //System.out.println(driver.getPageSource());//içinde bulunduğumuz sayfanın html kodlarını verir




    }

}
