package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03_WebelementLocators {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //web sayfasına gidin. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Search(ara) “city bike”
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike", Keys.ENTER);

        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> sonucYazisi = driver.findElements(By.className("sg-col-inner"));
        System.out.println("Sonuc Yazısı : "+sonucYazisi.get(0).getText());

        //Sadece sonuc sayısını yazdıralım
        String [] sonucSayisi = sonucYazisi.get(0).getText().split(" ");//Sonuc yazısını boşluklardan boldum
        System.out.println("SonucSayisi = "+sonucSayisi[2]);

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        List<WebElement> sonuclar = driver.findElements(By.xpath("//h2//a"));
        sonuclar.get(0).click();

        driver.close();
    }
}