package data;
import business.BaseProduct;
import business.CompositeProduct;
import business.MenuItem;
import business.Order;
import model.Client;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class Serializator implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    //Serializare Produse
    public static void productSerialization(MenuItem bp) throws IOException, ClassNotFoundException {
        List<MenuItem> productList = productsDeserialization();
        productList.add(bp);
        FileOutputStream fileOut = new FileOutputStream("clients.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(productList);
        out.close();
        fileOut.close();
        productList.forEach(System.out::println);
    }
    public static void productsSerialization(List<MenuItem> baseProducts) throws IOException, ClassNotFoundException {
        List<MenuItem> productList = productsDeserialization();
        productList.addAll(baseProducts);
        File f = new File("products.ser");
        f.delete();
        FileOutputStream fileOut = new FileOutputStream("products.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(productList);
        out.close();
        fileOut.close();
    }
    public static List<MenuItem> productsDeserialization() throws IOException, ClassNotFoundException {
        File f = new File("products.ser");
        List<MenuItem> productList = new ArrayList<>();
        if(f.exists()) {
            FileInputStream fileIn = new FileInputStream("products.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            productList = (List<MenuItem>) in.readObject();
            in.close();
            fileIn.close();
        }
        return productList;
    }
    //Serializare Orders
    public static void ordersSerialization(HashMap<Order,Collection<MenuItem>> newOrders) throws IOException, ClassNotFoundException {
    HashMap<Order,Collection<MenuItem>> orders = ordersDeserialization();
    orders.putAll(newOrders);
    FileOutputStream fileOut = new FileOutputStream("orders.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
    out.writeObject(orders);
    out.close();
    fileOut.close();
    }
    public static HashMap<Order, Collection<MenuItem>> ordersDeserialization() throws IOException, ClassNotFoundException {
        File f = new File("orders.ser");
        HashMap<Order,Collection<MenuItem>> ordersList = new HashMap<>();
        if(f.exists()) {
            FileInputStream fileIn = new FileInputStream("orders.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ordersList = (HashMap<Order,Collection<MenuItem>>) in.readObject();
            in.close();
            fileIn.close();
        }
        return ordersList;
    }
    //Serializare Clienti
    public static void clientsSerialization(List<Client> clientList) throws IOException, ClassNotFoundException {
        List<Client> clients = clientsDeserialization();
        clients.addAll(clientList);
        FileOutputStream fileOut = new FileOutputStream("clients.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(clients);
        out.close();
        fileOut.close();
    }
    public static List<Client> clientsDeserialization() throws IOException, ClassNotFoundException {
        File f = new File("clients.ser");
        List<Client> clients = new ArrayList<>();
        if(f.exists()) {
            FileInputStream fileIn = new FileInputStream("clients.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            clients = (List<Client>) in.readObject();
            in.close();
            fileIn.close();
        }
        return clients;
    }
    //Serializare Produse Noi
    public static void newProductsSerialization(List<MenuItem> newProducts) throws IOException, ClassNotFoundException {
        List<MenuItem> productList = newProductsDeserialization();
        productList.addAll(newProducts);
        File f = new File("newProducts.ser");
        f.delete();
        FileOutputStream fileOut = new FileOutputStream("newProducts.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(productList);
        out.close();
        fileOut.close();
        productList.forEach(System.out::println);
    }
    public static List<MenuItem> newProductsDeserialization() throws IOException, ClassNotFoundException {
        File f = new File("newProducts.ser");
        List<MenuItem> productList = new ArrayList<>();
        if(f.exists()) {
            FileInputStream fileIn = new FileInputStream("newProducts.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            productList = (List<MenuItem>) in.readObject();
            in.close();
            fileIn.close();
        }
        return productList;
    }
    //Serializare Produse compuse
    public static List<CompositeProduct> compositeProductsDeserialization() throws IOException, ClassNotFoundException {
        File f = new File("compositeProducts.ser");
        List<CompositeProduct> productList = new ArrayList<>();
        if(f.exists()) {
            FileInputStream fileIn = new FileInputStream("compositeProducts.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            productList = (List<CompositeProduct>) in.readObject();
            in.close();
            fileIn.close();
        }
        return productList;
    }
    public static void compositeProductsSerialization(List<CompositeProduct> compositeProducts) throws IOException, ClassNotFoundException {
        List<CompositeProduct> productList = compositeProductsDeserialization();
        productList.addAll(compositeProducts);
        File f = new File("compositeProducts.ser");
        f.delete();
        FileOutputStream fileOut = new FileOutputStream("compositeProducts.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(productList);
        out.close();
        fileOut.close();
    }
}
