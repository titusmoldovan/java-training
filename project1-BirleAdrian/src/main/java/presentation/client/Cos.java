package presentation.client;

import business.BaseProduct;
import business.DeliveryService;
import business.MenuItem;
import business.Order;
import com.itextpdf.text.DocumentException;
import data.Serializator;
import model.Client;
import model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class Cos extends JFrame{
    private List<MenuItem> items;
    private JTable table;
    private User utilizator;
    private DeliveryService ds;
    public Cos(List<MenuItem> items,User u,DeliveryService deliveryService) throws IOException, ClassNotFoundException {
        initialize();
        this.setVisible(true);
        this.items = items;
        utilizator = u;
        showDataToTable();
        this.ds = deliveryService;

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
        scrollPane.setBounds(72, 158, 1141, 730);
        content.add(scrollPane);
        table = new JTable();
        scrollPane.setViewportView(table);
        JButton btnConfirma = new JButton("Confirma");
        btnConfirma.setBounds(1017, 37, 160, 53);
        btnConfirma.addActionListener(e -> {
            try {
                List<Client> clients = Serializator.clientsDeserialization();
                Client client = new Client();
                for(Client c : clients){
                    if(c.getId() == utilizator.getIduser()){
                        client.setId(c.getId());
                    }
                }
                double totalPrice = 0;
                for(MenuItem mi : this.items){
                    totalPrice = totalPrice + ((BaseProduct)mi).computePrice();
                }
                HashMap<Order, Collection<MenuItem>> hashMap = Serializator.ordersDeserialization();
                int nrOrders = 0;
                for(Map.Entry<Order,Collection<MenuItem>> entry : hashMap.entrySet()){
                    nrOrders++;
                }
                DeliveryService ds = new DeliveryService();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                Order newOrder = new Order(nrOrders+1,client.getId(),date,totalPrice);
                ds.createNewOrder(newOrder,this.items);
                ds.generateBill(newOrder,this.items);
                JOptionPane.showMessageDialog(null,"Comanda a fost plasata cu succes!","Success!",0);
            } catch (IOException | ClassNotFoundException | DocumentException ioException) {
                ioException.printStackTrace();
            }

        });
        content.add(btnConfirma);
        JButton btnAnuleaza = new JButton("Anuleaza");
        btnAnuleaza.setBounds(800, 37, 160, 53);
        btnAnuleaza.addActionListener(e -> {
            try {
                ClientGUI clientGUI = new ClientGUI(utilizator,ds);
                getWindows()[0].dispose();
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnAnuleaza);
    }
    public void showDataToTable() throws IOException, ClassNotFoundException {
            DefaultTableModel model = new DefaultTableModel();
            String[] headers = {"ProductID", "Title", "Rating", "Calories", "Protein", "Fat", "Sodium", "Price"};
            model.setColumnIdentifiers(headers);
            int index = 1;
            double totalPrice = 0;
            for (MenuItem m : this.items) {
                Object[] rowData = new Object[8];
                rowData[0] = index;
                rowData[1] = ((BaseProduct) m).getTitle();
                rowData[2] = ((BaseProduct) m).getRating();
                rowData[3] = ((BaseProduct) m).getCalories();
                rowData[4] = ((BaseProduct) m).getProtein();
                rowData[5] = ((BaseProduct) m).getFat();
                rowData[6] = ((BaseProduct) m).getSodium();
                rowData[7] = ((BaseProduct) m).getPrice();
                index++;
                model.addRow(rowData);
                totalPrice = totalPrice + ((BaseProduct) m).getPrice();
            }
            Object[] rowData = new Object[8];
            rowData[7] = totalPrice;
            model.addRow(rowData);
            table.setModel(model);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            table.sizeColumnsToFit(1);
        }
}
