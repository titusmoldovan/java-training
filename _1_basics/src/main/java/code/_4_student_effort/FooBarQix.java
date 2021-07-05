package code._4_student_effort;

import java.util.List;

public class FooBarQix {
    public static String compute(int number){
        StringBuilder sb = new StringBuilder();
        if(number % 3 == 0){
            sb.append("Foo");
        }
        if(number % 5 == 0){
            sb.append("Bar");
        }
        if(number % 7 == 0){
            sb.append("Qix");
        }

        char[] digits = String.valueOf(number).toCharArray();
        for(char c : digits){
            switch(c){
                case '3':sb.append("Foo");
                break;
                case '5':sb.append("Bar");
                break;
                case '7':sb.append("Qix");
                break;
            }
        }
        if(sb.isEmpty()){
            sb.append(number);
        }
        return sb.toString();
    }
    public static String compute2(int number){
        boolean skip = false;
        StringBuilder sb = new StringBuilder();
        if(number % 3 == 0){
            sb.append("Foo");
            skip = true;
        }
        if(number % 5 == 0){
            sb.append("Bar");
            skip = true;
        }
        if(number % 7 == 0){
            sb.append("Qix");
            skip = true;
        }

        char[] digits = String.valueOf(number).toCharArray();
        for(char c : digits){
            switch(c){
                case '0': sb.append("*");
                    break;
                case '3':
                    sb.append("Foo");
                    break;
                case '5':sb.append("Bar");
                    break;
                case '7':sb.append("Qix");
                    break;
                default: if(!skip)sb.append(c);
            }
        }
        if(sb.isEmpty()){
            sb.append(number);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(FooBarQix.compute2(101));
        System.out.println(FooBarQix.compute2(303));
        System.out.println(FooBarQix.compute2(105));
        System.out.println(FooBarQix.compute2(10101));

    }
}
