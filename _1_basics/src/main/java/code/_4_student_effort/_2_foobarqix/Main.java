package code._4_student_effort._2_foobarqix;

public class Main {

    public static void main(String[] args) {

        System.out.println(compute2(8));
    }

    public static String compute(int number) {
        String numberString = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(isDividing(number));
        for (Character digit : numberString.toCharArray()) {
            stringBuilder.append(isContaining(digit - '0'));
        }
        if (stringBuilder.toString().isBlank()) {
            return String.valueOf(number);
        } else
            return stringBuilder.toString();
    }

    public static String compute2(int number) {
        String numberString = String.valueOf(number);
        StringBuilder stringBuilder = new StringBuilder(isDividing(number));
        for (Character digit : numberString.toCharArray()) {
            stringBuilder.append(isContainingTweaked(digit - '0'));
        }
        if (stringBuilder.toString().isBlank()) {
            return String.valueOf(number);
        } else
            return stringBuilder.toString();
    }

    public static boolean is0(int number) {
        String stringNumber = String.valueOf(number);
        for (Character character : stringNumber.toCharArray()) {
            if (character == '0') {
                return true;
            }
        }
        return false;
    }

    public static String isDividing(int number) {
        StringBuilder computedString = new StringBuilder();
        if (number % 3 == 0) {
            computedString.append("Foo");
        }
        if (number % 5 == 0) {
            computedString.append("Bar");
        }
        if (number % 7 == 0) {
            computedString.append("Qix");
        }
        return computedString.toString();
    }

    public static String isContaining(int number) {
        StringBuilder computedString = new StringBuilder();
        if (String.valueOf(number).contains(String.valueOf(3))) {
            computedString.append("Foo");
        }
        if (String.valueOf(number).contains(String.valueOf(5))) {
            computedString.append("Bar");
        }
        if (String.valueOf(number).contains(String.valueOf(7))) {
            computedString.append("Qix");
        }
        return computedString.toString();
    }

    public static String isContainingTweaked(int number) {
        StringBuilder computedString = new StringBuilder();
        if (String.valueOf(number).contains(String.valueOf(3))) {
            computedString.append("Foo");
        }
        if (String.valueOf(number).contains(String.valueOf(5))) {
            computedString.append("Bar");
        }
        if (String.valueOf(number).contains(String.valueOf(7))) {
            computedString.append("Qix");
        }
        if (is0(number)) {
            computedString.append("*");
        }
        return computedString.toString();
    }
}
