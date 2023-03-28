package day07_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class odev {
    /*
     https://www.facebook.com
  adresine gidin
 Cookies'i kabul edin
 "Create an Account" button'una basin
 "radio buttons" elementlerini locate edin
 Secili degilse cinsiyet butonundan size uygun olani secin
      */
    WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Test Baslamıstır");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Test Bıtmıstır");
    }

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void test01() {
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
    }
/*
    @Test
    public void test02() {
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        WebElement women = driver.findElement(By.xpath("//*[text()='Kadın']"));
        WebElement man = driver.findElement(By.xpath("//*[text()='Erkek']"));
        WebElement special = driver.findElement(By.xpath("//*[text()='Özel']"));

        if (!man.isSelected()) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            man.click();
        }

    }

 */
}