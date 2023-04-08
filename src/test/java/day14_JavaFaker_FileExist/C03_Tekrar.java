package day14_JavaFaker_FileExist;

import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;

public class C03_Tekrar extends TestBase {




      //Masaüstünde "logo.jpeg" dosyası oluşturun. Bu dosyanın varlığını doğrulayın.

    @Test
    public  void fileExistTest(){

        System.getProperty("user.dir");//C:\Users\lenovo\IdeaProjects\com.techproedjavaproject
        // İDE proje yolunu dinamik olarak verir

        String userHome =System.getProperty("user.home");//"C:/Users/lenovo(kullanıcı adı)
        //kullanıcı adı yolunu dinamik olarak verir

       boolean isExist= Files.exists(Paths.get(userHome+"/Desktop/logo.jpeg.jpeg"));
        System.out.println("isExist="+isExist);
        assertTrue(isExist);
        //C:\Users\lenovo\IdeaProjects\com.techproedjavaproject\src\test\java\day14_JavaFaker_FileExist\C03_Tekrar.java

        //Fail ise dosya masaüstünde değildir yada arada onedrive gibi ekstra dosyalar olabilir
    }



}
