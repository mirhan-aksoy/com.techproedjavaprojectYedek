package day17_ScreenShot;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;
import java.io.File;
import java.io.IOException;
public class C01_ScreenShot extends TestBase {
    @Test
    public void screenShotTest() throws IOException {
        /*
            Tüm ekran görüntüsünü Selenium'dan gelen getScreenShotAs methodu ile alırız.
        Bu method selenium'daki TakesScreenshot arayüz'ünden(interface) gelir
         */
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //İlk olarak dosyayı nereye kaydediceğimizi belirtiriz
        String dosyaYolu = "screenShot.png";

        //TakesScreenshot arayüzünden obje oluşturmak
        TakesScreenshot ts = (TakesScreenshot) driver;

        /*
            FileUtils class'ı file nesneleri ile birlikte kullanabileceğimiz methodlar içerir.
        Bu methodları kullanarak dosyalarda okuma, yazma, kopyalama ve silme işlemlerini çok daha kolay yapabiliriz
        NOT: Files.write() methodu'da aynı işlemi görür
         */
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));


        //Ekran resmini projemize kaydedelim
    }
}
