package _4_student_effort;
import java.util.*;
public class TestBoxingMatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fighter[] f = new Fighter[4];
        int j = 0;
        System.out.println("Insert info\n");
        for(int i = 0; i < f.length  ; i++ )
        {   f[i] = new Fighter();
            System.out.println("Insert name: ");
                f[i].name = in.next();
                System.out.println("You have entered: " + f[i].name + " Name of Player " + (i+1)  );

            System.out.println("Insert health:");
            f[i].health = in.nextFloat();
            System.out.println("You have entered: " + f[i].health + " health of Player " + (i+1));
            System.out.println("Insert damage:");
            f[i].damagePerAttack = in.nextFloat();
            System.out.println("You have entered: " + f[i].damagePerAttack + " damage of player " + (i+1)) ;
        }
        BoxingMatch[] box = new BoxingMatch[2];

        System.out.println("Insert match: \n");
        for(int i = 0 ; i < box.length ;i++)
        {
            box[i] = new BoxingMatch(f[i], f[i+1]);
         //   System.out.println(" Boxes : "+box);
            System.out.println("Winner is :  "+box[i].fight(f[i], f[i+1]));

        }
    }
}
