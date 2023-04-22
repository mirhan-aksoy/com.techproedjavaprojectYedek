package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hocaninchromeclasi {


        public static void main(String[] args) {
            //System.setProperty("edgeDriver","src/resources/driver/msedgedriver.exe");
            System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
            //System.setProperty java uygulamalarında sistem özelliklerini ayarlamak için kullanılır
            //Bu method ile class'ımıza webdriver'in fiziki yerini belirtiriz
            //Key, value olarak önce isim sonra driver'imizin yolunu belirtiriz
           /* System.out.println(System.getProperty("edgeDriver"));

            */
            //getProperty methodu ile "Key değerini girerek "value"'ya ulaşabilirim
            //WebDriver driver = new EdgeDriver();//Boş bir browser açar
            WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
            driver.get("https://techproeducation.com");//get() methodu ile adresini belittiğimiz sayfaya gideriz
            System.out.println("Sayfa Başlığı = "+driver.getTitle()); // içinde bulunduğumuz sayfanın başlığını verir
            System.out.println("Sayfa Url'i = "+driver.getCurrentUrl()); //içinde bulunduğumuz sayfanın url'i verir
            //System.out.println(driver.getPageSource());//içinde bulunduğumuz sayfanın html kaynak kodlarını verir

        driver.close();

        }

    }


