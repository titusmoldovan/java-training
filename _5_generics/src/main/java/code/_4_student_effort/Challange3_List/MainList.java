package code._4_student_effort.Challange3_List;

public class MainList {
    public static void main(String args[])
    {
        Integer root = 11;
        String next = "awd";
        Boolean bool = true;
        GenericList list1 = new GenericList(root);
        list1.insert(next);
        list1.insert(bool);
        list1.println();
    }
}
