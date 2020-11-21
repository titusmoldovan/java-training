package code._4_student_effort;

public class Challenge2 {

    public static void main(String[] args) {
        for(int i = 1 ; i <= 101 ; i++){
            System.out.println(compute(i));
        }
    }

    public static String compute(int number) {
        String response = new String();
        if(number % 3 == 0){
            response = response + "Foo";
        }
        if(number % 5 == 0){
            response = response + "Bar";
        }
        if(number % 7 == 0){
            response = response + "Qix";
        }

        char[] r = String.valueOf(number).toCharArray();
        response = response + compute2(number);

        for (char c : r) {
            if (c == '3') {
                response = response + "Foo";
            }
            if (c == '5') {
                response = response + "Bar";
            }
            if (c == '7') {
                response = response + "Qix";
            }
            // Fix care merge fara compute2(number)
            /*if(c == '0'){
                response = response + '*';
            }*/
        }



        // if no values were found
        if(response.length() == 0) {
            response = String.valueOf(number);
        }

        return response.toString();

    }

    public static String compute2(int number){
        StringBuilder response2 = new StringBuilder();
        char[] r = String.valueOf(number).toCharArray();

        for(int i = 0 ; i < r.length ; i++){
            if( r[i] == '0'){
                r[i] = '*';
            }
            response2.append(r[i]);
        }

        return response2.toString();
    }

}