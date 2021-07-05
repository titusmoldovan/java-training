package presentation.employee;
import business.*;
import business.MenuItem;
import data.Serializator;
import model.User;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//import java.awt.*;
import java.awt.*;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;
import java.util.List;

public class EmployeeGUI extends JFrame implements Serializable,Observer {
    @Serial
    private static final long serialVersionUID = 1L;
    private JTable table;
    private DeliveryService ds;
    User utilizator;
    public EmployeeGUI(User u,DeliveryService ds){
        initialize();
        this.setVisible(true);
        utilizator = u;
        this.ds = ds;
        ds.addObserver(this);
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
        scrollPane.setBounds(136, 153, 994, 656);
        content.add(scrollPane);
        table = new JTable();
        scrollPane.setViewportView(table);

        JButton btnIstoric = new JButton("Istoric Comenzi");
        btnIstoric.setBounds(979, 47, 160, 52);
        btnIstoric.addActionListener(e->{
            try {
                HashMap<Order, Collection<MenuItem>> orders = Serializator.ordersDeserialization();
                List<MenuItem> menuItemList = new ArrayList<>();
                StringBuilder sb = null;
                DefaultTableModel model = new DefaultTableModel();
                String[] headers = {"OrderID","ClientID","Date","Products"};
                model.setColumnIdentifiers(headers);
                for(Map.Entry<Order,Collection<MenuItem>> elements : orders.entrySet()){
                    Object[] rowData = new Object[4];
                    rowData[0] = elements.getKey().getOrderID();
                    rowData[1] = elements.getKey().getClientID();
                    rowData[2] = elements.getKey().getOrderDate();
                    menuItemList = (List<MenuItem>) elements.getValue();
                    sb = new StringBuilder();
                    for(MenuItem m : menuItemList){
                        sb.append(((BaseProduct)m).getTitle());
                        sb.append(",");
                    }
                    sb.deleteCharAt(sb.length()-1);
                    assert sb != null;
                    rowData[3] = sb.toString();
                    model.addRow(rowData);
                    System.out.println(rowData);
                }
                table.setModel(model);
                table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
                table.sizeColumnsToFit(3);
            } catch (IOException | ClassNotFoundException ioException) {
                ioException.printStackTrace();
            }
        });
        content.add(btnIstoric);
    }

    @Override
    public void update(Observable o, Object arg) {
        JOptionPane.showMessageDialog(null,"Comanda noua !","Succes",0);
    }
}
