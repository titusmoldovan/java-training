package code._4_student_effort;

public class Code_Challenge_2 {

    public static String compute(int number) {
        String str_div = "";
        if (number % 3 == 0)
            str_div += "Foo";
        if (number % 5 == 0)
            str_div += "Bar";
        if (number % 7 == 0)
            str_div += "Qix";

        char[] number_digit;
        number_digit = String.valueOf(number).toCharArray();
        //String str_digit = "";
        for (char digit : number_digit) {
            if (digit == '3') str_div += "Foo";
            else if (digit == '5') str_div += "Bar";
            else if (digit == '7') str_div += "Qix";
        }
        if (str_div.isEmpty()) str_div = String.valueOf(number);
        return str_div;
    }

    public static String compute2(int number) {
        String str_div = "";
        if (number % 3 == 0)
            str_div += "Foo";
        if (number % 5 == 0)
            str_div += "Bar";
        if (number % 7 == 0)
            str_div += "Qix";
        char[] number_digit;
        number_digit = String.valueOf(number).toCharArray();
        String str_digit = str_div;
        for (char digit : number_digit) {
            if (digit == '3') str_digit += "Foo";
            else if (digit == '5') str_digit += "Bar";
            else if (digit == '7') str_digit += "Qix";
            else if (digit == '0') str_digit += "*";
            else if (str_div.isEmpty()) str_digit += digit;
        }
        return str_digit;
    }

    public static void main(String[] args) {
        for (int number = 1; number < 100; number++) {
            System.out.println(number + " => " + compute(number));
        }
        for (int number = 101; number < 1000; number += 101) {
            System.out.println(number + " => " + compute2(number));
        }
    }
}