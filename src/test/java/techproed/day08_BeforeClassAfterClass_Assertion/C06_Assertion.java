package techproed.day08_BeforeClassAfterClass_Assertion;

import org.junit.Assert;
import org.junit.Test;
public class C06_Assertion {
    /*
    Assertionlarda eşitlik için expected,actual olarak kullanılır
     */
    @Test
    public void test01() {
        Assert.assertEquals(2,2);
        System.out.println("Test başarılı bir şekilde çalıştı");
    }
    @Test
    public void test02() {
        Assert.assertEquals(3,2);
        System.out.println("Test başarılı bir şekilde çalıştı");
    }
    @Test
    public void test03() {
        Assert.assertNotEquals(5,4);
        System.out.println("Test başarılı bir şekilde çalıştı");
    }
    @Test
    public void test04() {
        String actualName = "erol";
        String expectedName = "Erol";
        Assert.assertEquals(expectedName,actualName);
        System.out.println("Test başarılı bir şekilde çalıştı");
    }
}