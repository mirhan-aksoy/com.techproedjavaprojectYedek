package day15_FileUpload_Waits;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class C01_FileUpload extends TestBase {
    /*
    https://the-internet.herokuapp.com/upload adresine gidin
    logo.jpeg dosyasını yükleyin(upload)
    “File Uploaded!” textinin görüntülendiğini test edin
    */

    @Test
    public void fileUploadTest() {
//        https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");

//        logo.jpeg dosyasını yükleyin(upload)
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        bekle(3);
        //"C:\Users\TechProEd\Desktop\logo.jpeg"
        chooseFile.sendKeys(System.getProperty("user.home") + "/Desktop/logo.jpeg");
        //Gönerilecek(upload) dosyanın adresini choosefile butununa senKeys() metodu ile yazıyoruz. Bu şekilde gödrilecek dosya seçilmiş olur.

        bekle(3);
        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        fileUploadButton.click();

//        “File Uploaded!” textinin görüntülendiğini test edin
        WebElement fileUploadedText = driver.findElement(By.xpath("//h3"));
        assertTrue(fileUploadedText.isDisplayed());
    }
}