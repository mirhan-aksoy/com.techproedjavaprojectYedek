package day16_SeleniumExceptions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C01_NoSuchElementException extends TestBase {
    @Test
    public void NoSuchElementException() {
        /*
        NoSuchElementException;
            -Sayfada bulunmayan bir elemente erişim sağlamaya çalışıldığında karşılaşılır
         */
        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        bekle(5);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();//Reklam kapatmak için

        //SearchBox elementini locate edelim
        driver.findElement(By.xpath("//*[@type='ssearch']")).sendKeys("java", Keys.ENTER);
        //org.openqa.selenium.NoSuchElementException: Webelementin locatini değiştirdiğimiz için 21. satırda
        //NoSuchElementException hatası aldık
        //SearchBox'ın locatini yeniden almamız gerekir
    }
}