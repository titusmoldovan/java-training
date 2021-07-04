import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Adapter implements ActionListener{

    int lungime=100;
    int low=1;
    int high=100;

    public Adapter (){


        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel guess_game = new JLabel("Think of a number from 1 to 100");
        JLabel q1 = new JLabel("Is number bigger than "+(low+(lungime/2))+" ?");
        JButton equals = new JButton("YES");
        equals.addActionListener(this);
        JButton not_equals = new JButton("NO");
        JLabel label = new JLabel("");

        panel.setBorder(BorderFactory.createEmptyBorder(50,150,150,150));
        panel.setLayout(new GridLayout(0,1));
        panel.add(guess_game);
        panel.add(q1);
        panel.add(equals);
        panel.add(not_equals);

        frame.add(panel,BorderLayout.CENTER);
        frame.setSize(300,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Guess the number");
        frame.pack();
        frame.setVisible(true);

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lungime==1)
                    q1.setText("Your number is "+high+" !");
                else {
                    low = low + (lungime / 2);
                    lungime = high-low;
                    q1.setText("Is number bigger than " + (low + (lungime / 2)) + " ?");
                   // System.out.println(low + " " + high + " " +lungime);
                }
            }
        });

        not_equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(lungime==1)
                    q1.setText("Your number is "+low+" !");
                else {
                    high = high - (lungime / 2);
                    lungime = high-low;
                    q1.setText("Is number bigger than " + (high - (lungime / 2)) + " ?");
                    //System.out.println(low + " " + high + " " +lungime);
                }
            }
        });

    }
    public static void main ( String args[])
    {
        new Adapter();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}