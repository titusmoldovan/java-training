package code._4_student_effort;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int pair = 0, n;

        System.out.print("Size of array: ");
        n = input.nextInt();

        System.out.println("Elements of array:");
        int[] array = new int[n];
        for(int i = 0; i< array.length; i++){
            array[i] = input.nextInt();
        }

        for(int i = 0;i < array.length ; i++){
            for(int j = i+1 ; j<array.length;j++){
                for(int k = j+1 ; k<array.length; k++){
                if(array[i] + array[j] + array[k] == 0){
                    pair++;
                    array[i] = 1;
                    array[j] = 1;
                    array[k] = 1;
                    }
                }
            }
        }

        System.out.print("Number of pairs: " + pair);

    }

}
