package code._4_student_effort.ChallengeTwo;

public class FooBarQix {

    public static String compute(int value) {
        StringBuilder ans = new StringBuilder();
        if (value % 3 == 0)
            ans.append("Foo");
        if (value % 5 == 0)
            ans.append("Bar");
        if (value % 7 == 0)
            ans.append("Qix");

        char[] chars = String.valueOf(value).toCharArray();

        for (char c : chars) {
            if (c == '3')
                ans.append("Foo");
            if (c == '5')
                ans.append("Bar");
            if (c == '7')
                ans.append("Qix");
        }

        if (ans.length() == 0) {
            ans.append(String.valueOf(value));
        }
        return ans.toString();
    }

    public static String compute2(int value) {
        StringBuilder ans = new StringBuilder();
        if (value % 3 == 0)
            ans.append("Foo");
        if (value % 5 == 0)
            ans.append("Bar");
        if (value % 7 == 0)
            ans.append("Qix");

        char[] chars = String.valueOf(value).toCharArray();

        for (char c : chars) {
            if (c == '3')
                ans.append("Foo");
            if (c == '5')
                ans.append("Bar");
            if (c == '7')
                ans.append("Qix");
            if (c == '0')
                ans.append("*");
        }
        if (ans.length() == 0) {
            ans.append(String.valueOf(value));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d: %s", i, compute(i) + ", ");
        }
    }
}
