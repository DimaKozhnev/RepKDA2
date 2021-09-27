public class Solution {
    public static void main(String[] args) {
        String result;

        result = toBinary( 1);
        assert result.equals("1") : "дефект преобразования числа 1";

        result = toBinary( 18);
        assert result.equals("10010") : "дефект преобразования числа 18";

        result = toBinary( Integer.MAX_VALUE);
        assert result.equals("1111111111111111111111111111111") : "дефект преобразования числа "+Integer.MAX_VALUE;



    }
    public static String toBinary(int number)
    {
        String result = "";

        try {
            int numb = number;
            while(numb>0)
            {
                String str = String.valueOf(numb%2);
                numb=numb/2;
                result = str+result;
            }
        } catch (Exception e) {
            System.out.println("шибка данных");
            e.printStackTrace();

        }
        return result;
    }
}
