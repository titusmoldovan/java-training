package code._4_student_effort.Challange5_Binary;

import code._2_challenge._5_generic_binary_search.ArrayNotSortedException;

public class BinarySearch {
    public static <T extends Comparable <T>> int sort(T array[], int left, int right, T value)  throws ArrayNotSortedException
    {

        if(isSorted(array))
        {
            int direction = getDirection(array);
            if(direction == 1)
            {
                if(left <= right)
                {
                    int middle = (left + right) / 2;
                    if (value.compareTo(array[middle]) == 0)
                        return middle;
                    else
                    if (value.compareTo(array[middle]) < 0)
                        return sort(array,left,middle - 1, value);
                    else
                        return sort(array,middle + 1, right, value);
                }
                return -1;
            }
            else
            {
                if(left <= right)
                {
                    int middle = (left + right) / 2;
                    if (value.compareTo(array[middle]) == 0)
                        return middle;
                    else
                    if (value.compareTo(array[middle]) < 0)
                        return sort(array,middle + 1,right, value);
                    else
                        return sort(array,0, middle - 1, value);
                }
                return -1;
            }
        }
        else
            throw new ArrayNotSortedException("list is not sorted!");
    }
    public static <T extends Comparable <T>> int getDirection(T array[])
    {
        int direction = 1;

        int i = 0;
        while(i < array.length - 1 && array[i].compareTo(array[i + 1]) == 0)
        {
            i++;
        }
        if(i == array.length - 1)
            return direction;

        if(array[i].compareTo(array[i + 1]) < 0)
           direction = 1;
        else
            direction = 2;
        return direction;

    }
    public static <T extends Comparable <T>> boolean isSorted(T array[])
    {
        int direction = 1;
        int i = 0;
        while(i < array.length - 1 && array[i].compareTo(array[i + 1]) == 0)
        {
            i++;
        }
        if(i == array.length - 1)
            return true;

        if(array[i].compareTo(array[i+1]) < 0)
            direction = 1;
        else
            direction = 2;

        if(direction == 1)
        {
            while(i < array.length - 1 && array[i].compareTo(array[i + 1]) <= 0)
                i++;
            if(i == array.length - 1)
                return true;
            else
                return false;
        }

        if(direction == 2)
        {
            while(i < array.length - 1 && array[i].compareTo(array[i + 1]) >= 0)
                i++;
            if(i == array.length - 1)
                return true;
            else
                return false;
        }
        return true;

    }

}
