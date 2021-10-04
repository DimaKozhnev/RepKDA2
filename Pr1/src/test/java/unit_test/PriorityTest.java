package unit_test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import solution.Calculator;


public class PriorityTest /*extends BaseTest*/ {
    private final double FIRST_NUM = 10;
    private final double SECOND_NUM = 5;

    @BeforeTest
    public void preTest() {
        System.out.println("Начало");
    }


    @Test(priority = 2, description = "Check 1")
    public void checkAdd() {
        double expectedResult = FIRST_NUM + SECOND_NUM;
        double actualResult = Calculator.add(FIRST_NUM, SECOND_NUM);
        Assert.assertEquals(expectedResult, actualResult, "not corrected XXX");
        System.out.println("norm");

    }

    @Test(priority = 1, description = "Check 2")
    public void checkSecondMult() {
        double expectedResult = FIRST_NUM * SECOND_NUM;
        double actualResult = Calculator.errMlt(FIRST_NUM, SECOND_NUM);
        Assert.assertEquals(expectedResult, actualResult, "not corrected XXX");
        System.out.println("norm");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("окончание");
    }
}

