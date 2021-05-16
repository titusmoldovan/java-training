public class FooBarQix {
    FooBarQix(){

    }
    public String compute(int number){
        for (int i = 0; i < number; i++) {
            if ((i % 3) == 0 && (i % 5 != 0) && (i % 7 != 0)) {
                System.out.println("Foo");
            } else if ((i % 5 == 0) && (i % 3 != 0) && (i % 7 != 0)) {
                System.out.println("Bar");
            } else if ((i % 7 == 0) && (i % 3 != 0) && (i % 5 != 0)) {
                System.out.println("Qix");

            } else
                System.out.println(i);
            String temp = String.valueOf(i);
            if(temp.contains("5")){
                String temp_2 = temp.replace("5","Bar");
                System.out.println(temp_2);
            }
            else if(temp.contains("3")){
                String temp_2 = temp.replace("3","Foo");
                System.out.println(temp_2);

            }
            else if(temp.contains("7")){
                String temp_2 = temp.replace("7","Qix");
                System.out.println(temp_2);

            }

        }
        return null;
    }
}
