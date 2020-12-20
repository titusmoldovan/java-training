package code._0_activity;

import java.util.ArrayList;
import java.util.List;

public class GenericsActivity {

    static class BubleSort {
        public <T extends Comparable> void sort(T[] list) {
            for (int i = 0; i < list.length - 1; i++) {
                for (int j = i + 1; j < list.length; j++) {
                    if (list[i].compareTo(list[j]) > 0) {
                        T temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                    }
                }
            }
        }
    }

    static class Printer {
        public <T> void print(T[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
        }
    }

    public static<T extends Comparable> void main(String[] args) throws NoSuchFieldException {
        BubleSort bubleSort = new BubleSort();
        Printer printer = new Printer();
        List listOfArrays = new ArrayList();
        Integer[] i = new Integer[]{3, 2, 6};
        Short[] s = new Short[]{3, 2, 6};
        Byte[] b = new Byte[]{3, 2, 6};
        Double[] d = new Double[]{3d, 2d, 6d};
        listOfArrays.add(i);
        listOfArrays.add(s);
        listOfArrays.add(b);
        listOfArrays.add(d);

        printList(bubleSort, printer, listOfArrays);
    }

    private static <T extends Comparable> void printList(BubleSort bubleSort, Printer printer, List<T[]> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("========");
            System.out.print("Before: ");
            printer.print(list.get(i));
            bubleSort.sort(list.get(i));
            System.out.print("After: ");
            printer.print(list.get(i));
        }
    }
}
