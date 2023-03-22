package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C07 {
    public static void main(String[] args) throws InterruptedException {
        // https://www.amazon.com/ adresine gidin
        // arama motorunda nutella yazip aratınız
        // sayfada kac tane link oldugunu bulunuz
        // linkleri yazdiriniz
        // pencereyi kapatiniz

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        // arama motorunda nutella yazip aratınız
       // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella"+ Keys.ENTER);
      WebElement aramaMotoru= driver.findElement(By.id("twotabsearchtextbox"));
       aramaMotoru.sendKeys("nutella"+ Keys.ENTER);


        // sayfada kac tane link oldugunu bulunuz

        List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));
        System.out.println("sayfadaki linkler sayısı"+linklerListesi.size());

        // linkleri yazdiriniz
        int sayi=1;
        for(WebElement each:linklerListesi){
            System.out.println(sayi+".link"+each.getText());
            sayi++;
        }
        // pencereyi kapatiniz
        driver.close();
    }
}
