import java.util.Arrays;

public class challenge4
{
    static boolean pairwithGivenSum(int[] array, int sum, int[] without)
    {
        int first, second;
        first = 0;
        second = array.length - 1;

        while(first < second)
        {
            if(array[first] + array[second] == sum)
            {
                if(without[first] == 0 && without[second] == 0)
                {
                    without[first] = 1;
                    without[second] = 1;

                    return true;
                }

                first ++;
                second --;
            }
            else
            if(array[first] +array[second] < sum)
                first ++;
            else
                second --;
        }

        return false;
    }

    static int numberOfTriplets(int[] array)
    {
        Arrays.sort(array);

        int answer = 0;
        int[] without = new int[array.length];

        for(int i = 0; i < array.length; ++i)
            if(pairwithGivenSum(array, -array[i], without) == true)
            {
                without[i] = 1;
                answer ++;
            }

        return answer;
    }

    public static void main(String args[])
    {

        System.out.println("Test");
        int array[] = {-1, -1, -1, 2, 1, 0, 0};
        System.out.println("Number of pairs = " + numberOfTriplets(array));
    }
}
