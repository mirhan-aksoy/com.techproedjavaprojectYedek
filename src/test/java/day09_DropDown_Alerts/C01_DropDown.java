package day09_DropDown_Alerts;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;
public class C01_DropDown {
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }
    /*
    -DropDown Nedir : Altbaşlıkların olduğu açılır menü listesi
    -DropDown nasıl automate edilir(Handle):
           a-DropDown menuyu ilk olarak locate ederiz
           b-Select objesi oluştururuz
           c-Select objesinin ddm webelementi'nin içeriğine ve seçeneklerine
           erişim sağlaması için SELECT sınıfına arguman olarak locate ettiğimiz webelementi koyarız
           Syntax: Select select = new Select(ddm webelement)
           d-Select class'ı, sadece <select> tag'ı ile oluşturulmuş dropdown menulere uygulanabilir.
           e-select objesi ddm'yü handle edebilmek için 3 method kullanılır
                 -selectByVisibleText() ->Ddm deki elemente görünür metin ile ulaşmak için kullanılır
                 -selectByIndex() -> Index ile ulaşmak için kullanılır(Index 0 dan başlar)
                 -selectByValue() -> Elementin değeri ile ulaşmak için kullanılır(option tag'ındaki değer ile)
           f-getOptions()->Locate ettiğimiz ddm'deki tüm seçenekleri bize döndürür
           g-getFirstSelectedOption()->Ddm'deki en son seçili kalan ilk seçeneği bize döndürür
     */
    @Test
    public void test02() {
        /*
        //a. Tüm eyalet isimlerini yazdıralım
        WebElement tumEyaletler = driver.findElement(By.cssSelector("select[id='state']"));
        Select select = new Select(tumEyaletler);
        List<WebElement> stateList = select.getOptions();//Bütün options taglarını getir
        //for (WebElement w:stateList) {
        //    System.out.println(w.getText());
        // }
        stateList.forEach(t-> System.out.println(t.getText()));
         */
        //a. Tüm eyalet isimlerini yazdıralım
        List<WebElement> tumEyaletler = driver.findElements(By.xpath("//*[@id='state']//option"));
        System.out.println(tumEyaletler.get(2).getText());
        System.out.println("*****************************");
        tumEyaletler.forEach(t-> System.out.println(t.getText()));
        //b. Sayfadaki tüm ddm lerdeki tüm seçenekleri(option) konsolda yazdırınız
        System.out.println("******************************");
        List<WebElement> eyaletlerList = driver.findElements(By.tagName("option"));
        eyaletlerList.forEach(t-> System.out.println(t.getText()));
        System.out.println("*************************");
        System.out.println(tumEyaletler.size());
    }
    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
}
