package solution;

public class Task {
    public static void main(String[] args)  {


        Task task = new Task();
        task.printingTheWord(10);

    }

    // Реализуйте функцию, которая для заданного числа (int) печатает
    // «foo», если это число делится на 3 без остатка, печатает «bar»,
    // если это число делится на 5 без остатка, печатает «foobar»,
    // если это число делится на 15 без остатка, печатает
    // само число в остальных случаях.
    public void printingTheWord(int numbers) {

        if (numbers <= 0)
            throw new IllegalArgumentException("значение меньше нуля");
        String result = "";
        if (numbers % 3 == 0)
            result = "foo";
        if (numbers % 5 == 0)
            result = result + "bar";

        result = result.equals("")? String.valueOf(numbers):result;



        System.out.println(result);

    }

}
