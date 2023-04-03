package day12_WindowHandle_BasicAuth_Cookies;

import org.junit.Test;
import org.openqa.selenium.WindowType;
import practice_day02.utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class C01_WindowHandle extends TestBase {
    /*
 https://www.techproeducation.com adresine gidiniz
 Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
 Tab 2'de https://www.google.com sayfasını açınız
 Tab 3'te https://www.linkedin.com sayfasını açınız
 techproeducation sayfasına geçiniz
 youtube sayfasına geçiniz
 linkedIn sayfasına geçiniz
  */
    @Test
    public void newTabTest() {
//        https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

//        Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        assertEquals("Techpro Education | Online It Courses & Bootcamps", driver.getTitle());

//        Tab 2'de https://www.google.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");

//        Sayfa başlığının "Google" olduğunu doğrulayınız
        assertEquals("Google", driver.getTitle());

//        Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");

//        Sayfa başlığının "LinkedIn" içerdiğini doğrulayınız
        assertTrue(driver.getTitle().contains("LinkedIn"));

        //Window handle Set'ini bir List içerisine alıyoruz.
        // list bir intrface dir ve new keyword calışmaz
        List<String> windowHandleList = new ArrayList<>(driver.getWindowHandles());
        System.out.println("windowHandleList = " + windowHandleList);
        //[75084966BF2512ABA2CF06676A952316, F5FB9F667DE54DA68E6C0EADAD4C27B6, D747B0277AF08B7162ABC60258491314]

        //List ile indeks kullanarak ilgili windowHandle değerine ulaşabiliriz:
//        techproeducation sayfasına geçiniz
        bekle(3);
        driver.switchTo().window(windowHandleList.get(0));

//        google sayfasına geçiniz
        bekle(3);
        driver.switchTo().window(windowHandleList.get(1));

//        linkedIn sayfasına geçiniz
        bekle(3);
        driver.switchTo().window(windowHandleList.get(2));

    }

    @Test
    public void newTabTest2() {
//        https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");

//        Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        assertEquals("Techpro Education | Online It Courses & Bootcamps", driver.getTitle());

//        Tab 2'de https://www.google.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
        assertTrue(driver.getTitle().contains("Google"));

//        Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.linkedin.com");
        assertTrue(driver.getTitle().contains("LinkedIn"));

//        techproeducation sayfasına geçiniz
        bekle(2);
        switchToWindow(0);

//        youtube sayfasına geçiniz
        bekle(2);
        switchToWindow(1);

//        linkedIn sayfasına geçiniz
        bekle(2);
        switchToWindow(2);

    }
}