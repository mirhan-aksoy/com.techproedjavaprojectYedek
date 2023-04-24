package day21_JSExecuter;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C04_JSExecuter_GetValue extends TestBase {
//  1)getValueTest metotu olustur
//	2)https://www.priceline.com/ a git
//  3)Tarih kısmındaki Yazili metinleri al ve yazdır

    @Test
    public void getValueJSTest(){
//	https://www.priceline.com/ a git
        driver.get("https://www.carettahotel.com/");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

//  Tarih kısmındaki Yazili metinleri al ve yazdır
        getValueByJS("checkin_date","name");


    }
}