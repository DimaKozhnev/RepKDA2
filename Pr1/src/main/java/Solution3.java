import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
       int[] x = new int[]{5,10,5,3,10,10,1};
        int[] result = fun1(x);
        vewInt(result);

    }
    public static int[] fun1(int[] x)
    {
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < x.length; i++)
        {
            if(map.containsKey(x[i]))
            {
                map.put(x[i], map.get(x[i])+1);
            }
            else
            {
                map.put(x[i], 1);
            }
        }
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < x.length; i++)
        {
            if(map.get(x[i])>1 )
                list.add(x[i]);
        }
        return listToArrInt(list);

    }
    public static  void vewInt( int[] x)
    {
        for (int j : x) {
            System.out.println(j);
        }
    }
    public static List<Integer> arrToListInt(int[] x)
    {
        List<Integer> list =  new ArrayList<>();
        for(int i = 0; i < x.length; i++)
        {
            list.add(i,x[i]);
        }
        return list;
    }
    public static int[] listToArrInt(List<Integer> x)
    {
       int[] arr = new int[x.size()];
        for(int i = 0; i < x.size(); i++)
        {
           arr[i] = x.get(i);
        }
        return arr;
    }
}
