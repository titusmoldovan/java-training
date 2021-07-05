package business;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import data.Serializator;

import java.io.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


public class DeliveryService extends Observable implements IDeliveryServiceProcessing, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    //Fonturi
    private static Font catFont = new Font(Font.FontFamily.COURIER, 20, Font.BOLD,BaseColor.ORANGE);
    private static Font blueFont = new Font(Font.FontFamily.COURIER, 16, Font.NORMAL, BaseColor.BLUE);

    private HashMap<Order, Collection<MenuItem>> orders;
    private List<MenuItem> menu;
    private Order order;
    public DeliveryService() throws IOException, ClassNotFoundException {
        this.orders = Serializator.ordersDeserialization();
        this.menu = Serializator.productsDeserialization();
        List<MenuItem> newMenuItems = Serializator.newProductsDeserialization();
        menu.addAll(newMenuItems);
    }

    @Override
    public void addMenuItem(MenuItem m) throws IOException, ClassNotFoundException {
        List<MenuItem> productList = Serializator.newProductsDeserialization();
        productList.add((BaseProduct) m);
        Serializator.newProductsSerialization(productList);
    }
    @Override
    public void deleteMenuItem(MenuItem m) throws IOException, ClassNotFoundException {
    List<MenuItem> productList = Serializator.productsDeserialization();
    List<MenuItem> newProdList = Serializator.newProductsDeserialization();
    productList = productList.stream().filter(e -> !e.getTitle().equals(m.getTitle())).collect(Collectors.toList());
    newProdList = newProdList.stream().filter(e -> !e.getTitle().equals(m.getTitle())).collect(Collectors.toList());
    File f = new File("products.ser");
    f.delete();
    File f1 = new File("newProducts.ser");
    f1.delete();
    Serializator.productsSerialization(productList);
    Serializator.newProductsSerialization(newProdList);
    }
    @Override
    public void editMenuItem(MenuItem oldItem , MenuItem newItem) throws IOException, ClassNotFoundException {
        List<MenuItem> items = Serializator.productsDeserialization();
        items = items.stream().filter(e -> !e.getTitle().equals(oldItem.getTitle())).collect(Collectors.toList());
        items.add(newItem);
        File f = new File("products.ser");
        f.delete();
        Serializator.productsSerialization(items);
    }

    @Override
    public int createNewOrder(Order o, Collection<MenuItem> menuItems) throws IOException, ClassNotFoundException {
        Collection<MenuItem> auxiliary;
        HashMap<Order,Collection<MenuItem>> orders = Serializator.ordersDeserialization();
        boolean found = false;
       for(Map.Entry<Order,Collection<MenuItem>> element : orders.entrySet()){
           if(element.getKey().hashCode() == o.hashCode()){
               auxiliary = element.getValue();
               auxiliary.addAll(menuItems);
               orders.replace(element.getKey(),auxiliary);
               setChanged();
               o.setOrderID(element.getKey().getOrderID());
               notifyObservers(o);
               found = true;
           }
       }
       if(!found){
           orders.put(o,menuItems);
       }
        Serializator.ordersSerialization(orders);
        return 0;
    }

    @Override
    public double computePrice(Order o) {
        return 0;
    }
    @Override
    public void generateBill(Order order,Collection<MenuItem> menuItems) throws FileNotFoundException, DocumentException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document,new FileOutputStream("Order-" + order.getOrderID() + ".pdf"));
        document.open();
        document.addTitle("Order with id: " + (order.getOrderID()));
        Paragraph title = new Paragraph("Order with id: " + (order.getOrderID()), catFont);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        document.add(new Paragraph(" "));
        document.add(new Paragraph("Order date : " + order.getOrderDate()+"\n"));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));
        document.add(new Paragraph("----Products----",blueFont));
        double price = 0;
        for(MenuItem m : menuItems) {
            double currPrice = ((BaseProduct) m).getPrice();
            String titlu = ((BaseProduct) m).getTitle();
            document.add(new Paragraph("Product name: " + titlu + "Price: " + currPrice));
            price = price + m.computePrice();
        }
        document.add(new Paragraph("Total price: " + price));
        document.close();
    }
    @Override
    public int hashCode(){
        return (int) order.getOrderID()*(order.getOrderDate().hashCode()%100);
    }
}
