package code._4_student_effort._5_template_method;

public class AscBubbleSort extends TemplateMethodBubbleSort {
    @Override
    void sort(Integer[] list){
        int aux=0;
        for(int i=0;i< list.length;i++){
            for(int j=1;j<list.length-i;j++)
                if(numbersInCorrectOrder(list[j-1],list[j])==false){
                    aux=list[j-1];
                    list[j-1]=list[j];
                    list[j]=aux;
                }
        }
    }
    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if(i1<i2) return true;
        return false;
    }
}
