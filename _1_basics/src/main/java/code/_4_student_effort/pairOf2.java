package _4_student_effort;
import java.lang.*;

public class pairOf2 {

    public static void main(String[] args){
    int[] myArray = {-2,-5,6,-5,2,4,7,-7,5};
    int numOfPairs=0;


    /*

    Ordonez sirul crescator astfel incat
    perechile sa se formeze intre
    primele si ultimele numere din array

     */
    int aux;
    for(int i=0;i<myArray.length-1;i++)
        for(int j=i;j< myArray.length;j++)
        {
            if(myArray[i]>myArray[j])
            { aux=myArray[i];
            myArray[i]=myArray[j];
            myArray[j]=aux;}
        }

        // setez index-ul pentru inceput si pentru sfarsit
        int beginning=0;
        int end=myArray.length-1;

        while(beginning<end)
        {
            if (myArray[beginning] + myArray[end] == 0)
            {
                numOfPairs++;
                beginning++;
                end--;
            }
            else if (myArray[beginning] + myArray[end] < 0)
            {
                beginning++;
            }
            else
                end--;
        }

            System.out.println(numOfPairs);

}
}
