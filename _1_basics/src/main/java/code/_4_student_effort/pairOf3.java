package _4_student_effort;

import java.util.Vector;

public class pairOf3 {

    public static void main(String[] args) {
        int[] myArray = {-1,-1,-1,2,0,3,1,-2};
        int numOfPairs = 0;

        int aux;
        for(int i=0;i<myArray.length-1;i++)
            for(int j=i;j< myArray.length;j++)
            {
                if(myArray[i]>myArray[j])
                { aux=myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j]=aux;}
            }

        for(int i=0;i<myArray.length;i++)
            System.out.println(myArray[i]);



        for(int i=0;i<myArray.length-2;i++)
        {
            if(i>0 && myArray[i]==myArray[i-1])
                continue;

            int beginning=1+i;
            int end=myArray.length-1;

            while(beginning<end)
            {
                if(myArray[beginning] + myArray[end] + myArray[i]==0)
                {

                    numOfPairs++;
                    System.out.println(myArray[beginning]+" "+ myArray[end]+" "+ myArray[i]);
                    beginning++;
                    end--;

                }
                else if(myArray[beginning] + myArray[end] + myArray[i]<0)
                {
                    beginning++;
                }
                else
                {
                    end--;
                }


            }
        }

        System.out.println("numOfPairs= "+numOfPairs);
    }
}
