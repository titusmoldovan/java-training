import java.util.Arrays;

public class challenge3
{
    static int numberOfPairs(int[] array)
    {
        Arrays.sort(array);

        int first, second, answer;
        first = 0;
        second = array.length - 1;
        answer = 0;

        while(first < second)
        {
            if(array[first] + array[second] == 0)
            {
                answer ++;
                first ++;
                second --;
            }
            else
                if(Math.abs(array[first]) > Math.abs(array[second]))
                    first ++;
                else
                    second --;
        }

        return answer;
    }

    public static void main(String args[])
    {

        System.out.println("Test 1");
        int array[] = {3, 2, -3, -2, 3, 0};
        System.out.println("Number of pairs = " + numberOfPairs(array));

        System.out.println("Test 2");
        int array1[] = {1, 1, 0, -1, -1};
        System.out.println("Number of pairs = " + numberOfPairs(array1));

        System.out.println("Test 3");
        int array2[] = {5, 9, -5, 7, -5};
        System.out.println("Number of pairs = " + numberOfPairs(array2));
    }
}
