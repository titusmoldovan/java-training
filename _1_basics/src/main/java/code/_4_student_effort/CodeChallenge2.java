/**
 * Oana Durcau - 14.05.2021
 * You should implement a function String compute(int) which implements the following rules:
 * 1. If the number is divisible by 3, write "Foe instead of the number
 * 2. If the number indivisible by 5, add "Bar
 * 3. If the number indivisible by 7, add "Piz"
 * 4. For each digit 3, 5, 7, add "Foo.,"Bar,"Qbe in the digits order.
 *
 * Only stage 1 was implemented
 */
package code._4_student_effort;

public class CodeChallenge2 {

    String compute(int i) {
        StringBuilder string = new StringBuilder(i + " => ");
        String s = string.toString();

        string.append(divisibilityCheck(i));
        string.append(numberCheck(i));

        if(string.equals(s)) //nu intra aici, chiar daca mergand cu debugger-ul pare ok
        {
            string.append(i);
        }

        return string.toString();
    }

    String divisibilityCheck(int i) {
        StringBuilder string = new StringBuilder();
        if (i % 3 == 0)
            string.append("Foo");
        if (i % 5 == 0)
            string.append("Bar");
        if (i % 7 == 0)
            string.append("Qix");

        return string.toString();
    }

    String numberCheck(int i) {
        int uc;
        StringBuilder newString = new StringBuilder();
        while (i != 0) {
            uc = i % 10;
            if (uc == 3)
                newString.insert(0, "Foo");
            if (uc == 5)
                newString.insert(0, "Bar");
            if (uc == 7)
                newString.insert(0, "Qix");
            i = i / 10;

        }
        return newString.toString();
    }
}
