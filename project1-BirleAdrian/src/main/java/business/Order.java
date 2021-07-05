package business;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int orderID;
    private int clientID;
    private Date orderDate;
    private double totalPrice;
    public Order(int orderId,int cliendId,Date orderDate,double totalPrice){
        this.orderID = orderId;
        this.clientID = cliendId;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
    }
    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public int getClientID() {
        return clientID;
    }
    public void setClientID(int clientID) {
        this.clientID = clientID;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public int hashCode(){
        return (int) this.orderID*(this.orderDate.hashCode()%100);
    }
}
