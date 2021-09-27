package solution;

import java.util.LinkedList;
import java.util.List;

public class Solutinn5 {
    public static void main(String[] args) {

      Solution3.vewInt(leapYear(1900,2021));



    }
    public static int[]  leapYear(int yearStart, int yearEnd )
    {
        List<Integer> list = new LinkedList<>();
        for(int i = yearStart; i<= yearEnd; i++)
        {
            if(i%4==0)
            {
                if((i%4==0&&i%100!=0)||i%400==0)
                    list.add(i);
            }
        }
        return Solution3.listToArrInt(list);
    }
}
