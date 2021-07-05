package presentation.administrator;

import business.MenuItem;
import business.Order;
import data.Serializator;
import model.Client;
import model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class RapoarteGUI extends JFrame implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private JTable table;
    private JTextField startHourText;
    private JTextField endHourText;
    private JTextField nrTimesText;
    private JTextField nrOriText;
    private JTextField valoareText;
    public RapoarteGUI() {
        initialize();
        this.setVisible(true);
    }
    public void initialize() {
        JPanel content = new JPanel();
        content.setLayout(null);
        this.setContentPane(content);
        this.setTitle("Food Delivery Management by Birle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width / 2, dim.height - dim.height / 6);
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(560, 58, 666, 780);
        content.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        JLabel labelInterval = new JLabel("Interval orar");
        labelInterval.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labelInterval.setHorizontalAlignment(SwingConstants.CENTER);
        labelInterval.setBounds(133, 48, 225, 54);
        content.add(labelInterval);

        startHourText = new JTextField();
        startHourText.setBounds(30, 126, 179, 54);
        content.add(startHourText);
        startHourText.setColumns(10);

        endHourText = new JTextField();
        endHourText.setColumns(10);
        endHourText.setBounds(295, 126, 179, 54);
        content.add(endHourText);

        JLabel lblNewLabel = new JLabel("-");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(219, 137, 66, 22);
        content.add(lblNewLabel);

        JButton btnRaport1 = new JButton("Raport 1");
        btnRaport1.setBounds(184, 201, 126, 45);
        btnRaport1.addActionListener(e -> {
            try {
                int startHour = Integer.parseInt(startHourText.getText());
                int endHour = Integer.parseInt(endHourText.getText());
                List<Order> orderList = Reports.timeIntervalOrders(startHour,endHour);
                DefaultTableModel model = new DefaultTableModel();
                String[] headers = new String[]{"OrderID","ClientID","Date","TotalPrice"};
                model.setColumnIdentifiers(headers);
                for(Order o : orderList){
                    Object[] rowData = new Object[4];
                    rowData[0] = o.getOrderID();
                    rowData[1] = o.getClientID();
                    rowData[2] = o.getOrderDate();
                    rowData[3] = o.getTotalPrice();
                    model.addRow(rowData);
                }
                table.setModel(model);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnRaport1);

        JLabel lblProduseComandateDe = new JLabel("Produse comandate de mai multe ori");
        lblProduseComandateDe.setHorizontalAlignment(SwingConstants.CENTER);
        lblProduseComandateDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblProduseComandateDe.setBounds(104, 277, 318, 54);
        content.add(lblProduseComandateDe);

        nrTimesText = new JTextField();
        nrTimesText.setBounds(69, 342, 159, 54);
        content.add(nrTimesText);
        nrTimesText.setColumns(10);

        JButton btnRaport2 = new JButton("Raport 2");
        btnRaport2.setBounds(307, 347, 135, 45);
        btnRaport2.addActionListener(e -> {
            try {
                int nrTimes = Integer.parseInt(nrTimesText.getText());
                Set<MenuItem> menuItems = Reports.productsOrderedMoreThanValue(nrTimes);
                DefaultTableModel model = new DefaultTableModel();
                String[] headers = new String[]{"Title","Rating","Calories","Protein","Fat","Sodium","Price"};
                model.setColumnIdentifiers(headers);
                for(MenuItem mi : menuItems){
                    Object[] rowData = new Object[7];
                    rowData[0] = mi.getTitle();
                    rowData[1] = mi.getRating();
                    rowData[2] = mi.getCalories();
                    rowData[3] = mi.getProtein();
                    rowData[4] = mi.getFat();
                    rowData[5] = mi.getSodium();
                    rowData[6] = mi.computePrice();
                    model.addRow(rowData);
                }
                table.setModel(model);

            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnRaport2);

        JLabel lblClientiCareAu = new JLabel("Clienti care au comandata de mai multe ori");
        lblClientiCareAu.setHorizontalAlignment(SwingConstants.CENTER);
        lblClientiCareAu.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblClientiCareAu.setBounds(79, 407, 384, 54);
        content.add(lblClientiCareAu);

        nrOriText = new JTextField();
        nrOriText.setBounds(130, 472, 140, 54);
        content.add(nrOriText);
        nrOriText.setColumns(10);

        valoareText = new JTextField();
        valoareText.setColumns(10);
        valoareText.setBounds(376, 472, 140, 54);
        content.add(valoareText);

        JButton btnRaport3 = new JButton("Raport 3");
        btnRaport3.setBounds(184, 537, 135, 54);
        btnRaport3.addActionListener(e -> {

            try {
                int nrOri = Integer.parseInt(nrOriText.getText());
                int valoare = Integer.parseInt(valoareText.getText());
                Set<Client> clients = Reports.clientsThatOrderMoreThanASpecifiedTime(nrOri,valoare);
                DefaultTableModel model = new DefaultTableModel();
                String[] headers = new String[]{"Id","Name","Age","Address","City","Email"};
                model.setColumnIdentifiers(headers);
                for(Client c : clients){
                    Object[] rowData = new Object[6];
                    rowData[0] = c.getId();
                    rowData[1] = c.getName();
                    rowData[2] = c.getAge();
                    rowData[3] = c.getAddress();
                    rowData[4] = c.getCity();
                    rowData[5] = c.getEmail();
                    model.addRow(rowData);
                }
                table.setModel(model);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnRaport3);

        JLabel lblNewLabel_1 = new JLabel("Valoare");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(283, 476, 83, 46);
        content.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Nr. ori");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1.setBounds(30, 472, 83, 46);
        content.add(lblNewLabel_1_1);

        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"luni", "marti", "miercuri", "joi", "vineri", "sambata", "duminica"}));
        comboBox.setBounds(51, 643, 179, 54);
        content.add(comboBox);

        JButton btnRaport4 = new JButton("Raport 4");
        btnRaport4.setBounds(295, 652, 130, 45);
        btnRaport4.addActionListener(e -> {
            try {
                String day = comboBox.getSelectedItem().toString();
                Set<MenuItem> menuItems = Reports.productsOrderedOnASpecifiedDay(day);
                DefaultTableModel model = new DefaultTableModel();
                String[] headers = new String[]{"Title","Rating","Calories","Protein","Fat","Sodium","Price"};
                model.setColumnIdentifiers(headers);
                for(MenuItem mi : menuItems){
                    Object[] rowData = new Object[7];
                    rowData[0] = mi.getTitle();
                    rowData[1] = mi.getRating();
                    rowData[2] = mi.getCalories();
                    rowData[3] = mi.getProtein();
                    rowData[4] = mi.getFat();
                    rowData[5] = mi.getSodium();
                    rowData[6] = mi.computePrice();
                    model.addRow(rowData);
                }
                table.setModel(model);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnRaport4);
    }
}
