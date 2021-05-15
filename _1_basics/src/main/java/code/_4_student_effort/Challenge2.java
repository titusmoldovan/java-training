package code._4_student_effort;

public class Challenge2 {
    public int reverse(int x){
        int nr = 0;
        int i = 1;
        while( x!= 0){
            nr = nr * 10 + (x % 10);
            x /= 10;
        }
        return nr;
    }

    public String compute(int i){
        StringBuilder stringBuilder= new StringBuilder();
        if (i % 3 == 0)
            stringBuilder.append("Foo");
        if (i % 5 == 0)
            stringBuilder.append("Bar");
        if (i % 7 == 0)
            stringBuilder.append("Qix");
        i = reverse(i);
        while(i != 0){
            if (i % 10 == 3)
                stringBuilder.append("Foo");
            if (i % 10 == 5)
                stringBuilder.append("Bar");
            if (i % 10 == 7)
                stringBuilder.append("Qix");
            i /= 10;
        }
        String str = stringBuilder.toString();
        return str;
    }
    public String compute2(int i){
        StringBuilder stringBuilder= new StringBuilder();
        int ok = 0;
        if (i % 3 == 0)
            {stringBuilder.append("Foo");
             ok = 1;}
        if (i % 5 == 0)
            {stringBuilder.append("Bar");
            ok = 1;}
        if (i % 7 == 0)
            {stringBuilder.append("Qix");
             ok = 1;}
        int a = reverse(i);
        while(a != 0){
            if (a % 10 == 3)
                {stringBuilder.append("Foo");
                    ok = 1;}
            if (a % 10 == 5){
                stringBuilder.append("Bar");
                ok = 1;
            }
            if (a % 10 == 7){
                stringBuilder.append("Qix");
                ok = 1;
            }

            if (a % 10 == 0)
                stringBuilder.append("*");
            a /= 10;
        }
        while(i % 10 == 0)
        {
            stringBuilder.append('*');
            i /= 10;
        }
        if( ok == 0){
            stringBuilder.setLength(0);
            a = reverse(i);
            while( a!= 0){
                if(a % 10 == 0)
                    stringBuilder.append('*');
                else{
                    stringBuilder.append(a%10);
                }
                a /= 10;
            }
        }
        String str = stringBuilder.toString();
        return str;
    }
}
