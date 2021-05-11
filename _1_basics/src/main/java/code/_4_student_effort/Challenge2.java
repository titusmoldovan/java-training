package code._4_student_effort;

public class Challenge2 {

    public int reverse( int i ) {
        int reverseNumber = 0;
        while( i != 0 ) {
            int remainder = i % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            i /= 10;
        }
        return  reverseNumber;
    }

    public String compute( int i ) {
        String out = "";
        StringBuilder buff = new StringBuilder();
        if( i % 3 == 0)
            buff.append("FOO");
        if( i % 5 == 0 )
            buff.append("BAR");
        if( i % 7 == 0 )
            buff.append("QIX");
        int a = reverse(i), ok = 0;
        while ( a != 0 ) {
            if (a%10 == 3) {
                buff.append("FOO");
                ok = 1;
            }
            if (a%10 == 5) {
                buff.append("BAR");
                ok = 1;
            }
            if (a%10 == 7) {
                buff.append("QIX");
                ok = 1;
            }
            a /= 10;
        }
        if( i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && ok == 0 )
            buff.append(i);
        return out.concat(String.valueOf(buff));
    }

    public String  compute2( int i ) {
        String out = "";
        StringBuilder buff = new StringBuilder();
        if( i % 3 == 0)
            buff.append("FOO");
        if( i % 5 == 0 )
            buff.append("BAR");
        if( i % 7 == 0 )
            buff.append("QIX");
        int a = reverse(i), ok = 0;
        while ( a != 0 ) {
            if (a%10 == 3) {
                buff.append("FOO");
                ok = 1;
            }
            if (a%10 == 5) {
                buff.append("BAR");
                ok = 1;
            }
            if (a%10 == 7) {
                buff.append("QIX");
                ok = 1;
            }
            if (a%10 == 0) {
                buff.append("*");
            }
            a /= 10;
        }
        if( i % 3 != 0 && i % 5 != 0 && i % 7 != 0 && ok == 0 ) {
            buff.setLength(0);
            while( i != 0 ) {
                if (i%10 == 0) {
                    buff.append("*");
                }else buff.append(i%10);
                i /= 10;
            }
            //buff.append(String.valueOf(i));
        }
        return out.concat(String.valueOf(buff));
    }
}
