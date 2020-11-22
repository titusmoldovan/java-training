package code._4_student_effort;

//only stage 1

public class SecondChallenge {

    public static String compute(int number) {
        String output = "";
        String numberToString = String.valueOf(number);
        boolean ok = false;

        if (number % 3 == 0) {
            output += "Foo";
            ok = true;
        }
        if (numberToString.contains("3")) {
            int n = getNumberOfOccurences(numberToString,'3');
            for(int i=0; i<n; i++){
                output += "Foo";
            }
            ok = true;

        }
        if (number % 5 == 0) {
            output += "Bar";
            ok = true;
        }
        if (numberToString.contains("5")) {
            int n = getNumberOfOccurences(numberToString,'5');
            for(int i=0; i<n; i++){
                output += "Bar";
            }
            ok = true;
        }
        if (number % 7 == 0) {
            output += "Qix";
            ok = true;
        }
        if (numberToString.contains("7")) {
            int n = getNumberOfOccurences(numberToString,'7');
            for(int i=0; i<n; i++){
                output += "Qix";
            }
            ok = true;
        }
        if(!ok){
            return numberToString;
        }
        return output;
    }

    public static void main(String[] args) {
//        System.out.println(compute(1));
//        System.out.println(compute(3));
//        System.out.println(compute(5));
//        System.out.println(compute(15));
//        System.out.println(compute(33));
//        System.out.println(compute(51));
        System.out.println(compute(303));


    }
    public static int getNumberOfOccurences(String someString, char someChar){
        int count = 0;

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
        }
        return count;
    }
}
