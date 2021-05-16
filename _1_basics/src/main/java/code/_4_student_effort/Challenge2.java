package code._4_student_effort;

public class Challenge2 {

    static String setDigit(int number) {
        if (number == 3) {
            return "Foo";
        }
        if (number == 5) {
            return "Bar";
        }
        if (number == 7) {
            return "Qix";
        }
        return "";
    }

    static String compute(int number) {
        String modified = "";
        boolean isOK = false;
        int copy = number, reversed = 0;
        for( ; copy != 0; copy /= 10) {
            reversed = reversed * 10 + copy % 10;
            if (copy % 10 == 3 || copy % 10 == 5 || copy % 10 == 7) {
                isOK = true;
            }
        }
        if (number % 3 == 0) {
            modified = modified.concat("Foo");
            isOK = true;
        }
        if (number % 5 == 0) {
            modified = modified.concat("Bar");
            isOK = true;
        }
        if (number % 7 == 0) {
            modified = modified.concat("Qix");
            isOK = true;
        }
        if (isOK == true) {
            for (; reversed != 0; reversed /= 10) {
                modified = modified.concat(setDigit(reversed % 10));
            }
        } else {
            modified = modified.concat(Integer.toString(number));
        }
        return modified;
    }

    static String compute2(int number) {
        String modified = "";
        boolean isOK = false, hasZero = false;
        int copy = number, reversed = 0;
        for( ; copy != 0; copy /= 10) {
            reversed = reversed * 10 + copy % 10;
            if (copy % 10 == 3 || copy % 10 == 5 || copy % 10 == 7) {
                isOK = true;
            }
            if (copy % 10 == 0) {
                hasZero = true;
            }
        }
        if (number % 3 == 0) {
            modified = modified.concat("Foo");
            isOK = true;
        }
        if (number % 5 == 0) {
            modified = modified.concat("Bar");
            isOK = true;
        }
        if (number % 7 == 0) {
            modified = modified.concat("Qix");
            isOK = true;
        }
        if (!hasZero) {
            modified = modified.concat(compute(number));
        } else {
            if (!isOK) {
                for( ; reversed != 0; reversed /= 10) {
                    if (reversed % 10 == 0) {
                        modified = modified.concat("*");
                    } else {
                        modified = modified.concat(Integer.toString(reversed % 10));
                    }
                }
            } else {
                for( ; reversed != 0; reversed /= 10) {
                    if (reversed % 10 == 0) {
                        modified = modified.concat("*");
                    } else {
                        modified = modified.concat(setDigit(reversed % 10));
                    }
                }
            }
        }
        return modified;
    }

    public static void main(String[] args) {
        System.out.println(compute2(303));
    }
}
