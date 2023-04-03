package day10_Alert_Iframe;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import practice_day02.utilities.TestBase;

public class TekrarCalismasi extends TestBase {
    //➢   https://testcenter.techproeducation.com/index.php?page=iframe
    //➢   Ana sayfadaki 'An iframe with a thin black border:' metninde 'black border' yazisinin   oldugunu test edelim
    //➢   Ayrica 'Applications lists' yazisinin sayfada oldugunu test edelim

    @Test
    public void test01() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");
        //➢   Ana sayfadaki 'An iframe with a thin black border:' metninde 'black border' yazisinin   oldugunu test edelim
        // String actual= driver.findElement(By.xpath("//p[text()='An iframe with a thin black border:']")).getText();
        // Assert.assertTrue(actual.contains("black border"));
        //➢   Ayrica 'Applications lists' yazisinin sayfada oldugunu test edelim
          WebElement frame=driver.findElement(By.xpath("//iframe"));
        /////driver.switchTo().frame("//iframe");
       // ///String actual1=driver.findElement(By.cssSelector("[class='display-5 fw-bold']")).getText();
       //// Assert.assertTrue(actual1.contains("Applications lists"));
        //    driver.switchTo().defaultContent();
        //➢   Son olarak footer daki 'Povered By' yazisini varligini test edilip
        // String textpover=  driver.findElement(By.xpath("//*[text()='Povered By']")).getText();
        // Assert.assertTrue(textpover.contains("Povered By"));




    }
}