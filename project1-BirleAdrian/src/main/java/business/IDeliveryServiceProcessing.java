package business;
import com.itextpdf.text.DocumentException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

public interface IDeliveryServiceProcessing extends Serializable {
    static final long serialVersionUID = 1L;
    public void addMenuItem(MenuItem m) throws IOException, ClassNotFoundException;
    public void deleteMenuItem(MenuItem m) throws IOException, ClassNotFoundException;
    public void editMenuItem(MenuItem oldItem,MenuItem newItem) throws IOException, ClassNotFoundException;
    public int createNewOrder(Order o, Collection<MenuItem> m) throws IOException, ClassNotFoundException;
    public double computePrice(Order o);
    public void generateBill(Order o,Collection<MenuItem> m) throws FileNotFoundException, DocumentException;
}
