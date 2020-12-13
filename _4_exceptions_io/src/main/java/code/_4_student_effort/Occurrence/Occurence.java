package code._4_student_effort.Occurrence;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        try {
            FileInputStream in = new FileInputStream("D:\\4. Other\\Java\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\Occurrence\\in.txt");
            Scanner scanner = new Scanner(in);
            while (scanner.hasNext()){
                list.add(scanner.next());
            }
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        for (int i = 0 ; i<list.size() ; i++){
            int repetari = 0;
            for (int j = 0 ; j < list.size() ; j++){
                if (list.get(i).equals(list.get(j))){
                    repetari++;
                    if (repetari > 1){
                    list.remove(j);
                    j--;
                    }
                }
            }
            list2.add(repetari);
        }

        for (int i = 0 ; i < list2.size() ; i++){
            Integer aux;
            String aux2;
            for (int j = 0 ; j < list2.size() ; j++){
                if(list2.get(i) > list2.get(j)){
                    aux = list2.get(i);
                    list2.set(i, list2.get(j));
                    list2.set(j, aux);

                    aux2 = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, aux2);
                }
            }
        }

        for (int i = 0 ; i < 10 ; i ++){
            System.out.println(list.get(i) + " " + list2.get(i));
        }
    }
}
