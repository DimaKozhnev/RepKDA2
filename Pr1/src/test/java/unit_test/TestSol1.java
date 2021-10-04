package unit_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import solution.Solution1;

public class TestSol1 extends BaseTest {


    @DataProvider(name = "dataArruy")
    public Object[][] dataArruy() {
        return new Object[][]{
                {new DataTestS1(new int[]{1, 5, 7}, new int[]{7, 9, 0}), new int[]{0, 1, 5, 7, 7, 9}},
                {new DataTestS1(new int[]{6, 5, 4}, new int[]{2, 3, 1}), new int[]{1, 2, 3, 4, 5, 6,}},
        };
    }

    @Test(dataProvider = "dataArruy", groups = "group1")
    public void testPreobr(DataTestS1 locale, int[] exceptid) {
        int[] actualResult = Solution1.preobr(locale.getArrayIn1(), locale.getArrayIn2());
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, exceptid);

    }
}
