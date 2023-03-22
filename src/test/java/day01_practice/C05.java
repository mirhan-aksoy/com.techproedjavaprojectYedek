package day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C05 {
    public static void main(String[] args) {
        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz
        // sayfayi kapatiniz

        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // maximize iken pencere konumunu ve pencere olcusunu yazdiriniz
        driver.manage().window().maximize();
        System.out.println("maximize pencere konumu" + driver.manage().window().getPosition());
        System.out.println("maximize pencere ölçüsü" + driver.manage().window().getSize());

        // fullscreen iken pencere konumunu ve pencere olcusunu yazdiriniz

        driver.manage().window().fullscreen();
        System.out.println("fullscreen pencere konumu" + driver.manage().window().getPosition());

        System.out.println("fullscreen pencere ölçüsü" + driver.manage().window().getSize());
        // sayfayi kapatiniz
        driver.close();


    }
}
