package day14_JavaFaker_FileExist;


import com.github.javafaker.Faker;
import org.junit.Test;

public class C02_JavaFaker {

    @Test
    public void javaFakerTest() {

        //1. Faker objesi oluştur:
        Faker faker = new Faker();

        //Yada Faker.instance() static metodu ile başlayabiliriz.
        Faker.instance();

        //Firstname yazdırın:
        System.out.println(faker.name().firstName());

        //Lastname yazdırın:
        //System.out.println(Faker.instance().name().lastName());
        System.out.println(faker.name().lastName());

        //Kullanıcı adı yazdırın:
        System.out.println(faker.name().username());

        //Funny Name yazdırın:
        System.out.println(faker.funnyName().name());

        //Meslek ismi yazdırın:
        System.out.println(faker.name().title());

        //Şehir ismi yazdırın:
        System.out.println(faker.address().city());

        //Eyalet yazdırın:
        System.out.println(faker.address().state());

        //Full Address yazdırın:
        System.out.println(faker.address().fullAddress());

        //Cep numarası yazdırın:
        System.out.println(faker.phoneNumber().cellPhone());

        //Email yazdırın:
        System.out.println(faker.internet().emailAddress());

        //Posta kodu yazdırın:
        System.out.println(faker.address().zipCode());

        //Rastgele 15 haneli numara yazdırın:
        System.out.println(faker.number().digits(15));

    }
}
