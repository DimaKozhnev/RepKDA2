package unit_test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import solution.Calculator;

public class groupTest extends BaseTest {
    private Calculator calculator = new Calculator();
    private final double FIRST_NUM = 10;
    private final double SECOND_NUM = 5;

    @Test(groups = "mult test")
    public void checkAdd() {
        double expectedResult = FIRST_NUM + SECOND_NUM+1;
        double actualResult = calculator.add(FIRST_NUM, SECOND_NUM);
        Assert.assertEquals(expectedResult, actualResult, "not corrected checkAdd");
        System.out.println("norm");

    }

    @Test(groups = "mult test" )
    public void checkSecondMult() {
        double expectedResult = FIRST_NUM * SECOND_NUM;
        //double actualResult = calculator.errMlt(FIRST_NUM, SECOND_NUM);
        double actualResult = calculator.mlt(FIRST_NUM, SECOND_NUM);
        Assert.assertEquals(expectedResult, actualResult, "not corrected checkSecondMult");
        System.out.println("norm");
    }

    @Test(groups = "console test", dependsOnMethods = "checkSecondMult")
    public  void doSomemthing()
    {
        System.out.println("XYZ");
    }
    @Test(description = "Check 1", groups = "console test", dependsOnGroups ="mult test" )
    public  void checkSome()
    {
        System.out.println("XRN");
    }

}
