package code._4_student_effort.Challange4_Iterator;

import code._4_student_effort.Challange3_List.GenericList;

public class MainIterator {
    public static void main(String args[])
    {
        Integer root = 11;
        String next = "awd";
        Boolean bool = true;
        GenericList list1 = new GenericList(root);
        ArrayIterator arr = new ArrayIterator(list1);
        while(arr.hasNext())
        {
            System.out.println(arr.next());
        }
    }

}
