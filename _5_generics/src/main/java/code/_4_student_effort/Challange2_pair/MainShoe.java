package code._4_student_effort.Challange2_pair;

public class MainShoe {
    public static void main(String args[])
    {
        Boot boot1 = new Boot("Red", 41);
        Boot boot2 = new Boot("Red", 41);


        ShoePair<Boot> pairBoots = new ShoePair<>(boot1,boot2);


        Running r1 = new Running("Black", 43);
        //ShoePair<Boot> pair2 = new ShoePair<>(boot1,r1);  ///doesn't work
        Boot boot3 = new Boot("Red", 42);
        Boot boot4 = new Boot("Blue", 41);
        //ShoePair<Boot> pair3 = new ShoePair<>(boot1,boot3);  ///wrong size
        //ShoePair<Boot> pair4 = new ShoePair<>(boot1,boot4);     //wrong color
    }
}
