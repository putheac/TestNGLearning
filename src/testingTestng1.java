import org.testng.annotations.*;

public class testingTestng1 {


    @Test
    public void AddContactHappyPathTest() {

        System.out.println("hello world");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest");
    }
}

