import java.util.ArrayList;
import java.util.List;

public class Project {//pizza delivery
    public static void main(String[] args) {

        Pizza p1=new Pizza(doughType.puffy,pizzaSize.Family,pizzaName.Carnivora,50);
        Pizza p2=new Pizza(doughType.crispy,pizzaSize.Medium,pizzaName.Carnivora,35);
        Pizza p3=new Pizza(doughType.puffy,pizzaSize.Small,pizzaName.California,20);
        Pizza p4=new Pizza(doughType.crispy,pizzaSize.Family,pizzaName.Chicago,50);
        Client c1=new Client(1,"Strada Crinilor, nr. 10","0745061243");
        Client c2=new Client(2,"Strada Crinilor, nr. 110","0747261243");
        Client c3=new Client(3,"Strada Crinilor, nr. 102","0741261243");
        Client c4=new Client(4,"Strada Crinilor, nr. 123","0742261243");
        Client c5=new Client(5,"Strada Crinilor, nr. 34","0745361243");
        List<Toppings> l1=new ArrayList<>();
        l1.add(Toppings.Olives);
        l1.add(Toppings.Cheese);
        PizzaWithToppings p11=new PizzaWithToppings(p1,l1);
        Order o1=new Order(c1, p11.getPrice(), 1,OrderStatus.in_process,p11);
        Order o2=new Order(c1, p11.getPrice(), 1,OrderStatus.in_process,p11);
        l1.add(Toppings.Bacon);
        l1.remove(Toppings.Cheese);
        PizzaWithToppings p21=new PizzaWithToppings(p3,l1);
        Order o3=new Order(p1,c2, p1.getPrice(), 1,OrderStatus.in_process);
        Order o4=new Order(c3, p1.getPrice(), 1,OrderStatus.in_process,p21);
        //Decorator
        System.out.println("-------------------------Before toppings adding");
        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());
        System.out.println("-------------------------After toppings adding with decorator");
        System.out.println(p11.getDescription());
        System.out.println(p21.getDescription());
        //Observer
        o1.status=OrderStatus.delivering;
        o3.status=OrderStatus.delivering;
        o4.status=OrderStatus.delivering;
        List<Order> orders=new ArrayList<>();
        orders.add(o1);
        orders.add(o3);
        orders.add(o4);

        Observer ob1=new Client();
        ob1=c1;
        Observer ob2=new Client();
        ob2=c2;
        Observer ob3=new Client();
        ob3=c3;
        List<Observer> observers=new ArrayList<>();
        observers.add(ob1);
        observers.add(ob2);
        observers.add(ob3);
        Delivery d1=new Delivery(observers,orders);
        System.out.println("-------------------------Observer-> Send messages, announcing clients that pizza is ready and on its way ");
        d1.notifyObservers();





    }
}
