package techproed.day07_MavenJUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {



        /*
            Notasyonlara sahip methodlar olusturabilmek icin mouse + sag tik + generate(kisayol alt+insert) yaparak
        after methodu icin teardow'u seceriz.
        before method'u icin setup'u seceriz.
        test method'u icin de test'i seceriz.
            Junit frameworkunde testlerimizi siralama yapabilmek icin ekstra bir notasyon yoktur eger belli bir siralamada calistirmak istersek
        method isimelerini alfabetik ve sayisal olarak belirtmemiz gerekir
         */
        @After
        public void tearDown(){
            System.out.println("Her test methodundan sonra bir kez calisir");

        }


    @Before
    public void setUp(){
        System.out.println("Her test methodundan once bir kez calisir.");
    }

    @Test
    public void test1() {
        System.out.println("Test1 methodu calisti.");
    }

    @Test
    public void test2() {
        System.out.println("Test2 methodu calisti.");
    }

    @Test
    public void test3() {
        System.out.println("Test3 methodu calisti.");
    }
}
























