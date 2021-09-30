package unit_test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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

    //num 3 - 2
    @Test
    public void check1() {
        baos.reset();
        String expectedResult = "2";
        test.printingTheWord(2);
        System.out.flush();

        String actualResult = baos.toString().substring(0,baos.toString().length()-2);

        Assert.assertEquals(actualResult,expectedResult, "not corrected XXX");
    }

    //num 3 - «foo»
    @Test
    public void check2() {
        baos.reset();
        String expectedResult = "foo";
        test.printingTheWord(3);
        String actualResult = baos.toString().substring(0,baos.toString().length()-2);
        Assert.assertEquals( actualResult,expectedResult, "not corrected XXX");

    }

    //num 5 - «bar»
    @Test
    public void check3() {
        baos.reset();
        String expectedResult = "bar";
        test.printingTheWord(5);
        String actualResult = baos.toString().substring(0,baos.toString().length()-2);
        Assert.assertEquals(actualResult,expectedResult, "not corrected XXX");

    }

    //num = 15 -  «foobar»
    @Test
    public void check4() {
        baos.reset();
        String expectedResult = "foobar";
        test.printingTheWord(15);
        String actualResult = baos.toString().substring(0,baos.toString().length()-2);
        Assert.assertEquals(actualResult,expectedResult, "not corrected XXX");

    }

    // -1
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


