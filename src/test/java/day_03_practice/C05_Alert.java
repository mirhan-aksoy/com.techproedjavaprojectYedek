package day_03_practice;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;
public class C05_Alert {
    //http://demo.guru99.com/test/delete_customer.php adresine gidin
    //customer id kısmına 53920 yazın
    //submit butonuna tıklayın
    //cıkan alert mesajını yazdırın
    //alerti kabul edin
    //cıkan 2. alert mesajını yazdırın
    //cıkan 2. alerti kabul edin
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDown() throws Exception {
        // driver.close();
    }
    @Test
    public void name() throws InterruptedException {
        //http://demo.guru99.com/test/delete_customer.php adresine gidin
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        Thread.sleep(2000);

        //customer id kısmına 53920 yazın
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
        Thread.sleep(2000);

        //submit butonuna tıklayın
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        Thread.sleep(2000);

        //cıkan alert mesajını yazdırın
        String alertYazisi = driver.switchTo().alert().getText();
        System.out.println("ALERT YAZISI: " + alertYazisi);
        Thread.sleep(2000);

        //alerti kabul edin
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //cıkan 2. alert mesajını yazdırın
        //ALERT VARSA switchto ile driver ı ALERT e gçiriyorum
        String alertYazisi2 = driver.switchTo().alert().getText();
        System.out.println("ALERT YAZISI: " + alertYazisi2);

        Thread.sleep(2000);


        //cıkan 2. alerti kabul edin
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
}
