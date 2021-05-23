public class challenge2
{
    static int pow(int x, int y)
    {
        int ans = 1;

        for(int i = 1; i <= y; ++i)
            ans *= x;

        return ans;
    }

    static String compute(int x)
    {
        String output = new String();

        if(x % 3 == 0)  output = (new StringBuilder()).append(output).append("Foo").toString();

        if(x % 5 == 0)  output = (new StringBuilder()).append(output).append("Bar").toString();

        if(x % 7 == 0)  output = (new StringBuilder()).append(output).append("Qix").toString();

        int copy_of_x = x;
        int length = String.valueOf(x).length();
        int power = pow(10, length - 1);

        while(x > 0)
        {
            if(x / power == 3) output = (new StringBuilder()).append(output).append("Foo").toString();
            if(x / power == 5) output = (new StringBuilder()).append(output).append("Bar").toString();
            if(x / power == 7) output = (new StringBuilder()).append(output).append("Qix").toString();

            x -= (x / power) * power;
            power /= 10;
        }

        if(output.length() == 0) output = String.valueOf(copy_of_x);

        return output;
    }

    static String compute2(int x)
    {
        String output = new String();

        if(compute(x).equals(String.valueOf(x)))
        {
            output = String.valueOf(x);
            output = output.replace("0","*");

            return output;
        }

        if(x % 3 == 0)  output = (new StringBuilder()).append(output).append("Foo").toString();

        if(x % 5 == 0)  output = (new StringBuilder()).append(output).append("Bar").toString();

        if(x % 7 == 0)  output = (new StringBuilder()).append(output).append("Qix").toString();

        int copy_of_x = x;
        int length = String.valueOf(x).length();
        int power = pow(10, length - 1);

        while(x > 0)
        {
            if(x / power == 3) output = (new StringBuilder()).append(output).append("Foo").toString();
            if(x / power == 5) output = (new StringBuilder()).append(output).append("Bar").toString();
            if(x / power == 7) output = (new StringBuilder()).append(output).append("Qix").toString();
            if(x / power == 0) output = (new StringBuilder()).append(output).append("*").toString();

            x -= (x / power) * power;
            power /= 10;
        }

        if(output.length() == 0) output = String.valueOf(copy_of_x);

        return output;
    }

    public static void main(String args[])
    {
        System.out.println("Stage 1");

        for(int i = 1; i <= 13; ++i)
            System.out.println(i + " => " + compute(i));

        System.out.println(15 + " => " + compute(15));
        System.out.println(21 + " => " + compute(21));
        System.out.println(33 + " => " + compute(33));
        System.out.println(51 + " => " + compute(51));
        System.out.println(53 + " => " + compute(53));

        System.out.println("Stage 2");
        System.out.println(101 + " => " + compute2(101));
        System.out.println(303 + " => " + compute2(303));
        System.out.println(105 + " => " + compute2(105));
        System.out.println(10101 + " => " + compute2(10101));
    }
}
