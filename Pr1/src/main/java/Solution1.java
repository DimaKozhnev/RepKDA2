import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        int[] x = new int[]{0,2,2};
        int[] y = new int[]{1,3};

        int[] result = preobr(x,y);
        for (int j : result) {
            System.out.println(j);
        }

    }
    public static int[] preobr(int[] x, int[] y )
    {
        List<Integer> list =  new ArrayList<>();
        list.addAll(Solution3.arrToListInt(x));
        list.addAll(Solution3.arrToListInt(y));
        Collections.sort(list);
        return Solution3.listToArrInt(list);
    }
}
