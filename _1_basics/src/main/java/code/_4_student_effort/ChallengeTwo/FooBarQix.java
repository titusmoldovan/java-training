package code._4_student_effort.ChallengeTwo;

public class FooBarQix {

    public static String compute(int value) {
        String ans = "";
        if (value % 3 == 0)
            ans +="Foo";
        if(value % 5 == 0 )
            ans+="Bar";
        if(value % 7 == 0 )
            ans+="Qix";

        char[] chars = String.valueOf(value).toCharArray();

        for(char c: chars){
            if (c == '3')
                ans+="Foo";
            if(c == '5')
                ans+="Bar";
            if(c == '7')
                ans+="Qix";
        }

        if (ans.isEmpty()){
            ans+=String.valueOf(value);
        }
        return ans;
    }
    public static String compute2(int value){
        String ans = "";
        if (value % 3 == 0)
            ans +="Foo";
        if(value % 5 == 0 )
            ans+="Bar";
        if(value % 7 == 0 )
            ans+="Qix";

        char[] chars = String.valueOf(value).toCharArray();

        for(char c: chars){
            if (c == '3')
                ans+="Foo";
            if(c == '5')
                ans+="Bar";
            if(c == '7')
                ans+="Qix";
            if (c == '0')
                ans+="*";
        }
        if (ans.isEmpty()){
            ans+=String.valueOf(value);
        }
        return ans;

    }
    public static void main(String[] args) {
        for(int i = 1 ; i <= 100; i ++ ){
            System.out.printf("%d: %s",i,compute(i)+", ");
        }
    }
}
