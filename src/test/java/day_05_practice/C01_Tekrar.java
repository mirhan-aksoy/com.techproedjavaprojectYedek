package day_05_practice;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class C01_Tekrar {


    // https://amazon.com adresine gidiniz
    // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
    // Change country/region butonuna basiniz
    // United States dropdown'undan 'Turkey (Türkiye)' seciniz
    // Go to website butonuna tiklayiniz
    // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz
    WebDriver driver ;

    @Test
    public void test01() throws InterruptedException {
        // https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");
        String sayfa1Handle = driver.getWindowHandle();
    }


}
