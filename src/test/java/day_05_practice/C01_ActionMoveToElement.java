package day_05_practice;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;
import java.util.Set;
public class C01_ActionMoveToElement extends TestBase {
    // https://amazon.com adresine gidiniz
    // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
    // Change country/region butonuna basiniz
    // United States dropdown'undan 'Turkey (Türkiye)' seciniz
    // Go to website butonuna tiklayiniz
    // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz
    @Test
    public void test01() throws InterruptedException {
        // https://amazon.com adresine gidiniz
        driver.get("https://amazon.com");
        String sayfa1Handle = driver.getWindowHandle();
        // sag ust bolumde bulunan dil secenek menusunun acilmasi icin mause'u bu menunun ustune getirelim
        WebElement dilMenu = driver.findElement(By.xpath("//div[text()='EN']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(dilMenu).perform();
        Thread.sleep(3000);
        // Change country/region butonuna basiniz
        driver.findElement(By.xpath("(//div[@class='icp-mkt-change-lnk'])[1]")).click();
        // United States dropdown'undan 'Turkey (Türkiye)' seciniz
        WebElement ddm = driver.findElement(By.xpath("//select[@id='icp-dropdown']"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Turkey (Türkiye)");
        Thread.sleep(3000);
        /*
        Drop down option listesi 'Go to website' butonuna basmamıza engel oldugu icin
        herhangi bir yere click yapıp drop down option listesinin toparlanmasını saglıyoruz
         */
        driver.findElement(By.xpath("//span[text()='Changing country/region website']")).click();
        Thread.sleep(3000);
        // Go to website butonuna tiklayiniz
        driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
        // acilan yeni sayfadanin Title'inin Elektronik icerdigini test ediniz
        Set<String> windowHandlesSeti = driver.getWindowHandles();
        System.out.println(windowHandlesSeti);
        System.out.println(sayfa1Handle);
        String sayfa2Handle="";
        for (String each:windowHandlesSeti) {
            if(!each.equals(sayfa1Handle)){
                sayfa2Handle = each;
            }
        }
        driver.switchTo().window(sayfa2Handle);
        String ikinciSayfaTitle = driver.getTitle();
        System.out.println("İKİNCİ SAYFA TİTLE: " +ikinciSayfaTitle);
        Assert.assertTrue(ikinciSayfaTitle.contains("Elektronik"));
    }
}
