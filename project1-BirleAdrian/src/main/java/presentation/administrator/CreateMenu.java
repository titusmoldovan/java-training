package presentation.administrator;

import business.BaseProduct;
import business.CompositeProduct;
import business.MenuItem;
import data.Serializator;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class CreateMenu extends JFrame {
    private JTable table;
    public CreateMenu() throws IOException, ClassNotFoundException {
        initialize();
        this.setVisible(true);
    }
    public void initialize() throws IOException, ClassNotFoundException {
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
        scrollPane.setBounds(246, 79, 950, 712);
        content.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);

        DefaultTableModel tableModel = new DefaultTableModel();
        String[] headers = {"Menu Nr","Products","Price"};
        tableModel.setColumnIdentifiers(headers);
        List<CompositeProduct> compositeProductList = Serializator.compositeProductsDeserialization();
        int id=1;
        StringBuilder sb = null;
        for(CompositeProduct cp : compositeProductList){
            Object[] rowData= new Object[4];
            sb = new StringBuilder();
            for(MenuItem bp : cp.getMenuItems()){
                sb.append(((BaseProduct)bp).getTitle() + " , ");
            }
            rowData[0] = id;
            rowData[1] = sb.toString();
            rowData[2] = cp.computePrice();
            tableModel.addRow(rowData);
            id++;
        }
        table.setModel(tableModel);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.sizeColumnsToFit(1);
    }
}
