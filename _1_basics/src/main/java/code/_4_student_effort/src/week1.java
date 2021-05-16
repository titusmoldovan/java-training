import java.util.Arrays;
public class week1 {


        public static void challenge1Part1(){
            for(int i=1;i<=100;i++)
            {
                if(i%3==0)
                {System.out.print("Fizz");
                    if(i%5==0)
                        System.out.print("Buzz ");
                    else System.out.print(" ");

                }else
                if(i%5==0)
                    System.out.print("Buzz ");
                else System.out.print(i+" ");
            }
            System.out.println(" ");
        }
        public static void challenge1Part2(){
            for(int i=1;i<=100;i++)
            {
                if(i%3==0)
                {System.out.print("Fizz");
                    if(i%5==0)
                        System.out.print("Buzz ");
                    else System.out.print(" ");

                }else
                if(i%5==0)
                    System.out.print("Buzz ");
                else if(i%7==0)
                    System.out.print("Rizz ");
                else if(i%11==0)
                    System.out.print("Jazz ");
                else System.out.print(i+" ");
            }
            System.out.println(" ");

        }
        public static String compute(int numb)//challenge 2 part 1
        {
            StringBuilder rez1 = new StringBuilder();
            StringBuilder rez = new StringBuilder();
            int copie=numb;
            if(numb%3==0) {
                rez1.append("Foo");
            }
            if(numb%5==0) {
                rez1.append("Bar");
            }
            if(numb%7==0){
                rez1.append("Qix");}



            while(numb>0)
            {

                if(numb%10==3)
                    rez.insert(0,"Foo");

                if(numb%10==5)
                    rez.insert(0,"Bar");


                if(numb%10==7)
                    rez.insert(0,"Qix");

                numb=numb/10;
            }
            rez= rez.insert(0,rez1);
            if(rez.length()==0)
                rez.append(copie);
            String rezultat=rez.toString();

            return rezultat;

        }
        public static String compute2(int numb)//challenge 2 part 2
        {   StringBuilder rez1 = new StringBuilder();
            StringBuilder rez = new StringBuilder();
            int copie=numb;
            if(numb%3==0) {
                rez1.append("Foo");
            }
            if(numb%5==0) {
                rez1.append("Bar");
            }
            if(numb%7==0){
                rez1.append("Qix");}



            while(numb>0)
            {
                if(numb%10==0)
                    rez.insert(0,"*");
                if(numb%10==3)
                    rez.insert(0,"Foo");

                if(numb%10==5)
                    rez.insert(0,"Bar");


                if(numb%10==7)
                    rez.insert(0,"Qix");

                numb=numb/10;
            }
            rez= rez.insert(0,rez1);
            boolean ok=false;
            for(int i=0;i<rez.length();i++) {
                if(Character.compare(rez.charAt(i),'*')!=0){
                    ok=true;
                }
            }
            String rezultat=new String();
            if(rez.length()==0||ok==false)
            { StringBuilder rezult=new StringBuilder();
                while(copie>0){
                    if(copie%10==0)
                        rezult.insert(0,"*");
                    else rezult.insert(0,copie%10);
                    copie=copie/10;

                } rezultat=rezult.toString();
            }else
                rezultat=rez.toString();

            return rezultat;

        }
        public static int perechiDeDouaNumere(Integer[] vector)//challenge 3
        {
            int nrPerechi=0;
            for(int i= 0; i < vector.length ; i++)
            {
                for(int j= i+1; j < vector.length ; j++)
                {
                    if(vector[i]+vector[j]==0)
                    { System.out.println("Perechea :"+vector[i]+" si "+vector[j]);
                        nrPerechi++;
                        for (int k = i; k < vector.length - 1; k++) {
                            vector[i] = vector[i + 1];
                        }
                        for (int k = j; k < vector.length - 1; k++) {
                            vector[j] = vector[j + 1];

                        }


                    }

                }
            }
            return nrPerechi;
        }
        public static int perechiDeTreiNumere(Integer[] vector)//challenge 3
        {
            int nrPerechi=0;
            for(int i= 0; i < vector.length ; i++)
            {
                for(int j= i+1; j < vector.length ; j++)
                {
                    for(int z= j+1; z < vector.length ; z++)
                    {
                        if(vector[i]+vector[j]+vector[z]==0)
                        { System.out.println("Perechea :"+vector[i]+" si "+vector[j]+" si "+vector[z]);
                            nrPerechi++;
                            for (int k = i; k < vector.length - 1; k++) {
                                vector[i] = vector[i + 1];
                            }
                            for (int k = j; k < vector.length - 1; k++) {
                                vector[j] = vector[j + 1];}
                            for (int k = z; k < vector.length - 1; k++) {
                                vector[z] = vector[z + 1];

                            }


                        }

                    }
                }
            }
            return nrPerechi;
        }

        public static void main(String[] args) {
            System.out.println("challenge1Part1");
            challenge1Part1();
            challenge1Part2();
            System.out.println("challenge1Part2");
            System.out.println(compute(503071).toString());
            System.out.println(compute2(105));
            Integer[] v={1,-1,5,5,-4,-1,5,-5,4,7,8,-1,1,2,1};

            System.out.println("Numarul perechilor de 2 numere a caror suma este 0 este: "+perechiDeDouaNumere(v));
            Integer[] v1={1,-1,5,5,-4,-1,5,-5,4,7,8,-1,1,2,1};

            System.out.println("Numarul perechilor de 3 numere a caror suma este 0 este: "+perechiDeTreiNumere(v1));
        }
    }



