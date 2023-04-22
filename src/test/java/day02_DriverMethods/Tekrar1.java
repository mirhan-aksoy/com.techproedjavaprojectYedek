package day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tekrar1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        System.out.println("sayfa konumu" +driver.manage().window().getPosition());
        System.out.println("sayfa boyutları" +driver.manage().window().getSize());

        driver.manage().window().maximize();//sayfayı maximize olarak actı maxi:cerceveli, fullsecren cercevesiz

        driver.get("https://tesla.com");
        System.out.println("sayfa konumu" +driver.manage().window().getPosition());
        System.out.println("sayfa boyutları" +driver.manage().window().getSize());

        driver.manage().window().minimize();// sayfayı asagıya indirir
        Thread.sleep(3000);

        driver.manage().window().fullscreen();

        System.out.println("sayfa konumu" +driver.manage().window().getPosition());
        System.out.println("sayfa boyutları" +driver.manage().window().getSize());
        driver.manage().window().setPosition(new Point(80, 50));// istdiğimiz kordinata götürür
        driver.manage().window().setSize(new Dimension(600,600));//istediğimiz size a getirir
        driver.close();
    }
}
