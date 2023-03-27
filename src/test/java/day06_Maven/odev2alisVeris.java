package day06_Maven;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class odev2alisVeris {
    public static void main(String[] args) throws InterruptedException {

        //"https://www.saucedemo.com" Adresine gidin
//Username kutusuna "standard_user" yazdirin
//Password kutusuna "secret_sauce" yazdirin
//Login tusuna basin
//Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
//Add to Cart butonuna basin
//Alisveris sepetine tiklayin
//Sectiginiz urunun basarili olarak sepete eklendigini control edin
//Sayfayi kapatin

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //"https://www.saucedemo.com" Adresine gidin
        driver.get("https://www.saucedemo.com");

//Username kutusuna "standard_user" yazdirin
        driver.findElement(By.xpath("//*[@id='user-name']")).sendKeys("standard_user");

//Password kutusuna "secret_sauce" yazdirin
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("secret_sauce");
//Login tusuna basin
        driver.findElement(By.xpath("//*[@id='login-button']")).click();
//Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement ilkUrun = driver.findElement(By.xpath("//*[@id='item_4_title_link']"));
        System.out.println(ilkUrun.getText());
        ilkUrun.click();
//Add to Cart butonuna basin
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack']")).click();
//Alisveris sepetine tiklayin
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='shopping_cart_link']")).click();
//Sectiginiz urunun basarili olarak sepete eklendigini control edin
        Thread.sleep(3000);
        String expected = "Sauce Labs Backpack";
        String actual = driver.findElement(By.xpath("//*[@class='inventory_item_name']")).getText();
        if (actual.equals(expected)) {
            System.out.println("Urun dogru");
        } else
            System.out.println("Urun YANLIS");

//Sayfayi kapatin
        driver.close();
    }
}