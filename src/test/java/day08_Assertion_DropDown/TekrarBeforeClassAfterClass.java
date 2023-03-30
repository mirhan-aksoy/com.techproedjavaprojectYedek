package day08_Assertion_DropDown;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TekrarBeforeClassAfterClass {
    WebDriver driver;
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Testimiz Baslamistir");
    }

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().setSize(new Dimension(800,1250));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();

    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Testimiz Basarili Bir Sekilde Sonlanmistir");
    }
}