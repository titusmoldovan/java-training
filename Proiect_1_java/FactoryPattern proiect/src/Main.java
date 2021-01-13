public class Main {

   public static void main (String[] args) {
	  ProductFactory pf = new ProductFactory();
	  
	  System.out.println("Current prices:\n------------------");
	  Product prod1 = pf.getProduct("TV");
	  prod1.getPrice();

      Product prod2 = pf.getProduct("MONITOR");
      prod2.getPrice();

      Product prod3 = pf.getProduct("LAPTOP");
      prod3.getPrice();
   }
}

/*
In Factory Pattern, cream obiectul fara a expune clientului logica de creatie si 
ne referim la obiectul nou creat folosind o interfata comuna.

Vom crea o interfata Product si clase concrete de implementare a acestei interfete.
Vom folosi instante diferite de tipul "Product", dar initializate ca un tip
particular de obiect de care avem nevoie la momentul respectiv,
deoarece fiecare functie generala este definita pentru fiecare subclasa in parte
in functie de particularitatile subclasei respective.

*/