package code._4_student_effort;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeSupport;

public class Window {
    private JFrame frame;
    private static final Window instance = new Window();
    private Window() {
        frame=new JFrame();//creating instance of JFrame  

        JButton b=new JButton("click");//creating instance of JButton  
        b.setBounds(130,100,100, 40);

        TextField textField = new TextField();
        textField.setBounds(50,50, 150,20);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    textField.setText(String.valueOf("JAVA"));
            }
        });
        frame.add(b);//adding button in JFrame  
        frame.add(textField);
        frame.setSize(400,500);//400 width and 500 height  
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static Window getInstance() {
        return  instance;
    }
}
