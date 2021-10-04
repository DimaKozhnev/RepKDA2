package unit_test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import solution.Task;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TaskTest {
    Task test = new Task();

    //num = 2 - "2"
    //num = 3 , 9,  - «foo»
    //num = 5, 20 - «bar»
    //num = 15, 30 -  «foobar»
    // num = Integer.MAX_VALUE -
    //
    // Реализуйте функцию, которая для заданного числа (int) печатает
    // «foo», если это число делится на 3 без остатка, печатает «bar»,
    // если это число делится на 5 без остатка, печатает «foobar»,
    // если это число делится на 15 без остатка, печатает
    // само число в остальных случаях.
    private final PrintStream OLD = System.out;
    private ByteArrayOutputStream baos;

    @BeforeTest
    public void prepare() {
        System.out.println("Start test");
        baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos, true);
        System.setOut(printStream);
    }
    @DataProvider
    public Object[][] date() {
        return new Object[][]{
                {1,"1"},
                {3,"foo"},
                {5,"bar"},
                {15,"foobar"},};

    }
    @Test( dataProvider = "date")
    public void checkX(Integer locale, String expectedResult) {
        baos.reset();
        test.printingTheWord(locale);
        final String actualResult = baos.toString().substring(0,baos.toString().length()-2);
        Assert.assertEquals(actualResult,expectedResult);
    }


    @Test(expectedExceptions = IllegalArgumentException.class, description = "Check 1")
    public void check5() {

        test.printingTheWord(-1);

    }

    @AfterTest
    public void after() {
        System.setOut(OLD);
        System.out.println("End test");

    }

}


