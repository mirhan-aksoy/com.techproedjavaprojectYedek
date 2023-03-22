package day02_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C02_ManageMethots {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        // her class açtığımızda kullanmayı adet ediniriz
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        // not: sayfadaki her bir web element için max 20 saniye bekler
        //Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın  (verify),
        // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://youtube.com");
        String actulaTitle = driver.getTitle();//Gerçek başlık
        String expectedTitle = "youtube";//Beklenen başlık
        if (actulaTitle.equals(expectedTitle)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Başlık : "+actulaTitle);
        //Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru  URL'yi yazdırın.
        String actualUrl = driver.getCurrentUrl();
        String beklenenKelime = "youtube";
        if (actualUrl.contains(beklenenKelime)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+actualUrl);
        //Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Youtube sayfasina geri donun
        driver.navigate().back();
        //Sayfayi yenileyin
        driver.navigate().refresh();
        //Amazon sayfasina donun
        driver.navigate().forward();
        //Sayfayi tamsayfa yapin
        //Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
        // Yoksa  doğru başlığı(Actual Title) yazdırın.
        String actualTitle = driver.getTitle();
        String istenenkelime = "Amazon";
        if(actulaTitle.contains(istenenkelime)){
            System.out.println("TEST PESSED");
        }else System.out.println("TEST FAİLED Gercek baslık" + actualTitle);
        //Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String gercekUrl = driver.getCurrentUrl();
        String istenenUrl ="https//www.amazon.com/";
        if (gercekUrl.equals(istenenUrl)){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED Gerçek Url = "+gercekUrl);

        //Sayfayi kapatin
        driver.close();










    }
}
