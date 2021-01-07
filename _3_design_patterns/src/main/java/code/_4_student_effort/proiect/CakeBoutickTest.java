package code._4_student_effort.proiect;

public class CakeBoutickTest {
    public static void main(String[] args) {
        CakeBoutique cakeboutique1= new CakeBoutique.Builder("withcoffe","mascarpone", new CakeWithoutBaking())
                                                    .setChocolate(true)
                                                    .setWhippedcream(true)
                                                    .build();
        System.out.println(cakeboutique1.toString());
        cakeboutique1.getPreparationStrategy().makeCake(cakeboutique1);

        CakeBoutique cakeboutique2= new CakeBoutique.Builder("fluffy","withfruits", new BakeCake())
                                                    .setChocolate(false)
                                                    .setWhippedcream(true)
                                                     .build();

        System.out.println(cakeboutique2.toString());
        cakeboutique2.getPreparationStrategy().makeCake(cakeboutique2);
    }
}
