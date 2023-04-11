package day_01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C02 {
    public static void main(String[] args) throws InterruptedException {

        // Pencereyi maximize yapiniz
        // "https://teknosa.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        // "https://medunna.com/" adresine gidiniz
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        // teknosa adresine geri donunuz
        // Sayfayı yenileyiniz
        // medunna adresine ilerleyiniz
        // Sayfayı yenileyiniz
        // pencereyi kapat


        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        // Pencereyi maximize yapiniz
        driver.manage().window().maximize();

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String teksonaTitle= driver.getTitle();
        System.out.println("teksona Title"+ teksonaTitle);
        String teknosaUrl =driver.getCurrentUrl();
        System.out.println("teknosaUrl"+ teknosaUrl);
        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if(teksonaTitle.contains("Teknoloji")){
            System.out.println("Title Teknoloji kelimesini içreriyor.");
        }else {
            System.out.println("Title Teknoloji içermiyor");
        }

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if(teknosaUrl.contains("teknosa")){
            System.out.println("URL teknosa içeriyor");
        }else {
            System.out.println("URL teknosa içermiyor");
        }
        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");
        Thread.sleep(2000);

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        String medunnaTitle=driver.getTitle();
        System.out.println("medunnaTitle"+ medunnaTitle);
        String medunnaurl=driver.getCurrentUrl();
        System.out.println("medunnaurl"+medunnaurl);

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if(medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title MEDUNNA içeriyor");
        }else {
            System.out.println("Title medunna içermiyor");
        }

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz

        if(medunnaurl.contains("medunna")){
            System.out.println("Url medunna içeriyor");
        }else {
            System.out.println("Url medunna içeriyor");
        }
        // teknosa adresine geri donunuz

        driver.navigate().back();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();
    }
}
