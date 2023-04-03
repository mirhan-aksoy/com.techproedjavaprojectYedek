

package day_03_practice;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Keys;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;
        import org.openqa.selenium.support.ui.Select;

        import java.time.Duration;

public class C01_Tekrar {

    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Books" secenegini secin
    // arama cubuguna "Java" aratın
    // arama sonuclarinin Java icerdigini test edin

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
    public void name() {

        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com/");


        // dropdown'dan "Books" secenegini secin

        // DropDown 3 adımda handle edilir
        //1-) DropDown locate edilmeli
        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2-) Select objesi olusturulur
        Select select = new Select(ddm);

        //3. adım 3 adet (handle etme metodundan biri kullanılır) Optionlardan bir tanesi seçilir
        //select.selectByValue("search-alias=stripbooks-intl-ship");
        // select.selectByIndex(5);
        // select.selectByVisibleText("Books");

        //3-) Optionlardan bir tanesi secilir
        // select.selectByVisibleText("Books");
        // select.selectByIndex(5);
        select.selectByValue("search-alias=stripbooks-intl-ship");

        // arama cubuguna "Java" aratın
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Java" + Keys.ENTER);

        // arama sonuclarinin Java icerdigini test edin
        WebElement aramaSonucuElementi = driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        String aramaSonucYazisi = aramaSonucuElementi.getText();

        Assert.assertTrue(aramaSonucYazisi.contains("Java"));

    }
}
