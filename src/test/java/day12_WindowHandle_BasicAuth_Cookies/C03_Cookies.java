package day12_WindowHandle_BasicAuth_Cookies;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class C03_Cookies extends TestBase {
    /*
    1-Amazon anasayfaya gidin
    2-tum cookie’leri listeleyin
    3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
    4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
    5-ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie  olusturun ve sayfaya ekleyin
    6-eklediginiz cookie’nin sayfaya eklendigini test edin
    7-ismi skin olan cookie’yi silin ve silindigini test edin
    8-tum cookie’leri silin ve silindigini test edin
     */

    @Test
    public void cookiesTest() {
//        1-Amazon anasayfaya gidin
        driver.get("https://amazon.com");

//        2-tum cookie’leri listeleyin
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie w : allCookies) {
            System.out.println(w);
            System.out.println(w.getName());
        }

        //allCookies.stream().forEach(t-> System.out.println(t));

//        3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int tumCookieSayisi = allCookies.size();
        System.out.println("tumCookieSayisi = " + tumCookieSayisi);
        assertTrue(allCookies.size() > 5);

//        4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String cookieValue = driver.manage().getCookieNamed("i18n-prefs").getValue();
        assertEquals("USD", cookieValue);

//        5-ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie  olusturun ve sayfaya ekleyin
        Cookie yeniCookie = new Cookie("en sevdigim cookie", "cikolatali");
        driver.manage().addCookie(yeniCookie);
        System.out.println(driver.manage().getCookies().size());

//        6-eklediginiz cookie’nin sayfaya eklendigini test edin
        String yeniCookieValue = driver.manage().getCookieNamed("en sevdigim cookie").getValue();
        assertEquals("cikolatali", yeniCookieValue);

//        7-ismi skin olan cookie’yi silin ve silindigini test edin
        int cookieSilinmedenOnce = driver.manage().getCookies().size();
        driver.manage().deleteCookieNamed("skin");
        int cookieSilindiktenSonra = driver.manage().getCookies().size();
        assertEquals(1, (cookieSilinmedenOnce - cookieSilindiktenSonra));

//        8-tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        assertEquals(0, driver.manage().getCookies().size());

    }
}