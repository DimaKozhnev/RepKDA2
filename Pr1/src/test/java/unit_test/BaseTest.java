package unit_test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void preTest()
    {
        System.out.println("Начало");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("окончание");
    }


}
