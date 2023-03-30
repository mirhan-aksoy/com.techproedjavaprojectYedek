package day08_Assertion_DropDown;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class TekrarTest_Class extends TekrarBeforeClassAfterClass {

        //    1)https://www.facebook.com adresine gidin ve yeni hesap olustura basin
        //          ○ Sayfa başlığının “Facebook” oldugunu test edin
        //          ○ Kaydol butonunun görüntülendiğini (isDisplayed()) test edin
        //          ○ Name'in erisilebilir oldugunu test edin (isEnabled())
        //          ○ wrongTitleTest => Sayfa basliginin “face” icermedigini dogrulayin
        //          ○ Index kullanarak Dogum Tarihi gun kismini (Option 1) seçin ve yazdırın
        //          ○ Value kullanarak Dogum Tarihi yil kismini (Option 2) seçin ve yazdırın
        //          ○ Visible Text(Görünen metin) kullanarak Dogum Tarihi ay kismini (Option 1) seçin ve yazdırın
        //          ○ Ay secenegindeki tüm dropdown değerleri(value) yazdırın
        //          ○ Dropdown’un boyutunu bulun, Dropdown’da 4 öğe varsa konsolda True ,degilse False yazdırın.


    @Test
    public void title01() {
        String actualTitle =driver.getTitle();
        String expected ="Facebook";
        Assert.assertTrue(actualTitle.contains(expected));

    }

    @Test
    public void isDisplayed() {
        WebElement buton = driver.findElement(By.xpath("//button[text()='Kaydol']"));
        Assert.assertTrue(buton.isDisplayed());
    }

    @Test
    public void isEnabled() {
        //input[@id='u_0_b_0D']
        WebElement isim = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        Assert.assertTrue(isim.isEnabled());
    }

    @Test
    public void title02() {
        String actualTitle =driver.getTitle();
        String expected ="facebook";
        Assert.assertFalse(actualTitle.contains(expected));

    }

    @Test
    public void dropDownDay() {
        WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        Select dayDD=new Select(day);
        dayDD.selectByIndex(29);
    }

    @Test
    public void dropDownYear() {
        WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
        Select yearDD = new Select(year);
        yearDD.selectByValue("2020");
    }

    @Test
    public void dropDownMonth() {
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthDD= new Select(month);
        monthDD.selectByVisibleText("Tem");
    }

    @Test
    public void getOptions() {
        WebElement allMonth = driver.findElement(By.xpath("//select[@id='month']"));
        Select allMonthDD= new Select(allMonth);
        List<WebElement> list= allMonthDD.getOptions();
        for (WebElement each:list) {
            System.out.println("=>"+each.getText());

        }
        list.forEach(t-> System.out.println(t.getText()));
    }

    @Test
    public void monthSize01() {
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select monthDD = new Select(month);
        List<WebElement> list =monthDD.getOptions();
        int actualBoyut=list.size();
        System.out.println("actualBoyut = " + actualBoyut);
        int expectedBoyut=12;
        Assert.assertEquals(actualBoyut,expectedBoyut);
    }
}