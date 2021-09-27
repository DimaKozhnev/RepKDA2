package solution;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution4 {

    public static void main(String[] args) {
        int[] arrayIn = new int[]{-10,3,9,-1,6,1,0};
        int[] result = positiveArray(arrayIn);
        Solution3.vewInt(result);


    }
    public static int[] positiveArray(int[] inArray)
    {
       List<Integer> list =  new LinkedList<>();
       for(int i:inArray)
       {
           if(i>=0)
               list.add(i);
       }
       Collections.sort(list);
       return Solution3.listToArrInt(list);

    }
}
