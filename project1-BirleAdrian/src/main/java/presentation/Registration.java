package presentation;

import business.CreateAccount;
import model.Client;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.*;



public class Registration extends JFrame implements Serializable{
    @Serial
    private static final long serialVersionUID = 1L;
    //Background and dimensions
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    Image img_background = ImageIO.read(new File("src/main/resources/register_back.jpg")).getScaledInstance(dim.width/2, dim.height-dim.height/6, Image.SCALE_SMOOTH);
    private static final int labelWidth = 100;
    private static final int labelHeight = 50;
    private static final int textFieldWidth = 190;
    private static final int textFieldHeight = 30;
    //Components
    private JPanel          content;
    private JLabel          labelBackground;
    private JTextField      username;
    private JPasswordField  passwordField;
    private JTextField      name;
    private JTextField      age;
    private JTextField      address;
    private JTextField      city;
    private JTextField      email;

    public Registration() throws IOException {
        initialize();
        this.setVisible(true);
    }
    public void initialize(){
        content = new JPanel();
        content.setLayout(null);
        this.setContentPane(content);
        this.setTitle("Food Delivery Management by Birle - Register");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width/2,dim.height-dim.height/6);
        this.setLocation(dim.width/2 - this.getSize().width/2,dim.height/2 - this.getSize().height/2);
        addComponentListener((ComponentAdapter) new ResizeComp());

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setForeground(new Color(100, 240, 255));
        lblUsername.setFont(new Font("Arial",Font.PLAIN, 18));
        lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
        lblUsername.setBounds(454, 232, labelWidth, labelHeight);
        content.add(lblUsername);

        username = new JTextField();
        username.setHorizontalAlignment(SwingConstants.CENTER);
        username.setBounds(575, 239, textFieldWidth, textFieldHeight);
        content.add(username);
        username.setColumns(10);

        JLabel labelPassword = new JLabel("Password");
        labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelPassword.setForeground(new Color(100, 240, 255));
        labelPassword.setFont(new Font("Arial", Font.PLAIN, 18));
        labelPassword.setBounds(454, 284, labelWidth, labelHeight);
        content.add(labelPassword);

        passwordField = new JPasswordField();
        passwordField.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.setBounds(575, 295, textFieldWidth, textFieldHeight);
        content.add(passwordField);

        JLabel labelName = new JLabel("Name");
        labelName.setHorizontalAlignment(SwingConstants.CENTER);
        labelName.setForeground(new Color(100, 240, 255));
        labelName.setFont(new Font("Arial", Font.PLAIN, 18));
        labelName.setBounds(454, 346, labelWidth, labelHeight);
        content.add(labelName);

        name = new JTextField();
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setColumns(10);
        name.setBounds(575, 358, textFieldWidth, textFieldHeight);
        content.add(name);

        JLabel labelAge = new JLabel("Age");
        labelAge.setHorizontalAlignment(SwingConstants.CENTER);
        labelAge.setForeground(new Color(100, 240, 255));
        labelAge.setFont(new Font("Arial", Font.PLAIN, 18));
        labelAge.setBounds(454, 418, labelWidth, labelHeight);
        content.add(labelAge);

        JLabel labelAddress = new JLabel("Address");
        labelAddress.setHorizontalAlignment(SwingConstants.CENTER);
        labelAddress.setForeground(new Color(100, 240, 255));
        labelAddress.setFont(new Font("Arial", Font.PLAIN, 18));
        labelAddress.setBounds(454, 492, labelWidth, labelHeight);
        content.add(labelAddress);

        age = new JTextField();
        age.setHorizontalAlignment(SwingConstants.CENTER);
        age.setColumns(10);
        age.setBounds(575, 430, textFieldWidth, textFieldHeight);
        content.add(age);

        address = new JTextField();
        address.setHorizontalAlignment(SwingConstants.CENTER);
        address.setColumns(10);
        address.setBounds(575, 504, textFieldWidth, textFieldHeight);
        content.add(address);

        JLabel labelCity = new JLabel("City");
        labelCity.setHorizontalAlignment(SwingConstants.CENTER);
        labelCity.setForeground(new Color(100, 240, 255));
        labelCity.setFont(new Font("Arial", Font.PLAIN, 18));
        labelCity.setBounds(454, 562, labelWidth, labelHeight);
        content.add(labelCity);

        city = new JTextField();
        city.setHorizontalAlignment(SwingConstants.CENTER);
        city.setColumns(10);
        city.setBounds(575, 574, textFieldWidth, textFieldHeight);
        content.add(city);

        email = new JTextField();
        email.setHorizontalAlignment(SwingConstants.CENTER);
        email.setColumns(10);
        email.setBounds(575, 641, textFieldWidth, textFieldHeight);
        content.add(email);

        JLabel labelEmail = new JLabel("Email");
        labelEmail.setHorizontalAlignment(SwingConstants.CENTER);
        labelEmail.setForeground(new Color(100, 240, 255));
        labelEmail.setFont(new Font("Arial", Font.PLAIN, 18));
        labelEmail.setBounds(454, 629, labelWidth, labelHeight);
        content.add(labelEmail);

        Button btnLogin = new Button("Login");
        btnLogin.setForeground(new Color(138, 43, 226));
        btnLogin.setBackground(new Color(176, 196, 222));
        btnLogin.setFont(new Font("Rockwell", Font.BOLD, 14));
        btnLogin.setBounds(454, 700, 108, 40);
        btnLogin.addActionListener(e -> {
            try {
                Login login = new Login(null);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
            getWindows()[1].dispose();
        });
        content.add(btnLogin);

        Button btnRegister = new Button("Register");
        btnRegister.setForeground(new Color(153, 50, 204));
        btnRegister.setBackground(new Color(240, 230, 140));
        btnRegister.setFont(new Font("Rockwell", Font.BOLD, 14));
        btnRegister.setBounds(618, 700, 108, 40);
        btnRegister.addActionListener(e -> {
            try {
            String user = username.getText();
            String pass = passwordField.getText();
            String nume = name.getText();
            int varsta = Integer.parseInt(age.getText());
            String adresa = address.getText();
            String oras = city.getText();
            String mail = email.getText();
            CreateAccount newAccount = new CreateAccount(user,pass);
            Client newClient = new Client(newAccount.getLastId(), nume, varsta, adresa, oras, mail);
            //SerializeClients(newClient);
            Login logare = new Login(null);
            getWindows()[1].dispose();
            } catch (IllegalArgumentException | IOException | ClassNotFoundException throwable){
                JOptionPane.showMessageDialog(null,"Nu ai introdus una dintre date sau formatul este invalid","Eroare date",2);
            }
        });
        content.add(btnRegister);

        labelBackground = new JLabel("");
        labelBackground.setBounds(0, 0, 1264, 861);
        labelBackground.setIcon(new ImageIcon(img_background));
        content.add(labelBackground);
    }

    class ResizeComp extends ComponentAdapter {
        public void componentResized(ComponentEvent e) {
            try {
                Image img_background = img_background = ImageIO.read(new File("src/main/resources/register_back.jpg")).getScaledInstance(content.getWidth(), content.getHeight(), Image.SCALE_SMOOTH);
                labelBackground.setBounds(content.getBounds());
                labelBackground.setIcon(new ImageIcon(img_background));

            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}
