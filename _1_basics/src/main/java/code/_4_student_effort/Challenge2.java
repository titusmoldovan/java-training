package code._4_student_effort;

public class Challenge2 {

    public static void main(String[] args) {
        for(int i = 1 ; i <= 101 ; i++){
            System.out.println(compute(i));
        }
    }

    public static String compute(int number) {
        StringBuilder response = new StringBuilder();
        if(number % 3 == 0){
            response.append("Foo");
        }
        if(number % 5 == 0){
            response.append("Bar");
        }
        if(number % 7 == 0){
            response.append("Qix");
        }

        char[] r = String.valueOf(number).toCharArray();
        response.append(compute2(number));

        for (char c : r) {
            if (c == '3') {
                response.append("Foo");
            }
            if (c == '5') {
                response.append("Bar");
            }
            if (c == '7') {
                response.append("Qix");
            }
        }

        // if no values were found
        if(response.length() == 0){
            response = new StringBuilder();
        }

        return response.toString();

    }

    public static String compute2(int number){
        StringBuilder response = new StringBuilder();
        char[] r = String.valueOf(number).toCharArray();

        for(int i = 0 ; i < r.length ; i++){
            if( r[i] == '0'){
                r[i] = '*';
            }
            response.append(r[i]);
        }

        return response.toString();
    }

}