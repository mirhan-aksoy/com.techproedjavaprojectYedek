package day21_JSExecuter;
​
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;
​
public class C03_JSExecuter_Type extends TestBase {
    /*
Techpro education ana sayfasina git
Arama kutusuna QA yaz
 */
    @Test
    public void typeTest() {
//        Techpro education ana sayfasina git
        driver.get("https://techproeducation.com/");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();
​
//        Arama kutusuna QA yaz
        WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));
​
        typeWithJS("QA", searchBox);
        bekle(3);
​
    }
}