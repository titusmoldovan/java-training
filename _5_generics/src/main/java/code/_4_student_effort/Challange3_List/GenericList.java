package code._4_student_effort.Challange3_List;

import java.util.ArrayList;
import java.util.List;

public class GenericList <T> implements InterfaceOfGenericList{
    private List<T> insideList;
    public GenericList(T root)
    {
        insideList = new ArrayList<>();
        insideList.add(root);
    }

    @Override
    public void insert(Object elem) {
        insideList.add((T)elem);
    }

    @Override
    public void println() {
        for(int i = 0 ;i < insideList.size(); i++)
        {
            System.out.println(insideList.get(i) + " ");
        }

    }
}
