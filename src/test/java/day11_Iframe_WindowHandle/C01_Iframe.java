package day11_Iframe_WindowHandle;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
public class C01_Iframe extends TestBase {
    /*
   https://the-internet.herokuapp.com/iframe sayfasına gidiniz
   Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
   Textbox içindeki yazıyı siliniz.
   Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
   Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
    */
    @Test
    public void iframe() {
        //https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");
        //Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
        WebElement baslikElementi = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(baslikElementi.getText().contains("Editor"));
        bekle(2);
        //Textbox içindeki yazıyı siliniz.
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.xpath("//p"));
        textbox.clear();//Textbox içindeki yazıyı sileriz
        bekle(2);
        //Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
        textbox.sendKeys("Bu textbox iFrame içinde yer almaktadır");
        bekle(2);
        //Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame();
        //driver.navigate().refresh();-->Bu methodla sayfayı yenilediğimiz için ilk bölüme tekrar geçmiş oluruz
        bekle(2);
        WebElement elementalSeleniumWE = driver.findElement(By.xpath("(//a)[3]"));
        Assert.assertTrue(elementalSeleniumWE.isDisplayed());
    }
}
