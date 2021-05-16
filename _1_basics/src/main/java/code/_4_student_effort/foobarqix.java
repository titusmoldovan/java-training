package _4_student_effort;

public class foobarqix {

    public static String compute(int i){

        StringBuilder str=new StringBuilder();
        int copy=i; //copia lui i

        if(i%3==0)
            str.append("Foo");
        if(i%5==0)
            str.append("Bar");
         if(i%7==0)
            str.append("Qix");

        //construiesc inversul lui i
        int inv = 0;
        while(i!=0) {
            inv = inv * 10 + (i % 10);
            i = i / 10;
        }

        // rule no 4
        while(inv!=0) {

            int c = inv % 10; //ultima cifra a numarului
            if (c == 3)
                str.append("Foo");
            else if (c == 5)
                str.append("Bar");
            else if (c == 7)
                str.append("Qix");

            str.append(compute2(c));

            inv=inv/10;
        }


        if(!(str.toString().contains("Foo") || str.toString().contains("Bar") || str.toString().contains("Qix")))
        {   str.setLength(0);
            str.append(compute2(copy));
        }
        return str.toString();
    }

    public static String compute2(int i)
    {
        StringBuilder str=new StringBuilder();

        if(i==0)
            str.append("*");
        else if(i>10)
            while(i!=0) {
                if (i % 10 == 0)
                     str.append("*");
                else
                    str.append(i%10);
                 i=i/10;
            }

        return str.toString();
    }

    public static void main(String[] args)
    {
        int i=10101;
        System.out.println(compute(i));
    }


}
