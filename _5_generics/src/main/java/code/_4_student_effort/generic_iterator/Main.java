package code._4_student_effort.generic_iterator;

import code._4_student_effort.generic_linked_list.GenericList;

public class Main {
    public static void main(String[] args) {
        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);
        for (int i = 1; i < 10; i++) {
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        IArrayIterator<String> it2 = new ArrayIterator<>(list);
        while (it2.hasNext())
            System.out.println(it2.next());
    }
}
