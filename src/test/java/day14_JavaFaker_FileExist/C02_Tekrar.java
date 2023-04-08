package day14_JavaFaker_FileExist;

import com.github.javafaker.Faker;
import org.junit.Test;
import utilities.TestBase;

public class C02_Tekrar  {
    @Test
    public void JavaFakerTest(){

        //1 Faker objesi olustur ----faker data veriyor
       Faker faker= new Faker();

       //Yada Faker.instance() static metodu ile baslayabiliriz.
        Faker.instance();

        //Firstname yzdırın
        System.out.println(faker.name().firstName());

        //Lastname yazdırın
        System.out.println(Faker.instance().name().lastName());//stataic metot ile
        System.out.println(faker.name().lastName());

        //kullanıcı adı yazdırın
        System.out.println(faker.name().username());

        //funny name yazdırın
        System.out.println(faker.funnyName().name());

        //meslek ismi
        System.out.println(faker.name().title());

        //sehir ismi yazdırın
        System.out.println(faker.address().city());

        //eyalet yazdırın
        System.out.println(faker.address().state());

        //full adres
        System.out.println(faker.address().fullAddress());

        //cep numarası
        System.out.println(faker.phoneNumber().cellPhone());

        //Email yazdırın
        System.out.println(faker.internet().emailAddress());

        //posta kodu
        System.out.println(faker.address().zipCode());

        //rastgele 15 haneli numara yazdırın
        System.out.println(faker.number().digits(15));

    }


}
