package unit_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import solution.Solution11;

public class test11 {
    Solution11 sol= new Solution11();
    @Test
    public void evenArrayTest1()
    {
        int[] insetData = new int[]{1,2,5,4,0,3};
        int[] expectedResult = new int[]{2,4};
        int[] actualResult = sol.evenArray(insetData);
        Assert.assertEquals(expectedResult,actualResult,"error Test1");
    }
    @Test
    public void evenArrayTest2()
    {
        int[] insetData = new int[6];
        int[] expectedResult = new int[0];
        int[] actualResult = sol.evenArray(insetData);
        Assert.assertEquals(expectedResult,actualResult,"error Test1");
    }
}
