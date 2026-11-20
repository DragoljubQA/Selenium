import org.testng.annotations.*;

public class Zadatak5 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Dobrodosli na kurs");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Ucim za test");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("SQL");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Java");
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("Selenium");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Polozen test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Polozen kurs");
    }
}
