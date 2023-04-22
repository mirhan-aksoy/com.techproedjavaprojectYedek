package day01_DriverMethots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tekrar {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromeDriver","src/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        //yotube a gidelim
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);
/*
        System.out.println("sayfa url i"+driver.getCurrentUrl());
        Thread.sleep(2000);

        System.out.println("sayfa başlığı"+driver.getTitle());
        Thread.sleep(2000);

        System.out.println("sayfanın hash kodu"+driver.hashCode());

        System.out.println(driver.getWindowHandle());
*/
        driver.navigate().to("https://www.google.com");



    }
}
