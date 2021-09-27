package unit_test;

import org.testng.annotations.Test;

public class first_test extends BaseTest {
    @Test
    public  void doSomemthing()
    {
        System.out.println("XYZ");
    }
    @Test(description = "Check 1")
    public  void checkSome()
    {
        System.out.println("XRN");
    }
}
