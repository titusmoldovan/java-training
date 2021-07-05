package presentation.administrator;
import business.BaseProduct;
import business.CompositeProduct;
import business.DeliveryService;
import business.MenuItem;
import data.ReadProducts;
import data.Serializator;
import model.Client;
import model.User;
import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//import java.awt.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;

public class AdministratorGUI extends JFrame implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private JTable table;
    private int currentRow = 0;
    User utilizator;
    private DeliveryService ds;
    public AdministratorGUI(User u,DeliveryService ds) throws IOException, ClassNotFoundException {
        initialize();
        this.setVisible(true);
        utilizator = u;
        this.ds = ds;
    }
    public void initialize() throws IOException, ClassNotFoundException {
        JPanel content = new JPanel();
        content.setLayout(null);
        this.setContentPane(content);
        this.setTitle("Food Delivery Management by Birle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width/2,dim.height-dim.height/6);
        this.setLocation(dim.width/2 - this.getSize().width/2,dim.height/2 - this.getSize().height/2);
        JButton btnImport = new JButton("Import Products");
        btnImport.setBounds(38, 471, 126, 44);
        btnImport.addActionListener(e -> {
            try {
                ReadProducts rp = new ReadProducts();
                showDataToTable();
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnImport);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(201, 119, 983, 716);
        content.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                currentRow = table.getSelectedRow();
            }
        });
        table.getModel().addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent e) {
                try {
                    showDataToTable();
                } catch (IOException | ClassNotFoundException ioException) {
                    ioException.printStackTrace();
                }
            }
        });
        showDataToTable();
        scrollPane.setViewportView(table);

        JButton btnRaports = new JButton("Raports");
        btnRaports.setBounds(38, 543, 126, 44);
        btnRaports.addActionListener(e -> {
            RapoarteGUI rapoarte = new RapoarteGUI();
            getWindows()[0].dispose();
        });
        content.add(btnRaports);

        JButton btnMenu = new JButton("Create Menu");
        btnMenu.setBounds(38, 618, 126, 44);
        btnMenu.addActionListener(e -> {
            try {
                int rows[] = table.getSelectedRows();
                if(rows.length==0){
                    CreateMenu createMenuGUI = new CreateMenu();
                    getWindows()[0].dispose();
                }
                else {
                    CompositeProduct cp = new CompositeProduct();
                    for (int i = 0; i < rows.length; i++) {
                        int r = table.getSelectedRows()[i] + 1;
                        String title = table.getValueAt(r, 1).toString();
                        double rating = Double.parseDouble(table.getValueAt(r, 2).toString());
                        double calories = Double.parseDouble(table.getValueAt(r, 3).toString());
                        double protein = Double.parseDouble(table.getValueAt(r, 4).toString());
                        double fat = Double.parseDouble(table.getValueAt(r, 5).toString());
                        double sodium = Double.parseDouble(table.getValueAt(r, 6).toString());
                        double price = Double.parseDouble(table.getValueAt(r, 7).toString());
                        BaseProduct bp = new BaseProduct(title, rating, calories, protein, fat, sodium, price);
                        cp.addMenuItem(bp);
                    }
                    List<CompositeProduct> compositeProducts = new ArrayList<>();
                    compositeProducts.add(cp);
                    Serializator.compositeProductsSerialization(compositeProducts);
                    CreateMenu createMenuGUI = new CreateMenu();
                    getWindows()[0].dispose();
                }
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnMenu);

        JButton btnAdd = new JButton("Add product");
        btnAdd.setBounds(38, 228, 126, 44);
        btnAdd.addActionListener(e -> {
            try {
                List<MenuItem> newItems = Serializator.newProductsDeserialization();
                BaseProduct b = constructModelFromDialog("Adaugare produs nou");
                newItems.add(b);
                Serializator.newProductsSerialization(newItems);
                Object[] rowData = new Object[8];
                rowData[0] = table.getModel().getRowCount()+1;
                rowData[1] = b.getTitle();
                rowData[2] = b.getRating();
                rowData[3] = b.getCalories();
                rowData[4] = b.getProtein();
                rowData[5] = b.getFat();
                rowData[6] = b.getSodium();
                rowData[7] = b.getPrice();
                DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
                tableModel.addRow(rowData);
                showDataToTable();
            } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnAdd);

        JButton btnDelete = new JButton("Delete Product");
        btnDelete.setBounds(38, 392, 126, 44);
        btnDelete.addActionListener(e -> {
            int row = table.getSelectedRow();
            String title = table.getValueAt(row,1).toString();
            BaseProduct bp = new BaseProduct();
            bp.setTitle(title);
            try {
                DeliveryService ds = new DeliveryService();
                ds.deleteMenuItem(bp);
                showDataToTable();
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }

        });
        content.add(btnDelete);

        JButton btnEdit = new JButton("Edit Product");
        btnEdit.setBounds(38, 310, 126, 44);
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt){
                try {
                    List<MenuItem> menuItems = Serializator.productsDeserialization();
                    int row = table.getSelectedRow();
                    DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
                    Vector rowData = tableModel.getDataVector().get(currentRow);
                    MenuItem oldItem = menuItems.get(row);
                    String title = rowData.get(1).toString();
                    double rating = Double.parseDouble(rowData.get(2).toString());
                    double calories = Double.parseDouble(rowData.get(3).toString());
                    double protein = Double.parseDouble(rowData.get(4).toString());
                    double fat = Double.parseDouble(rowData.get(5).toString());
                    double sodium = Double.parseDouble(rowData.get(6).toString());
                    double price = Double.parseDouble(rowData.get(7).toString());
                    MenuItem newItem = new BaseProduct(title,rating,calories,protein,fat,sodium,price);
                    DeliveryService ds = new DeliveryService();
                    ds.editMenuItem(oldItem,newItem);
                    showDataToTable();
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        content.add(btnEdit);
    }
    public Object[] constructPane(){
        Class type = BaseProduct.class;
        int nrFields = 8;
        Object[] objects = new Object[2*nrFields];
        Field field;
        for(int i=2;i<2*nrFields;i++){
            if(i%2==0){
                field = type.getDeclaredFields()[i/2];
                field.setAccessible(true);
                objects[i]=field.getName();
            }
            else {
                objects[i] = new JTextField();
            }
        }
        return objects;
    }
    public BaseProduct constructModelFromDialog(String message) throws InstantiationException, IllegalAccessException {
        Class type;
        Object[] objects;
        type = BaseProduct.class;
        objects = constructPane();
        BaseProduct element = (BaseProduct) type.newInstance();
        Field field;
        int i = 0;
        if (JOptionPane.showConfirmDialog(null, objects, message, JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            for (Field f : type.getDeclaredFields()) {
                f.setAccessible(true);
                JTextField text = (JTextField) objects[2 * i + 1];
                if(i==0){
                    i++;
                    continue;
                }
                if(i==1){
                    f.set(element,text.getText());
                }
                else{
                    f.set(element,Double.parseDouble(text.getText()));
                }
                i++;
            }
            return element;
        }
        else{
            return null;
        }
    }
    public void showDataToTable() throws IOException, ClassNotFoundException {
        File f = new File("products.ser");
        if (f.exists()) {
            List<MenuItem> menuItemList = Serializator.productsDeserialization();
            List<MenuItem> newItems = Serializator.newProductsDeserialization();
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
}
