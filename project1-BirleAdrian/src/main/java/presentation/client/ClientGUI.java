package presentation.client;
import business.BaseProduct;
import business.CompositeProduct;
import business.DeliveryService;
import business.MenuItem;
import data.Serializator;
import model.User;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClientGUI extends JFrame {
    User utilizator;
    private JTable table;
    private JTable tableMenu;
    private DeliveryService ds;
    public ClientGUI(User u, DeliveryService ds) throws IOException, ClassNotFoundException {
        initialize();
        this.setVisible(true);
        utilizator = u;
        showDataToTable();
        showDataToTableMenu();
        this.ds = ds;
    }
    public void initialize(){
        JPanel content = new JPanel();
        content.setLayout(null);
        this.setContentPane(content);
        this.setTitle("Food Delivery Management by Birle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width/2,dim.height-dim.height/6);
        this.setLocation(dim.width/2 - this.getSize().width/2,dim.height/2 - this.getSize().height/2);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 106, 611, 744);
        content.add(scrollPane);
        table = new JTable();
        scrollPane.setViewportView(table);
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(623, 106, 631, 744);
        content.add(scrollPane_1);
        tableMenu = new JTable();
        scrollPane_1.setViewportView(tableMenu);
        JButton btnCos = new JButton("Cos");
        btnCos.setBounds(993, 11, 157, 58);
        btnCos.addActionListener(e -> {
            try {
                int[] rowsTable1 = table.getSelectedRows();
                int[] rowsTable2 = tableMenu.getSelectedRows();
                List<MenuItem> menuItems = new ArrayList<>();
                for(int i=0;i<rowsTable1.length;i++){
                    int r1 = rowsTable1[i];
                    String title = table.getValueAt(r1,1).toString();
                    double rating = Double.parseDouble(table.getValueAt(r1,2).toString());
                    double calories = Double.parseDouble(table.getValueAt(r1,3).toString());
                    double protein = Double.parseDouble(table.getValueAt(r1,4).toString());
                    double fat = Double.parseDouble(table.getValueAt(r1,5).toString());
                    double sodium = Double.parseDouble(table.getValueAt(r1,6).toString());
                    double price = Double.parseDouble(table.getValueAt(r1,7).toString());
                    MenuItem bp = new BaseProduct(title,rating,calories,protein,fat,sodium,price);
                    menuItems.add(bp);
                }
                List<CompositeProduct> compositeProducts = Serializator.compositeProductsDeserialization();
                for(int i=0;i<rowsTable2.length;i++){
                    int r1 = rowsTable2[i];
                    menuItems.addAll(compositeProducts.get(r1).getMenuItems());
                }
                Cos cosGUI = new Cos(menuItems,utilizator,ds);
                getWindows()[0].dispose();
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnCos);
        JButton btnCriteria = new JButton("Criterii");
        btnCriteria.setBounds(800, 11, 157, 58);
        btnCriteria.addActionListener(e -> {
            try {
                Criteria criteriaGUI = new Criteria(utilizator);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
            getWindows()[0].dispose();
        });
        content.add(btnCriteria);
    }
    public void showDataToTable() throws IOException, ClassNotFoundException {
        File f = new File("products.ser");
        if (f.exists()) {
            java.util.List<business.MenuItem> menuItemList = Serializator.productsDeserialization();
            List<business.MenuItem> newItems = Serializator.newProductsDeserialization();
            menuItemList.addAll(newItems);
            DefaultTableModel model = new DefaultTableModel();
            String[] headers = {"ProductID", "Title", "Rating", "Calories", "Protein", "Fat", "Sodium", "Price"};
            model.setColumnIdentifiers(headers);
            int index = 1;
            for (MenuItem m : menuItemList) {
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
            }
            table.setModel(model);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            table.sizeColumnsToFit(1);
        }
    }
    public void showDataToTableMenu() throws IOException, ClassNotFoundException {
        File f = new File("compositeProducts.ser");
        if (f.exists()) {
            List<CompositeProduct> menuItemList = Serializator.compositeProductsDeserialization();
            DefaultTableModel model = new DefaultTableModel();
            String[] headers = {"Menu.Nr", "Products","Price"};
            model.setColumnIdentifiers(headers);
            int index = 1;
            StringBuilder sb = null;
            for(CompositeProduct cp : menuItemList){
                Object[] rowData= new Object[4];
                sb = new StringBuilder();
                for(MenuItem bp : cp.getMenuItems()){
                    sb.append(((BaseProduct)bp).getTitle() + " , ");
                }
                rowData[0] = index;
                rowData[1] = sb.toString();
                rowData[2] = cp.computePrice();
                model.addRow(rowData);
                index++;
            }
            tableMenu.setModel(model);
            tableMenu.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
            tableMenu.sizeColumnsToFit(1);
        }
    }
}
