package code._4_student_effort.Challange5;

public abstract class TemplateMethodBubbleSort {
    public void sort(Integer[] list)
    {
        Integer aux;
        boolean done = false;
        while(!done)
        {
            done = true;
            for(int i = 0; i < list.length - 1; i++)
            {
                if(!numbersInCorrectOrder(list[i], list[i+1]))
                {
                    aux = list[i];
                    list[i] = list[i + 1];
                    list[i+1] = aux;
                    done = false;
                }
            }
        }
    }
    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
