package day17_ScreenShot.day21_JSExecuter;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_JSExecuter_Scroll extends TestBase {

        /*
        Techpro education ana sayfasına git
        "We Offer" elementi görünür olacak şekilde üzerine scroll et ve ekran görüntüsünü al
        Aynı sayfada "Enroll Free "elementi görünür olacak sekilde scroll et ve ekran görüntüsünü al
        Aynı sayfada "WHY US?" elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
        Aynı sayfada tekrar "Enroll Free" elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
         */

    @Test
    public void jSExecuterScrollTest() {
//        Techpro education ana sayfasına git
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

//        "We Offer" elementi görünür olacak şekilde üzerine scroll et ve ekran görüntüsünü al
        WebElement weOffer = driver.findElement(By.xpath("//span[.='we offer']"));

        bekle(3);

        scrollIntoView(weOffer);//scrollIntoView() ==> TestBase classındaki method
        tumSayfaResmi();
        bekle(3);

//        Aynı sayfada "Enroll Free" elementi görünür olacak sekilde scroll et ve ekran görüntüsünü al
        WebElement enrollFree = driver.findElement(By.xpath("//span[.='Enroll Free Course']"));
        scrollIntoView(enrollFree);
        tumSayfaResmi();
        bekle(3);

//        Aynı sayfada "WHY US?" elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
        WebElement whyUs = driver.findElement(By.xpath("//h3[.='WHY US?']"));
        scrollIntoView(whyUs);
        tumSayfaResmi();
        bekle(3);

//        Aynı sayfada tekrar "Enroll Free" elementi görünür olacak şekilde scroll et ve ekran görüntüsünü al
        scrollIntoView(enrollFree);
        tumSayfaResmi();
        bekle(3);

        //Sayfayı en alta kaydır:
        scrollEndJS();
        bekle(3);

        //Sayfayı en üste kaydır:
        scrollTopJS();

    }

    private void scrollEndJS() {
    }

    private void scrollTopJS() {
    }

    private void scrollIntoView(WebElement enrollFree) {
    }
}