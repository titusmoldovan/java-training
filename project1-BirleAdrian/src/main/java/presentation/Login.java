package presentation;

import business.DeliveryService;
import connection.ConnectionFactory;
import model.User;
import presentation.administrator.AdministratorGUI;
import presentation.client.ClientGUI;
import presentation.employee.EmployeeGUI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.File;
import java.io.IOException;
import java.sql.*;

public class Login extends JFrame {
    private Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    private Image img_background = ImageIO.read(new File("src/main/resources/background.png")).getScaledInstance(dim.width/2, dim.height-dim.height/6, Image.SCALE_SMOOTH);

    private JLabel labelBackground;
    private JTextField username;
    private JLabel labelPassword;
    private JPasswordField password;
    private JPanel content;
    private Button loginBtn;
    private Button registerBtn;
    private Connection connection;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private DeliveryService ds;
    public Login(DeliveryService deliveryService) throws IOException, ClassNotFoundException {
        initialize();
        this.setVisible(true);
        ds = deliveryService;
    }
    public void initialize(){
        //Frame
        content = new JPanel();
        content.setLayout(null);
        this.setContentPane(content);
        this.setTitle("Food Delivery Management by Birle - Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(dim.width/2,dim.height-dim.height/6);
        this.setLocation(dim.width/2 - this.getSize().width/2,dim.height/2 - this.getSize().height/2);
        addComponentListener((ComponentAdapter) new ResizeComp());

        //Components
        JLabel labelUser = new JLabel("Username");
        labelUser.setForeground(new Color(30, 144, 255));
        labelUser.setFont(new Font("Arial Black", Font.PLAIN, 16));
        labelUser.setHorizontalAlignment(SwingConstants.CENTER);
        labelUser.setBounds(88, 372, 147, 60);
        content.add(labelUser);

        username = new JTextField();
        username.setBounds(63, 432, 191, 39);
        content.add(username);
        username.setColumns(10);

        labelPassword = new JLabel("Password");
        labelPassword.setForeground(new Color(30, 144, 255));
        labelPassword.setHorizontalAlignment(SwingConstants.CENTER);
        labelPassword.setFont(new Font("Arial Black", Font.PLAIN, 16));
        labelPassword.setBounds(88, 481, 147, 60);
        content.add(labelPassword);

        password = new JPasswordField();
        password.setBounds(63, 536, 191, 39);
        content.add(password);

        loginBtn = new Button("Login");
        loginBtn.setForeground(new Color(123, 104, 238));
        loginBtn.setFont(new Font("Arial", Font.BOLD, 16));
        loginBtn.setBackground(new Color(255, 165, 0));
        loginBtn.setBounds(90, 610, 140, 40);
        loginBtn.addActionListener(e -> {
            connection = null;
            statement = null;
            resultSet = null;
            String query = "SELECT * FROM deliverymanagement.user WHERE username=? AND password=?";
            try{
                if(username.getText().isEmpty() || password.getText().isEmpty()){
                    throw new SQLException();
                }
                String user = username.getText();
                String pass = password.getText();
                connection = ConnectionFactory.getConnection();
                statement = connection.prepareStatement(query);
                statement.setString(1, user);
                statement.setString(2, pass);
                statement.executeQuery();
                resultSet = statement.getResultSet();
                if(resultSet == null){
                    throw new SQLException();
                }
                else{
                    resultSet.next();
                    int id = resultSet.getInt("iduser");
                    String username = resultSet.getString("username");
                    String type = resultSet.getString("type");
                    User utilizator = new User(id,username,type);
                    switch (type) {
                        case "Administrator" -> {
                            AdministratorGUI adminGUI = new AdministratorGUI(utilizator,ds);
                            getWindows()[0].dispose();
                        }
                        case "Employee" -> {
                            EmployeeGUI employeeGUI = new EmployeeGUI(utilizator,ds);
                            getWindows()[0].dispose();
                        }
                        default -> {
                            ClientGUI clientGUI = new ClientGUI(utilizator,ds);
                            getWindows()[0].dispose();
                        }
                    }
                }
            } catch (SQLException throwables){
                JOptionPane.showMessageDialog(null,"Datele introduse sunt incorecte sau nu ai introdus una dintre date ! Verifica din nou !","Eroare logare",2);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            } finally {
                ConnectionFactory.close(statement);
                ConnectionFactory.close(connection);
                ConnectionFactory.close(resultSet);
            }

        });
        content.add(loginBtn);

        registerBtn = new Button("Register");
        registerBtn.setForeground(new Color(123, 104, 238));
        registerBtn.setFont(new Font("Arial", Font.BOLD, 16));
        registerBtn.setBackground(new Color(255, 165, 0));
        registerBtn.setBounds(90, 680, 140, 40);
        registerBtn.addActionListener(e -> {
            try {
                Registration regFrame = new Registration();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            getWindows()[0].dispose();
        });
        content.add(registerBtn);

        labelBackground = new JLabel("");
        labelBackground.setBounds(0, 0, 1264, 861);
        labelBackground.setIcon(new ImageIcon(img_background));
        content.add(labelBackground);
    }
    class ResizeComp extends ComponentAdapter {
        public void componentResized(ComponentEvent e) {
            try {
                Image img_background = img_background = ImageIO.read(new File("src/main/resources/background.png")).getScaledInstance(content.getWidth(), content.getHeight(), Image.SCALE_SMOOTH);
                labelBackground.setBounds(content.getBounds());
                labelBackground.setIcon(new ImageIcon(img_background));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeliveryService ds = new DeliveryService();
        Login login = new Login(ds);
    }
}
