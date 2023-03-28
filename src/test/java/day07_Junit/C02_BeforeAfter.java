package day07_Junit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class C02_BeforeAfter {
    @Before
    public void setUp() {
        System.out.println("Her test methodu öncesi bir kez çalışır");
    }
    @After
    public void tearDown() {
        System.out.println("Her test methodu sonrası bir kez çalışır");
    }

    @Test
    public void test01(){
        System.out.println("ilk Test");
    }
    @Test
    public void test02() {
        System.out.println("ikinci Test");
    }
}
