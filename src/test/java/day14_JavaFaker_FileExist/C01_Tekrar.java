package day14_JavaFaker_FileExist;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Tekrar extends TestBase {
    /*
    "https://techproeducation.com/" gidin
    İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.
     */

    @Test
    public void actionsTest(){
        //"https://techproeducation.com/"
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//reklamı kapat

   // İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.
       WebElement aramakutusu= driver.findElement(By.xpath("//input[@name='s']"));

       Actions actions= new Actions(driver);

       actions
               .keyDown(aramakutusu,Keys.SHIFT)
               .sendKeys("techpro").
               keyUp(Keys.SHIFT)
               .sendKeys("education"+Keys.ENTER)
               .build()
               .perform();




    }

}
