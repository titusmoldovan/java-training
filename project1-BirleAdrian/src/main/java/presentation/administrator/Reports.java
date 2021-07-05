package presentation.administrator;
import business.BaseProduct;
import business.MenuItem;
import business.Order;
import data.Serializator;
import model.Client;

import java.awt.*;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Reports implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    public static List<Order> timeIntervalOrders(int startHour,int endHour) throws IOException, ClassNotFoundException {
        HashMap<Order,Collection<MenuItem>> collectionHashMap= Serializator.ordersDeserialization();
        List<Order> orderList = new ArrayList<>();
        for(Map.Entry<Order,Collection<MenuItem>> entry : collectionHashMap.entrySet()){
            orderList.add(entry.getKey());
        }
        orderList = orderList.stream()
                .filter(order -> order.getOrderDate().getHours() > startHour && order.getOrderDate().getHours() < endHour)
                .collect(Collectors.toList());
        return orderList;
    }
    public static Set<MenuItem> productsOrderedMoreThanValue(int nrTimes) throws IOException, ClassNotFoundException {
        HashMap<Order, Collection<MenuItem>> orders = Serializator.ordersDeserialization();
        List<MenuItem> items = new ArrayList<>();
        for(Map.Entry<Order,Collection<MenuItem>> entry : orders.entrySet()) {
            items.addAll(entry.getValue());
        }
        Set<MenuItem> auxiliary = new HashSet<>();
        HashMap<MenuItem,Integer> newHashMap = new HashMap<>();
        for(MenuItem mi : items){
            Integer i = newHashMap.get(mi);
            newHashMap.put(mi,(i==null) ? 1 : i+1);
        }
       for(Map.Entry<MenuItem,Integer> entry : newHashMap.entrySet()){
           if(entry.getValue()>=nrTimes){
               auxiliary.add(entry.getKey());
           }
       }
        return auxiliary;
    }
    public static Set<Client> clientsThatOrderMoreThanASpecifiedTime(int nrTimes,double value) throws IOException, ClassNotFoundException {

        List <Client> clients = Serializator.clientsDeserialization();
        Set <Client> finalList = new HashSet<>();

        HashMap<Order, Collection<MenuItem>> orders = Serializator.ordersDeserialization();
        List<Order> orderList = new ArrayList<>();
        for(Map.Entry<Order,Collection<MenuItem>> entry : orders.entrySet()){
            orderList.add(entry.getKey());
        }
        HashMap<Order,Integer> newHashMap = new HashMap<>();
        for(Order o : orderList){
            Integer i = newHashMap.get(o.getClientID());
            newHashMap.put(o,(i==null) ? 1 : i+1);

        }
        List<Integer> clientsId = new ArrayList<>();
        for(Map.Entry<Order,Integer> entry : newHashMap.entrySet()){
            if(entry.getValue()>nrTimes && entry.getKey().getTotalPrice()> value){
                clientsId.add(entry.getKey().getClientID());
            }
        }
        for(Client c : clients){
            for(Integer i : clientsId){
                if(c.getId() == i){
                    finalList.add(c);
                }
            }
        }

        return finalList;
    }
    public static Set<MenuItem> productsOrderedOnASpecifiedDay(String day) throws IOException, ClassNotFoundException {
        Set <MenuItem> menuItems = new HashSet<>();
        HashMap<Order, Collection<MenuItem>> orders = Serializator.ordersDeserialization();
        List<Order> orderList = new ArrayList<>();
        for(Map.Entry<Order,Collection<MenuItem>> entry : orders.entrySet()){
            String oDay = getDayFromDate(entry.getKey().getOrderDate());
            if(day.equals(oDay)){
                menuItems.addAll(entry.getValue());
            }
        }

        return menuItems;
    }
    public static String getDayFromDate(Date date){
        DateFormat format=new SimpleDateFormat("EEEE");
        String finalDay=format.format(date);
        return finalDay;
    }
}
